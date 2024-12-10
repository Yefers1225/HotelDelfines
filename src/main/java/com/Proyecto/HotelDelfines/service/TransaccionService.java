
package com.Proyecto.HotelDelfines.service;

import com.Proyecto.HotelDelfines.Model.transaccion;



public interface TransaccionService {
    
    
    transaccion newtransaccion(transaccion newtransaccion);
    Iterable<transaccion> getAll();
    transaccion modifytransaccion (transaccion Transaccion);
    Boolean deletetransaccion (Long idtransaccion);
}
