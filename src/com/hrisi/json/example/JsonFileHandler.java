package com.hrisi.json.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonFileHandler {

    private static final String FILE_PATH = "json-files/person.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void writeToJsonFile(Person person) {
        writeToJsonFile(List.of(person));
    }

    public static void writeToJsonFile(List<Person> persons) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), persons);
            System.out.println("Data has been written to " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readFromJsonFile() {
        try {
            return objectMapper.readValue(new File(FILE_PATH), new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}