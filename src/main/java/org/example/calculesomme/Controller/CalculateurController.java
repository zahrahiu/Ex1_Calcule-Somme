package org.example.calculesomme.Controller;

import org.example.calculesomme.Entity.Nombres;
import org.example.calculesomme.Service.CalculService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/calculs")
public class CalculateurController {
    private CalculService calculService;
    public CalculateurController(CalculService calculService) {
        this.calculService = calculService;
    }

    @PostMapping
    public ResponseEntity<Double> calcul_somme(@RequestBody Nombres nbrs) {
        Double somme = calculService.Somme (nbrs);
        if(nbrs!=null) return  ResponseEntity.ok(somme);{
            return ResponseEntity.internalServerError().build();
        }
    }

}
