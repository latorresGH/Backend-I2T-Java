package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuario;
import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuarioId;
import com.lyf.springboot_i2t.repositorio.UsuarioTipoUsuarioRepository;
import com.lyf.springboot_i2t.services.UsuarioTipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioTipoUsuarioServiceImpl implements UsuarioTipoUsuarioService {

    @Autowired
    private UsuarioTipoUsuarioRepository repository;

    @Override
    public List<UsuarioTipoUsuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<UsuarioTipoUsuario> findById(UsuarioTipoUsuarioId id) {
        return repository.findById(id);
    }

    @Override
    public UsuarioTipoUsuario save(UsuarioTipoUsuario usuarioTipoUsuario) {
        return repository.save(usuarioTipoUsuario);
    }

    @Override
    public void deleteById(UsuarioTipoUsuarioId id) {
        repository.deleteById(id);
    }
}
