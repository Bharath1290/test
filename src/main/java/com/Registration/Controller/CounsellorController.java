package com.Registration.Controller;

import com.Registration.Entity.Counsellor;
import com.Registration.Service.CounsellorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CounsellorController {
    @Autowired
    private CounsellorService counsellorService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("counsellor", new Counsellor());
        return "loginView";
    }
    @PostMapping("/login")
    public String handleLogin(Counsellor c,Model model){
        Counsellor obj = counsellorService.loginCheck(c.getEmail(), c.getPwd());
        if(obj == null){
            model.addAttribute("errmsg","Invalid credentials");
            return "loginView";
        }
        return "redirect:Dashboard";
    }
    @GetMapping("/dashboard")
    public String buildDashboard(Model model){
        return "dashboard";
    }
    @GetMapping("/register")
    public String regPage(Model model){
        model.addAttribute("counsellor", new Counsellor());
        return "registerView";
    }
    @GetMapping("/forgot-pwd")
    public String recoverPwdPage(Model model){
        return "forgotPwdView";
    }
    @PostMapping("/register")
    public String handleRegistration(Counsellor c,Model model){
        String msg = counsellorService.saveCounsellor(c);
        model.addAttribute("msg", msg);
        return "registerView";
    }
    @GetMapping("/recover-pwd")
    public String recoverPwd(@RequestParam String email, Model model){
        boolean status = counsellorService.recoverPwd(email);
        if(status){
            model.addAttribute("msg", "Password sent to your email");
        }else{
            model.addAttribute("errmsg", "Invalid email");
        }
        return "forgotPwdView";
    }
}
