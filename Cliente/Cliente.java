/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author cocav
 */
public class Cliente {
    private String Nit;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private int Telefono;
    private int Nacimiento;

    public Cliente() {
    }

    public Cliente(String Nit, String Nombres, String Apellidos, String Direccion, int Telefono, int Nacimiento) {
        this.Nit = Nit;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Nacimiento = Nacimiento;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(int Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

   
 
    
    
}
