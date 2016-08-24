package com.erxi.web.controllers;

import com.erxi.dal.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by
 * on 16/8/16.
 * Description:
 */
@Controller
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    public String hello() {
        return "test";
    }

    @RequestMapping(value="/test/form")
    @ResponseBody
    public String hello(String myname,HttpServletResponse response) {
        System.out.println(myname);
        System.out.println(response.getCharacterEncoding());
        return "hello 中 !" + myname;
    }

    @RequestMapping(value="/test/query")
    @ResponseBody
    public String query(int id) {
        return userMapper.selectByPrimaryKey(id).getUserName();
    }
}
