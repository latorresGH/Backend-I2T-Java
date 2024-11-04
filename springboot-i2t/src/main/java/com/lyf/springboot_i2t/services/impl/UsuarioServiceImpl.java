package com.lyf.springboot_i2t.services.impl;


import com.lyf.springboot_i2t.entidades.TipoUsuario;
import com.lyf.springboot_i2t.entidades.Usuario;
// import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuario;
import com.lyf.springboot_i2t.repositorio.UsuarioRepository;
import com.lyf.springboot_i2t.repositorio.TipoUsuarioRepository;
import org.springframework.transaction.annotation.Transactional;

// import com.lyf.springboot_i2t.repositorio.UsuarioTipoUsuarioRepository;
import com.lyf.springboot_i2t.services.UsuarioService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    
    private final UsuarioRepository usuarioRepository;
    private final TipoUsuarioRepository tipoUsuarioRepository;

    
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, TipoUsuarioRepository tipoUsuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    @Transactional
    public Usuario crearUsuario(Usuario usuario, List<Long> tiposUsuarioIds) {
        // Guarda primero el usuario
        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        // Busca los tipos de usuario y los asocia al usuario
        List<TipoUsuario> tiposUsuario = tipoUsuarioRepository.findAllById(tiposUsuarioIds);
        usuarioGuardado.setTiposUsuario(tiposUsuario);

        // Actualiza el usuario guardado con los tipos de usuario asignados
        return usuarioRepository.save(usuarioGuardado);
    }



    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        return usuarioOptional.orElse(null);
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuarioActualizado) {
        if (usuarioRepository.existsById(id)) {
            usuarioActualizado.setId(id);
            return usuarioRepository.save(usuarioActualizado);
        }
        return null;
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Usuario> obtenerUsuariosPorTipoUsuario(Long tipoUsuarioId) {
        return usuarioRepository.findByTiposUsuario_Id(tipoUsuarioId);
    }
}
