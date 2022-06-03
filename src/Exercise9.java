/*
* Crea una clase Persona con las siguientes variables:
* La edad
* El nombre
* El teléfono
* Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable crédito solo para esa clase.
* Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el teléfono, el nombre y el crédito, tienes que darles valor y mostrarlas por pantalla.
* Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/
public class Exercise9 {
    public static void main() {
        System.out.println("++++++++++ EXERCISE 9 ++++++++++");
        
        Customer customerOne = new Customer();
        customerOne.setAge(24);
        customerOne.setName("Fran");
        customerOne.setPhone(895748345);
        customerOne.setCredit(2500);

        System.out.println("CLIENTE");
        System.out.println("Nombre: "+customerOne.getName());
        System.out.println("Edad: "+customerOne.getAge());
        System.out.println("Teléfono: "+customerOne.getPhone());
        System.out.println("Crédito: "+customerOne.getCredit());
        System.out.println();

        Worker workerOne = new Worker("Susana", 35, 895787532,1500);

        System.out.println("TRABAJADOR");
        System.out.println("Nombre: "+workerOne.getName());
        System.out.println("Edad: "+workerOne.getAge());
        System.out.println("Teléfono: "+workerOne.getPhone());
        System.out.println("Crédito: "+workerOne.getSalary());
    }
}

abstract class AbstractPerson {
    private int age;
    private String name;
    private int phone;
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

class Customer extends AbstractPerson {
    private int credit;

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

class Worker extends AbstractPerson {
    private int salary;

    public Worker(String name, int age, int phone, int salary) {
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
        this.setSalary(salary);
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}