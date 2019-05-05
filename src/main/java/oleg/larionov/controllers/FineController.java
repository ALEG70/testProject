package oleg.larionov.controllers;

import oleg.larionov.models.Fine;
import oleg.larionov.services.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FineController extends CoreController{

    @GetMapping("/fines")
    public String fine(@RequestParam(value = "sec_name", required = false, defaultValue = "%") String sec_name,
                       @RequestParam(value = "license_plate", required = false, defaultValue = "%") String license_plate,
                               Model model){
        model.addAttribute("finesList", fineService.findWithParameters(sec_name,
                license_plate));
        return "fines";
    }

    @GetMapping({"/formFineByOwner"})
    public String formFineByOwner() {
        return "/Forms/formFineByOwner";
    }

    @Autowired
    public void setFineService(FineService fineService) {
        this.fineService = fineService;
    }

    private FineService fineService;
}

