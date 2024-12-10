
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class habitacion {
    
     @Id
    @Column
    private Long idhabitaciono;
    
    @Column
    private Long numero;
    
    @Column
    private String tipo;
    
    @Column
    private Double tarifa;
    
     @Column
    private String estado;
     
      @Column
    private String descripcion;
      
      @ManyToOne
    private  usuario usuario;
      
      
    
}
