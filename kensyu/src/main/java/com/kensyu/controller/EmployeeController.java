package com.kensyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kensyu.service.EmployeeService;

@RequestMapping("employee/*")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("index")
    public String index(Model model) {

        //idに紐づく名前を取得する。
        String name = employeeService.getName(1);

        //名前を設定
        model.addAttribute("name", name);

        return "employee";
    }

    @GetMapping("index2")
    public String index2(Model model) {

        long id = 4;
        //idに紐づく名前を取得する。
        String name = employeeService.getName(id);
        //idに紐づく性別を取得する。
        String gender = employeeService.getGendrr(id);

        //名前を設定
        model.addAttribute("name", name);
        //性別を設定
        model.addAttribute("gender", gender);

        return "employee2";
    }

}
