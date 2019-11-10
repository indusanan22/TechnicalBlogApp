package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.service.PostService;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }
}
