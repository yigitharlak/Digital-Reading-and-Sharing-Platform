package com.readShare.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.readShare.Model.User;
import com.readShare.Model.Login;
import com.readShare.Service.UserService;

public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("Login");
        mav.addObject("Login", new Login());
        return mav;
    }
    @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
    public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
                                     @ModelAttribute("Login") Login login) {

        ModelAndView mav = null;
        User user = userService.validate(login);
        if(null != user) {
            mav = new ModelAndView("welcome");
            mav.addObject("user", user);
        }
        else {
            mav = new ModelAndView("Login");
            mav.addObject("message", "Wrong email or password");
        }
        return mav;
    }
}
