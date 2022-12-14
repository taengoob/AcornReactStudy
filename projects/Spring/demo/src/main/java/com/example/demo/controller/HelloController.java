package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.service.commonService;

@Controller
public class HelloController {

    @Autowired
    commonService service;

    @RequestMapping("/")
    public String SayHello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        List<String> list = service.testDBConnection();
        System.out.println(list);
        list.add(name);
        model.addAttribute("nameList", list);
        model.addAttribute("currentTime", service.selectDbTime());
        return "home";
    }

    @RequestMapping("/hello")
    public String SayHello2(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model)
    {
        List<String> list = new ArrayList<>();
        list.add(name);
        model.addAttribute("nameList", list);
        return "home";
    }
}