package com.arturlogan.javaaidio.service;

import com.arturlogan.javaaidio.entities.Usuario;

public interface UsuarioService {

    Usuario findById(Long id);
    Usuario create(Usuario usuarioCriado);

}
