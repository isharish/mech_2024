package com.example.login.controller;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.login.model.User;
import com.example.login.model.User1;
import com.example.login.repository.UserRepository;
import com.example.login.repository.UserRepository1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    UserRepository userrepo;
    @Autowired
    UserRepository1 userrepo1;

    @GetMapping("/")
    public String index() {
        return "index";
    }
    // @GetMapping("/event1")
    // public String event1() {
    // return "reg2";
    // }

    // @RequestMapping("/event1")
    // public String index() {
    // return "reg2";
    // }
    @GetMapping("/event1")
    public String event1(Model model) {
        model.addAttribute("user", new User());
        System.out.println("hoiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        return "reg1";
    }

    @GetMapping("/event2")
    public String event2(Model model) {
        model.addAttribute("user", new User());
        return "reg3";
    }

    @GetMapping("/admin1")
    public List<User> admin1(Model model) {
        List<User> data1 = userrepo.findAll();
        model.addAttribute("data1", data1);
        System.out.println("admin data comes here");
        System.out.println(data1);
        // for(int i=0;i<datas.size();i++){
        // }
        return data1;
    }
    @GetMapping("/admin2")
    public List<User1> admin2(Model model) {
        List<User1> data2 = userrepo1.findAll();
        model.addAttribute("data2", data2);
        System.out.println("admin2 data comes here");
        System.out.println(data2);
        // for(int i=0;i<datas.size();i++){
        // }
        return data2;
    }

    @PostMapping("/store1")
    public String savedata1(@ModelAttribute User user) {
        System.out.println("came here man--------------");
        userrepo.saveAndFlush(user);
        return "redirect:/";
    }

    

    @PostMapping("/store2")
    public String savedata2(@ModelAttribute User1 user1) {
        System.out.println("came here man--------------");
        userrepo1.saveAndFlush(user1);
        return "redirect:/";
    }

}
