package es.ies.puerto.model;


/**
 * Clase Programa que instancia los diferentes empleados y muestra la información de cada uno.
 * 
 * @author cdiagal
 * @version 1.0.0
 */

public class Programa {
    public static void main(String[] args) {
        EmpleadoModel desarrollador = new DesarrolladorModel("Carlos", 30, 3000.0);
        EmpleadoModel diseniador = new DiseniadorModel("Ana", 25, 2500.0);
        EmpleadoModel gerente = new GerenteModel("Luis", 40, 5000.0);

        desarrollador.mostrarInformacion();
        diseniador.mostrarInformacion();
        gerente.mostrarInformacion();

    }
}
