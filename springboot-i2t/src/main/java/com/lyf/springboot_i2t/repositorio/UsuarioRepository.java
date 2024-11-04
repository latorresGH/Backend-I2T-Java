package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByTiposUsuario_Id(Long tipoUsuarioId);

}
