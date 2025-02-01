# Gestion-empleado


## Clases y subclases

### Clase `Empleado`

Es la clase que contiene todos los atributos básicos de una persona como pueden ser: 
  
  - **Nombre**: de tipo `String`
  - **Edad**: de tipo `int`
  - **SalarioBase**: de tipo `float`

La misma clase contiene los constructores para poder instanciar dichos atributos y los Getters y Setters para poder devolver los valores, así como para modificarlos.

### Clase (subclase) `Desarrollador`

La clase desarrollador **hereda** los atributos que posee la clase `Empleado` , llamando así a las propiedades comunes que tienen todos los empleados, independientemente del puesto o cargo que tengan.
Como particularidad, un desarrollador tiene un salario distinto al del empleado, que en este caso sería el salarioBase + 20%.

### Clase (subclase) `Diseñador`

La clase desarrollador **hereda** los atributos que posee la clase `Empleado` , llamando así a las propiedades comunes que tienen todos los empleados, independientemente del puesto o cargo que tengan.
Como particularidad, un desarrollador tiene un salario distinto al del empleado, que en este caso sería el salarioBase + 10%.

### Clase (subclase) `Gerente`

La clase desarrollador **hereda** los atributos que posee la clase `Empleado` , llamando así a las propiedades comunes que tienen todos los empleados, independientemente del puesto o cargo que tengan.
Como particularidad, un desarrollador tiene un salario distinto al del empleado, que en este caso sería el salarioBase + 30%.

### Clase (subclase) `Programa`

La clase programa **instancia** empleados para mostrar todos sus datos, además de su salario final.

---

## Métodos.

Todas las clases contienen los mismos métodos, que por ahora son los siguientes:

`calcularSalarioFinal()` y `mostrarInformacion()`. 

#### calcularSalariofinal()

```java 

public double calcularSalarioFinal(){
        return getSalarioBase() + (% del cargo);
    }

```

---

#### mostrarInformacion()

```java 

    public void mostrarInformacion(){
        System.out.println("Empleado: " );
        super.mostrarInformacion();
        System.out.println("Salario final: " + calcularSalarioFinal());
        System.out.println();
    }

```

---


## SALIDA DEL PROGRAMA

```bash

Empleado: Desarrollador
Nombre: Carlos
Edad: 30
Salario Base: 3000.0
Salario final: 3600.0

Empleado: Diseniador
Nombre: Ana
Edad: 25
Salario Base: 2500.0
Salario final: 2750.0

Empleado: Gerente
Nombre: Luis
Edad: 40
Salario Base: 5000.0
Salario final: 6500.0

```
