package com.arturlogan.javaaidio.service.impl;

import com.arturlogan.javaaidio.entities.Usuario;
import com.arturlogan.javaaidio.repositories.UsuarioRepository;
import com.arturlogan.javaaidio.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioCriado) {
        if (usuarioRepository.existeNumeroDaConta(usuarioCriado.getConta().getNumero())){
            throw new IllegalArgumentException("O número dessa conta já existe!");
        }
        return usuarioRepository.save(usuarioCriado);
    }
}
