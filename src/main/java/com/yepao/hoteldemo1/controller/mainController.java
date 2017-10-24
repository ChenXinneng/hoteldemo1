package com.yepao.hoteldemo1.controller;

import com.yepao.hoteldemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class mainController {

    //service类
    //@Autowired
    //private MainService mainService;

    /**
     * 进入主页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> toHome()throws Exception{
        return new HashMap<String,Object>();
    }
}
