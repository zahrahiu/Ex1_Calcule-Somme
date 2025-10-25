package org.example.calculesomme.Service;

import org.example.calculesomme.Entity.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculService {
    public Double Somme (Nombres nbrs){
        return nbrs.getA()+nbrs.getB();
    }
}
