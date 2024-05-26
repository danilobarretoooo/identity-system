package com.unijorge.controller;

import com.unijorge.model.Denuncia;
import com.unijorge.service.DenunciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class DenunciaController {
    @Autowired
    private DenunciaService denunciaService;

    @GetMapping("/denuncias")
    public String listDenuncias(Model model) {
        model.addAttribute("denuncias", denunciaService.findAll());
        return "denuncias";
    }

    @GetMapping("/denuncia")
    public String denunciaForm(Model model) {
        model.addAttribute("denuncia", new Denuncia());
        return "denuncia";
    }

    @PostMapping("/denuncia")
    public String submitDenuncia(Denuncia denuncia) {
        denunciaService.save(denuncia);
        return "redirect:/denuncias";
    }
}
