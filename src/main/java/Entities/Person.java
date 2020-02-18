package Entities;

public class Person {
    private Long id;
    private String name;
    private String lastName;
    private String occupation;

    public Person(Long id, String name, String lastName, String occupation){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
    }

    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public Person setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }
}
