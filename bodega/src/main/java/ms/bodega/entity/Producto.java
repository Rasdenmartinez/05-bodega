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

    public Producto(Integer id, String nombre, Double precio, String codigo, Integer existencia) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.existencia = existencia;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                ", existencia=" + existencia +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
}