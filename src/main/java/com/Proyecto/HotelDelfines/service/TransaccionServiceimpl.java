
package com.Proyecto.HotelDelfines.service;

import com.Proyecto.HotelDelfines.Model.transaccion;
import com.Proyecto.HotelDelfines.repository.TransaccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionServiceimpl implements TransaccionService{
    
    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public transaccion newtransaccion(  transaccion newtransaccion) {
        
        return transaccionRepository .save(newtransaccion);
    }

    @Override
    public Iterable<transaccion> getAll() {

        return this.transaccionRepository.findAll();

    }

    @Override
    public transaccion modifytransaccion(transaccion Transaccion) {

        Optional<transaccion> TransaccionEncontrado=this.transaccionRepository.findById(Transaccion.getIdtransaccion());
        if (TransaccionEncontrado.get()!=null) {
            
            TransaccionEncontrado.get().setEstado(Transaccion.getEstado());
            TransaccionEncontrado.get().setMonto(Transaccion.getMonto());
            TransaccionEncontrado.get().setTipo(Transaccion.getTipo());
            
            return this.newtransaccion(TransaccionEncontrado.get());
        }
        
        return null;

    }

    @Override
    public Boolean deletetransaccion(Long idtransaccion) {
        this.transaccionRepository.deleteById(idtransaccion);
        return true;
        
    }
    
}
