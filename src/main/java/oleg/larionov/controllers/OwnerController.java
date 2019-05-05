package oleg.larionov.controllers;

import oleg.larionov.models.Owner;
import oleg.larionov.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class OwnerController extends CoreController{

    @GetMapping("/owner")
    public String owner(@RequestParam(value = "id_owner")
                        Integer id_owner, Model model){

        Owner owner = ownerService.findById(id_owner);
        model.addAttribute("owner", owner);
        return "owner";
    }

    @GetMapping({"/allOwners"})
    public String listOwners(Model model) {
        List<Owner> listOwners = ownerService.findAll();
        model.addAttribute("ownerList", listOwners);
        return "owners";
    }

    private OwnerService ownerService;

    @Autowired
    public void setOwnerService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
}
