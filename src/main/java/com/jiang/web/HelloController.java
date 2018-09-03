package com.jiang.web;

import com.jiang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by biu on 2018/8/13.
 */
@RestController
public class HelloController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/hello.html")
    public ModelAndView hello(){
        System.out.print(usersService.test());
        ModelAndView mav = new ModelAndView();
        mav.addObject("name",usersService.test());
        mav.setViewName("index");
        return mav;
    }
}
