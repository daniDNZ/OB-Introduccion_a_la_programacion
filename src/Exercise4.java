/*
* En este ejercicio practicarás las estructuras de control, para ello deberás crear:
* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
* Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
* Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
* Incrementar el valor de la variable en uno cada vez que se ejecute.
* Mostrarlo por pantalla cada vez que se ejecute.
* Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
* Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
* Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/
public class Exercise4 {
    public static void main() {

        System.out.println("++++++++++ EXERCISE 4 ++++++++++");
        int n = 0;
        String season = "AuTuMn";

        isNotZero(n);
        whileLoop(n);
        doWhileLoop(n);
        forLoop(n);
        seasonSwitch(season);

    }

    public static void isNotZero(int ifNumber) {
        String result;

        if (ifNumber > 0) {
            result = "Mayor que 0";
        } else if (ifNumber < 0) {
            result = "Menor que 0";
        } else {
            result = "El número es 0";
        }

        System.out.println(result);
    }

    public static void whileLoop(int whileNumber) {
        while ( whileNumber < 3) {
            whileNumber++;
            System.out.println("WhileNumber: "+whileNumber);
        }
    }

    public static void doWhileLoop(int doWhileNumber) {
        do {
            doWhileNumber++;
            System.out.println("DoWhileNumber: "+doWhileNumber);
        }while (false);
    }

    public static void forLoop(int forNumber) {

        for (int i = forNumber; i <= 3; i++) {
            System.out.println("ForNumber: "+i);
        }
    }

    public static void seasonSwitch(String season) {
        switch (season.toLowerCase()) {
            case "spring" -> System.out.println("Spring");
            case "summer" -> System.out.println("Summer");
            case "autumn" -> System.out.println("Autumn");
            case "winter" -> System.out.println("Winter");
            default -> System.out.println(season + " is not a season");
        }
    }
}
