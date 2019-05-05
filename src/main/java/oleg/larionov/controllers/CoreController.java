package oleg.larionov.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class CoreController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {

        ModelAndView errorMav = new ModelAndView();
        errorMav.addObject("exception", ex)
                .addObject("url", req.getRequestURL())
                .setViewName("error");
        return errorMav;
    }
}
