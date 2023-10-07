package ms.bodega.repository;

import ms.bodega.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    public Producto findByNombre(String nombre);
    public Producto findByExistencia(Integer existencia);
    public Producto findByCodigo(String codigo);
    public Producto findByPrecio(Double precio);

}
