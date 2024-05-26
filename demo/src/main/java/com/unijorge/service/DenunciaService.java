package com.unijorge.service;

import com.unijorge.model.Denuncia;
import com.unijorge.repository.DenunciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DenunciaService {

    @Autowired
    private DenunciaRepository denunciaRepository;

    public Denuncia save(Denuncia denuncia) {
        denuncia.setDataHora(LocalDateTime.now());
        denuncia.setStatus("Pendente");
        return denunciaRepository.save(denuncia);
    }

    public List<Denuncia> findAll() {
        return denunciaRepository.findAll();
    }
}
