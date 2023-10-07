package ms.bodega.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PRECIO")
    private Double precio;

    @Column(name = "CODIGO")
    private String codigo;

    @Column(name = "EXISTENCIA")
    private Integer existencia;
}