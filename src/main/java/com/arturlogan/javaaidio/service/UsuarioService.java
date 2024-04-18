package com.arturlogan.javaaidio.service;

import com.arturlogan.javaaidio.entities.Usuario;
import com.arturlogan.javaaidio.entities.dto.request.UsuarioRequest;

import java.util.List;

public interface UsuarioService {

    Usuario findById(Long id);
    Usuario create(Usuario usuario);
    List<Usuario> listar();

}
