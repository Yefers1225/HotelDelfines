
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class modulo {
    
    @Id
    @Column
    private Long idmodulo;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
}
