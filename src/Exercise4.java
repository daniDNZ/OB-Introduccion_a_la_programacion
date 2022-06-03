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
            case "spring":
                System.out.println("Spring");
                break;
            case "summer":
                System.out.println("Summer");
                break;
            case "autumn":
                System.out.println("Autumn");
                break;
            case "winter":
                System.out.println("Winter");
                break;
            default:
                System.out.println(season+" is not a season");
                break;
        };
    }
}
