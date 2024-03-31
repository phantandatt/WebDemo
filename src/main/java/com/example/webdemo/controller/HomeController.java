package com.example.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
    @GetMapping("/home")
    public ModelAndView getHomePage() {
        ModelAndView andView = new ModelAndView("index");
        return andView;
    }

    @GetMapping("/product")
    public ModelAndView getProductPage() {
        ModelAndView andView = new ModelAndView("product");

        return andView;
    }

    @GetMapping("/product-detail")
    public ModelAndView getProductDetailPage() {
        ModelAndView andView = new ModelAndView("product-detail");
        return andView;
    }
@GetMapping("/cart")
    public ModelAndView gettPage() {
        ModelAndView andView = new ModelAndView("shoping-cart");
        return andView;
    }
}
