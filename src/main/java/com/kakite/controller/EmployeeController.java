package com.kakite.controller;

import com.kakite.entities.Employee;
import com.kakite.exception.MyException;
import com.kakite.exception.MyHttpStatus;
import com.kakite.service.EmployeeService;
import com.kakite.utils.CommonResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class EmployeeController {
    @Resource
    private EmployeeService service;

    @GetMapping(value = "/employee/query/{id}")
    public CommonResult query(@PathVariable("id") Integer id) {
        Employee employee = service.findByName(id);

        if (employee != null) {
            return new CommonResult(200, "success", employee);
        } else {
            return new CommonResult(404, "fail", null);
        }
    }

    @GetMapping(value = "/employee/delete/{id}")
    public CommonResult delete(@PathVariable("id") Integer id) {

        Integer result = service.deleteByName(id);

        if (result > 0) {
            return new CommonResult(200, "success", result);
        } else {
            return new CommonResult(404, "fail", null);
        }
    }

    @PostMapping(value = "/employee/create")
    public CommonResult create(@Valid Employee employee, BindingResult bindingResult) {
        if (bindingResult.getErrorCount() > 0) {
            new CommonResult(MyHttpStatus.SYSTEM_ERROR.getCode(), "exception", new MyException(MyHttpStatus.SYSTEM_ERROR));
        }

        Integer result = service.createEmployee(employee);

        if (result > 0) {
            return new CommonResult(200, "success，插入", result);
        } else {
            return new CommonResult(404, "fail", null);
        }
    }

    @PostMapping(value = "/employee/update")
    public CommonResult update(Employee employee) {
        Integer result = service.updateById(employee);

        if (result > 0) {
            return new CommonResult(200, "success, 修改", result);
        } else {
            return new CommonResult(404, "fail", null);
        }
    }
}
