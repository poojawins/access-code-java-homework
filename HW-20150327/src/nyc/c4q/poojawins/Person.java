package nyc.c4q.poojawins;

/**
 * A Person class
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public static boolean checkSameCity(Person one, Person two) {
        return one.getCity().equals(two.getCity());
    }

    public static Person registerChild(Person parent) {
        Person child = new Person("Abc");
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());
        return child;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person pooja = new Person("Pooja");
        pooja.setCity("New York");

        Person rob = new Person("Rob");
        rob.setCity("New York");

        Person ila = new Person("Ila");
        ila.setCity("Allentown");

        System.out.println(checkSameCity(pooja, rob)); //true
        System.out.println(checkSameCity(pooja, ila)); //false

        Person mother = new Person("Mother");
        System.out.println(registerChild(mother));
    }
}


