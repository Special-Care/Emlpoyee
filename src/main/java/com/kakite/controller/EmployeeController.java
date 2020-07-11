package com.kakite.controller;

import com.kakite.entities.Employee;
import com.kakite.service.EmployeeService;
import com.kakite.utils.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
}
