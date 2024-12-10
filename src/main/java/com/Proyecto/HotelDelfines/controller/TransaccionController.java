
package com.Proyecto.HotelDelfines.controller;

import com.Proyecto.HotelDelfines.Model.transaccion;
import com.Proyecto.HotelDelfines.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaccion")
public class TransaccionController {
    
    @Autowired
    private TransaccionService transaccionService;
    
    @PostMapping("/nuevo")
    public transaccion newtransaccion (@RequestBody transaccion newtransaccion){
    return this.transaccionService.newtransaccion(newtransaccion);
    }
    
    @GetMapping("/mostrar")
    public Iterable<transaccion> getAll(){
        return transaccionService.getAll();
    }
    
    @PostMapping("/modificar")
    public transaccion updatetransaccion (@RequestBody transaccion Transaccion){
        return  this.transaccionService.modifytransaccion(Transaccion);
    }
    
    @PostMapping (value ="/(id)")
    public Boolean deletetransaccion (@PathVariable(value="id")Long id){
    return this.transaccionService.deletetransaccion(id);
    
    }
    
}
