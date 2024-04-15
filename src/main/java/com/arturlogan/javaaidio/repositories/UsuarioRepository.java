package com.arturlogan.javaaidio.repositories;

import com.arturlogan.javaaidio.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existeNumeroDaConta(String numeroConta);
}
