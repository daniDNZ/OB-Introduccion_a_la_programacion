/*
* Para practicar la encapsulación:
* Crear clase Persona.
* Crear variables las privadas edad, nombre y telefono de la clase Persona.
* Crear gets y sets de cada propiedad.
* Crear un objeto persona en el main.
* Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 */

public class Exercise8 {
    public static void main() {
        System.out.println("++++++++++ EXERCISE 8 ++++++++++");

        Person juan = new Person();
        juan.setName("Juan");
        juan.setAge(34);
        juan.setPhone(645839456);

        System.out.println("Me llamo "+juan.getName()+" y tengo "+juan.getAge()+" años.");
        System.out.println("Mi teléfono es: "+juan.getPhone()+".");
    }
}

class Person {
    private int age;
    private String name;
    private int phone;

    public Person(){
        age = 0;
        name = "";
        phone = 0;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(int newPhone) {
        this.phone = newPhone;
    }

    public int getPhone() {
        return this.phone;
    }
}