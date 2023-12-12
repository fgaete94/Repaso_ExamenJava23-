/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.IColeccion;
import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author pipeg
 */
public class Coleccion implements IColeccion {
    
    private static ArrayList <Producto> listaProductos = new ArrayList<>();

    public Coleccion() {
    }
    

    @Override
    public boolean agregarProducto(Producto prod) {
        
        return listaProductos.add(prod);
    }

    @Override
    public ArrayList<Producto> listar() {
        
        ArrayList <Producto> lista = new ArrayList<>();
        
        for (Producto producto : listaProductos) {
            
            producto.getId();
            producto.getNombre();
            producto.getPrecio();
            
            lista.add(producto);
        }
        return lista;
    }
    
}
