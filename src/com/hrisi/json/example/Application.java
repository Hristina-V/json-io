package com.hrisi.json.example;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Example usage
        List<Person> persons = List.of(
            new Person("John Doe", 25),
            new Person("Jane Smith", 30),
            new Person("Bob Johnson", 22)
        );

        // Write list of persons to JSON file
        JsonFileHandler.writeToJsonFile(persons);

        // Read list of persons from JSON file
        List<Person> readPersons = JsonFileHandler.readFromJsonFile();
        System.out.println("Read Persons: " + readPersons);
    }
}
