package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;

@Controller
public class UserController {

    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String register() {
        return "users/registration";
    }

    @RequestMapping(method = RequestMethod.POST, value = "users/login")
    public String login(User user) {

        return "redirect:/posts";
    }

    @RequestMapping(method = RequestMethod.POST, value = "users/logout")
    public String logout() {
        return "redirect:/users/login";
    }

}
