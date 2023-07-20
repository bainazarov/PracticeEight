import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAndJSON {
    public static void main(String[] args) {
        Person person = new Person ("John", 30);

        // Сериализуем обьект в JSON строку
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(jsonString);

        // Десериализуем JSON строку в обьект класс
        String jsonString2 = "{\"name\":\"John\", \"age\":30}";
        try {
            Person person2 = objectMapper.readValue(jsonString2, Person.class);
            System.out.println(person2.getName() + " " + person2.getAge());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}