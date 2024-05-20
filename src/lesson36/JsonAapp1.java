package lesson36;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson35.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonAapp1 {
    public static final String RESOURCE = "src/lesson36/resource/";
    public static final Path PATH = Paths.get(RESOURCE + "person.txt");

    public static void main(String[] args) {
        Person person = new Person("Kamil", "Ibadov", 28);
        String personJson = " ";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            personJson = objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(personJson);

        try {
            Files.write(PATH, personJson.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            byte[] bytes = Files.readAllBytes(PATH);
            System.out.println(Arrays.toString(bytes));
            List<String> strings = Files.readAllLines(PATH);
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}