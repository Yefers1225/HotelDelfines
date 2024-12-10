
package com.Proyecto.HotelDelfines.controller;

import com.Proyecto.HotelDelfines.Model.usuario;
import com.Proyecto.HotelDelfines.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping("/nuevo")
    public usuario newUsuario (@RequestBody usuario newUsuario){
    return this.usuarioService.newusuario(newUsuario);
    }
    
    @GetMapping("/mostrar")
    public Iterable<usuario> getAll(){
        return usuarioService.getAll();
    }
    
    @PostMapping("/modificar")
    public usuario updateusuario (@RequestBody usuario Usuario){
        return  this.usuarioService.modifyusuario(Usuario);
    }
    
    @PostMapping (value ="/(id)")
    public Boolean deleteusuario (@PathVariable(value="id")Long id){
    return this.usuarioService.deleteusuario(id);
    
    }
    
}
