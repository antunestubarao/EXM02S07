package com.senai.herois.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.herois.Model.Heroi;

@Service
public class HeroiService {

    @Autowired
    private HeroiRepository heroiRepository;

    public Heroi inserir(Heroi heroi) {
        // Implement logic to save the new Heroi instance
        // For example, using a repository or database service

        heroiRepository.adicionar(heroi);
        return heroi;

    }

    public List<Heroi> consultar() {
        return heroiRepository.consultar();
    }
}
