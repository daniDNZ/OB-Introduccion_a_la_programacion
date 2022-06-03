/*
* Primera parte:
* Crear una función con tres parámetros que sean números que se suman entre sí.
* Llamar a la función en el main y darle valores.
* Segunda parte:
* Crear una clase coche.
* Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
* Una función que incremente el número de puertas que tiene el coche.
* Crear un objeto miCoche en el main y añadirle una puerta.
* Mostrar el número de puertas que tiene el objeto.
*/
public class Exercise3 {
    public static void main() {
        System.out.println("++++++++++ EXERCISE 3 ++++++++++");

        toAddNumbers(1, 2, 3);

        Car vw = new Car();
        vw.addDoor();
        System.out.println("Doors: "+vw.doors);

    }

    public static void toAddNumbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}

class Car {
    public int doors;

    public Car() {
        doors = 1;
    }

    public void addDoor() {
        this.doors++;
    }

}