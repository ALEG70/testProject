package oleg.larionov.controllers;

import oleg.larionov.models.FineType;
import oleg.larionov.services.FineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FineTypeController extends CoreController{

    @GetMapping({"/fineTypes"})
    public String fineTypes(Model model) {
        List<FineType> fineTypes = fineTypeSvc.findAll();
        model.addAttribute("finesTypes", fineTypes);
        return "fineTypes";
    }

    @GetMapping({"/topFines"})
    public String topFines(@RequestParam(value = "limit", required = false, defaultValue = "5") Integer limit, Model model) {
        List<FineType> fineTypes = fineTypeSvc.pickTopFines(limit);
        model.addAttribute("finesTypes", fineTypes);
        model.addAttribute("limit", limit);
        return "topFines";
    }

    @Autowired
    public void setFineTypeSvc(FineTypeService fineType) {
        this.fineTypeSvc = fineType;
    }

    private FineTypeService fineTypeSvc;

}
