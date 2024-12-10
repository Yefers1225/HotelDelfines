
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class servicio {
    
    @Id
    @Column
    private Long idservicio;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private Double tarifa;
    
    @ManyToOne
    private  usuario usuario;
    
}
