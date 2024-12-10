
package com.Proyecto.HotelDelfines.service;

import com.Proyecto.HotelDelfines.Model.usuario;
import com.Proyecto.HotelDelfines.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceimpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public usuario newusuario(  usuario newusuario) {
        
        return usuarioRepository .save(newusuario);
    }

    @Override
    public Iterable<usuario> getAll() {

        return this.usuarioRepository.findAll();

    }

    @Override
    public usuario modifyusuario(usuario Usuario) {

        Optional<usuario> UsuarioEncontrado=this.usuarioRepository.findById(Usuario.getIdusuario());
        if (UsuarioEncontrado.get()!=null) {
            
            UsuarioEncontrado.get().setNombre(Usuario.getNombre());
            UsuarioEncontrado.get().setApellido(Usuario.getApellido());
            UsuarioEncontrado.get().setContraseña(Usuario.getContraseña());
            UsuarioEncontrado.get().setDireccion(Usuario.getDireccion());
            UsuarioEncontrado.get().setEmaill(Usuario.getEmaill());
            UsuarioEncontrado.get().setRol(Usuario.getRol());
            UsuarioEncontrado.get().setTelefono(Usuario.getTelefono());
            
            return this.newusuario(UsuarioEncontrado.get());
        }
        
        return null;

    }

    @Override
    public Boolean deleteusuario(Long idusuario) {
        this.usuarioRepository.deleteById(idusuario);
        return true;
        
    }
    
}
