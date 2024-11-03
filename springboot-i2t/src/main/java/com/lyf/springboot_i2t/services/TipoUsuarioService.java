package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.TipoUsuario;

import java.util.List;

public interface TipoUsuarioService {
    List<TipoUsuario> findAll();
    TipoUsuario findById(Long id);
    TipoUsuario save(TipoUsuario tipoUsuario);
    void delete(Long id);
}
