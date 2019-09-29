import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber(1L, "Ivan", "Ivanov", "m");
        Subscriber subscriber2 = new Subscriber(2L, "Peter", "Petrov", "m");

        Gson gson = new Gson();
        String jsonString = gson.toJson(subscriber1);
        System.out.println(jsonString);

        // json to Subscriber
        Subscriber subscriber1FromJson = gson.fromJson(jsonString, Subscriber.class);
        System.out.println(subscriber1FromJson);

        // list to json
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(subscriber1);
        subscribers.add(subscriber2);


    }

}
