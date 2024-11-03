package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.TipoUsuario;
import com.lyf.springboot_i2t.repositorio.TipoUsuarioRepository;
import com.lyf.springboot_i2t.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    @Override
    public List<TipoUsuario> findAll() {
        return tipoUsuarioRepository.findAll();
    }

    @Override
    public TipoUsuario findById(Long id) {
        return tipoUsuarioRepository.findById(id).orElse(null);
    }

    @Override
    public TipoUsuario save(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public void delete(Long id) {
        tipoUsuarioRepository.deleteById(id);
    }
}
