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