
package com.Proyecto.HotelDelfines.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class transaccion  {
    
    @Id
    @Column
    private Long idtransaccion;
    
    @Column
    private String tipo;
    
    @Column
    private Double monto;
    
     @Column
    private String estado;
     
    
    @JoinColumn(name = "usuario_idusuario")
    @OneToOne(fetch = FetchType.LAZY)
    private usuario usuario;
    
}
