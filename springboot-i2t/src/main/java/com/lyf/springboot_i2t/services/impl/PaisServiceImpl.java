package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.Pais;
import com.lyf.springboot_i2t.repositorio.PaisRepository;
import com.lyf.springboot_i2t.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public Pais findById(Long id) {
        return paisRepository.findById(id).orElse(null);
    }

    @Override
    public Pais save(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public void delete(Long id) {
        paisRepository.deleteById(id);
    }
}
