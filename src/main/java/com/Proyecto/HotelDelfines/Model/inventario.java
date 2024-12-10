
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class inventario {
   
    @Id
    @Column
    private Long idinventario;
    
    @Column
    private String nombre;
    
    @Column
    private String categoria;
    
    @Column
    private Long cantidad;
    
     @Column
    private String estado;
    
}
