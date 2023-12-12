/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author pipeg
 */
public class Impresora extends Producto{
    
    
    private String marca,tipo;

    public Impresora() {
    }

    public Impresora(String marca, String tipo, int id, int precio, String nombre) {
        super(id, precio, nombre);
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +  " Impresora{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }

    
    
}
