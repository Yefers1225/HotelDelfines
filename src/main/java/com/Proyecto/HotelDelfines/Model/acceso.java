
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class acceso {
    
    @Id
    @Column
    private Long idacceso;
    
   @OneToOne
        private usuario usuario;
        
    
    @OneToOne
        private modulo modulo;
        
    
    @Column
    private String permiso;
    
}
