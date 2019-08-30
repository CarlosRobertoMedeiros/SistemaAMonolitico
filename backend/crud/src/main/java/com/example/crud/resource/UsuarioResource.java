package com.example.crud.resource;

import com.example.crud.model.Usuario;
import com.example.crud.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@Api(value = "Cadastro de Usuários", description = "Um Cadastro com os Dados do Usuário")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    @ApiOperation(value = "Lista todos os Usuários")
    public List<Usuario> Listar() {
        return usuarioRepository.findAll();

    }
}
