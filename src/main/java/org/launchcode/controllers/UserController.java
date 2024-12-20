package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors error, String verify) {
        if(error.hasErrors() || !user.getPassword().equals(verify)){
            model.addAttribute("error", "Something is not right with inputs");
            return "user/add";
        }
        model.addAttribute(new User());
        return "user/index";
    }


}