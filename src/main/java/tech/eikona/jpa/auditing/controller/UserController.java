package tech.eikona.jpa.auditing.controller;

import tech.eikona.jpa.auditing.model.User;
import tech.eikona.jpa.auditing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/users")
    public String createUser(@ModelAttribute("user") User user) {
   
       userService.create(user);
       return "user";
    }
    
    @GetMapping("/user/new")
    public String showUserForm(Model model)
    {
      
        User user = new User();
        model.addAttribute("user", user);
        return "user";
    }
    
    
    
    
    
    
}