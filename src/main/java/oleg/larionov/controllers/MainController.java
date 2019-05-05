package oleg.larionov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController extends CoreController{

    @GetMapping({"/", "/index"})
    public String showIndexPage() {
        return "index";
    }

    @GetMapping({"/db"})
    public String showDbImagePage() {
        return "db";
    }

}

