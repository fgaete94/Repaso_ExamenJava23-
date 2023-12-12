/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author pipeg
 */
public class Computador extends Producto {
    
    private  String capacidadRAM,marca;

    public Computador() {
    }

    public Computador(String capacidadRAM, String marca, int id, int precio, String nombre) {
        super(id, precio, nombre);
        this.capacidadRAM = capacidadRAM;
        this.marca = marca;
    }

    public String getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(String capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() +  " Computador{" + "capacidadRAM=" + capacidadRAM + ", marca=" + marca + '}';
    }

   
    
    
}
