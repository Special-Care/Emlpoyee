package com.kakite.service;

import com.kakite.dao.EmployeeMapper;
import com.kakite.entities.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EmployeeService {
    @Resource
    private EmployeeMapper mapper;

    public void setMapper(EmployeeMapper mapper) {
        this.mapper = mapper;
    }

    public EmployeeMapper getMapper() {
        return mapper;
    }

    public Employee findByName(Integer id) {
        return mapper.queryById(id);
    }
    public Integer deleteByName(Integer id) {
        return mapper.deleteById(id);
    }
    public Integer createEmployee(Employee employee) {
        return mapper.createEmployee(employee);
    }
    public Integer updateById(Employee employee) {
        return mapper.updateById(employee);
    }
}
