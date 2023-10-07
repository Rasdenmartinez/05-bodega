package ms.bodega.service;

import ms.bodega.entity.Producto;
import ms.bodega.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> buscarProducto(){
        return productoRepository.findAll();
    }

    public Optional<Producto> buscarProducto(int id){
        return productoRepository.findById(id);
    }

    public Producto crearProducto(Producto producto){
        return (Producto) productoRepository.save(producto);
    }

    public void borrarProducto(int id){ productoRepository.deleteById(id);
    }

    public Producto actualizarProducto(Producto producto){
        return (Producto) productoRepository.save(producto);
    }
}








