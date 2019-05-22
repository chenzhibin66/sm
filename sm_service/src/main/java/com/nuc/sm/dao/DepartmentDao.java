package com.nuc.sm.dao;

import com.nuc.sm.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:44 2019/5/22
 */
@Repository("departmentDao")
public interface DepartmentDao {

    void insert(Department department);

    void delete(Integer id);

    void update(Department department);

    Department selectById(Integer id);

    List<Department> selectAll();
}
