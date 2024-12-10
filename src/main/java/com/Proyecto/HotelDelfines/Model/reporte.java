
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class reporte {
    
    @Id
    @Column
    private Long idreporte;
    
    
    @Column
    private String descripcion;
    
    
    @ManyToOne
    private  usuario usuario;
    
}
