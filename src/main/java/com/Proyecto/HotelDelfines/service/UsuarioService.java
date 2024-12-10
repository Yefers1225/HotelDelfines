
package com.Proyecto.HotelDelfines.service;

import com.Proyecto.HotelDelfines.Model.usuario;


public interface UsuarioService {
    
    usuario newusuario(usuario newUsuario);
    Iterable<usuario> getAll();
    usuario modifyusuario (usuario Usuario);
    Boolean deleteusuario (Long idusuario);
    
}
