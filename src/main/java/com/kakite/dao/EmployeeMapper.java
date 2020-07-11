package com.kakite.dao;

import com.kakite.entities.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    Employee queryById(Integer id);

}
