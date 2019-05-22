package com.nuc.sm.service;

import com.nuc.sm.entity.Department;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:54 2019/5/22
 */
public interface DepartmentService {
    void add(Department department);

    void remove(Integer id);

    void edit(Department department);

    Department get(Integer id);

    List<Department> getAll();
}
