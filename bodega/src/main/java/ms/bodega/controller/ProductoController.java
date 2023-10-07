package ms.bodega.controller;

import ms.bodega.entity.Producto;
import ms.bodega.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/producto")
@RestController
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/buscar")
    public List<Producto> buscarProducto(){
        return productoService.buscarProducto();
    }
    @GetMapping("/buscar/{id}")
    public Optional<Producto> buscarProduct(@PathVariable int id){
        return productoService.buscarProducto(id);
    }

    @PostMapping("/crear")
    public Producto crearPro(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }

    @DeleteMapping("borrar/{id}")
    public void borrarPro(@PathVariable int id){
        productoService.borrarProducto(id);
    }

    @PutMapping("/actualizar")
    public Producto actualizar(@RequestBody Producto producto){
        return productoService.actualizarProducto(producto);
    }

    @GetMapping("/buscarNombre/{nombre}")
    public Producto buscarProductoNombre(@PathVariable String nombre){
        return productoService.buscarProductoNombre(nombre);
    }
}

