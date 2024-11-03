package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
    
    // Busca usuarios por un tipo específico de usuario
    List<Usuario> findByTiposUsuarioId(Long tipoUsuarioId);
}
