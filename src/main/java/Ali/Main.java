package Ali;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        Student student = new Student("Ali", 21);
        String json = gson.toJson(student);

        int port = Integer.parseInt(
                System.getenv().getOrDefault("PORT", "8080")
        );

        HttpServer server = HttpServer.create(
                new InetSocketAddress(port), 0
        );

        server.createContext("/", exchange -> {

            byte[] response = json.getBytes();

            exchange.getResponseHeaders()
                    .set("Content-Type", "application/json");

            exchange.sendResponseHeaders(200, response.length);

            try (OutputStream output = exchange.getResponseBody()) {
                output.write(response);
            }
        });

        server.start();

        System.out.println("Server running on port " + port);
    }
}

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}