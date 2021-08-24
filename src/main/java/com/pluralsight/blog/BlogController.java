package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    @RequestMapping
    public String listsPosts(ModelMap map){
        map.put("title","Blog Posts 1");
        return "home";
    }

}
