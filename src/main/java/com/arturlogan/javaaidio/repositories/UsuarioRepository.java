package com.arturlogan.javaaidio.repositories;

import com.arturlogan.javaaidio.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM Usuario u WHERE u.conta.numero = :numeroConta")
    boolean existeNumeroDaConta(String numeroConta);
}
