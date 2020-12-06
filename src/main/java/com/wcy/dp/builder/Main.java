package com.wcy.dp.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.builder()
                .age(12)
                .weight(95)
                .name("nihao")
                .location("china", "beijing")
                .build();
        System.out.println(person);
    }
}
