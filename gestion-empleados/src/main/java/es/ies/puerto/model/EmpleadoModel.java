package es.ies.puerto.model;

import java.util.Objects;

/**
 * Clase EmpleadoModel que contiene los datos personales y laborales de cualquier empleado como tal.
 * 
 * @author cdiagal
 * @version 1.0.0
 */

public abstract class EmpleadoModel {
    private String nombre;
    private int edad;
    private double salarioBase;

    public EmpleadoModel(){}

    public EmpleadoModel(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Métodos toString y equals()
     */

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmpleadoModel)) {
            return false;
        }
        EmpleadoModel empleadoModel = (EmpleadoModel) o;
        return Objects.equals(nombre, empleadoModel.nombre) && edad == empleadoModel.edad && salarioBase == empleadoModel.salarioBase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, salarioBase);
    }
    
    /**
     * Método para calcular el salario final de la clase.
     * @return Salario final del empleado.
     */
    public abstract double calcularSalarioFinal();
        
    /**
     * Muestra la información básica del empleado.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salarioBase);
    }
}
