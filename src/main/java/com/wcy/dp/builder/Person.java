package com.wcy.dp.builder;

public class Person {
    private int age;
    private String name;
    private double weight;
    private Location location;

    private Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", location=" + location +
                '}';
    }

    public static class builder {
        Person person = new Person();

        public builder age(int age) {
            person.age = age;
            return this;
        }

        public builder name(String name) {
            person.name = name;
            return this;
        }

        public builder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public builder location(String country, String street) {
            person.location = new Location(country, street);
            return this;
        }

        public Person build() {
            return person;
        }


    }


}
