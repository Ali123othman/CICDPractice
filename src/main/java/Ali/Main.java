package Ali;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Ali", 21);

        Gson gson = new Gson();

        String json = gson.toJson(student);

        System.out.println(json);
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