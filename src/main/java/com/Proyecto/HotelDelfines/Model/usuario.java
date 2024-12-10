
package com.Proyecto.HotelDelfines.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class usuario {
    
    @Id
    @Column
    private Long idusuario;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String emaill;
    
     @Column
    private String contraseña;
     
      @Column
    private String direccion;
      
       @Column
    private String telefono;
       
        @Column
    private Long rol;
        
        @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private transaccion transaccion;
        
        @OneToMany (mappedBy = "usuario")
        private List<servicio>servicio;
        
        @OneToMany (mappedBy = "usuario")
        private List<reserva>reserva;
        
        @OneToMany (mappedBy = "usuario")
        private List<reporte>reporte;
        
        @OneToMany (mappedBy = "usuario")
        private List<habitacion>habitacion;
        
        
}
