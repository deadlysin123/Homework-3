package com.cis3368.Homework3.Main.Controller;


import com.cis3368.Homework3.Main.Models.Sportrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


    @Autowired
    Sportrepo sportrepo;

    // create a homepage by mapping the list object from the index file and put all the elements in the model homepage
    @RequestMapping("/")
    public ModelAndView homepage(){
        ModelAndView home = new ModelAndView("index");
        home.addObject("list", sportrepo.findAll());

        return home;
    }
}
