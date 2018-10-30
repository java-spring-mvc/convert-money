package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @RequestMapping("/convert")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("show");
        return modelAndView;
    }

    @PostMapping("/chuyendoi")
    public String convertForm(@RequestParam  double usd, @RequestParam double gia,  Model model){

        model.addAttribute("usd", usd);
        model.addAttribute("gia", gia);
        double vnd = (gia * usd);
        model.addAttribute("vnd", vnd);

        return "chuyendoi";

    }
}
