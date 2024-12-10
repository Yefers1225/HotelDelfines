
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class reserva {
    
    @Id
    @Column
    private Long idreserva;
    
    
    @Column
    private String estado;
    
    @ManyToMany
    private List<usuario>usuario;
      
}
