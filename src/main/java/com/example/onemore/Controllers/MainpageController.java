package com.example.onemore.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/mainpage")
public class MainpageController {

    @GetMapping("/show")
    public ModelAndView showMainpage(Model model) {
        return new ModelAndView("mainpage");
    }
}
