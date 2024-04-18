package com.arturlogan.javaaidio.service.impl;

import com.arturlogan.javaaidio.entities.Usuario;
import com.arturlogan.javaaidio.exceptions.UsuarioJaCadastradoException;
import com.arturlogan.javaaidio.repositories.UsuarioRepository;
import com.arturlogan.javaaidio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Component
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
    public Usuario create(Usuario usuario) {
        if (usuarioRepository.existeNumeroDaConta(usuario.getConta().getNumero())){
            throw new UsuarioJaCadastradoException("O número dessa conta já existe!");
        }
        usuarioRepository.save(usuario);

        return usuario;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
