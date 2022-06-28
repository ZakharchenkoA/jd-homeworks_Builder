import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() throws IllegalArgumentException {
        return new PersonBuilder()
                .setAddress(address)
                .setAge(0)
                .setSurname(surname);
    }

    public boolean hasAge() {
        if(getAge() != 0){
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if(getAddress() != null){
            return true;
        }
       return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void happyBirthday() {
        age += 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}