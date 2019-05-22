package com.nuc.sm.controller;

import com.nuc.sm.entity.Department;
import com.nuc.sm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:59 2019/5/22
 */
@Controller("departmentController")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    //  /department/list.do    / department_list.jsp

    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Department> list = departmentService.getAll();
        request.setAttribute("LIST", list);
        request.getRequestDispatcher("../department_list.jsp").forward(request, response);
    }
}
