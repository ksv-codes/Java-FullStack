package Lecture.KgCoding;

import java.util.Objects;

// import A5LoopsMethod.Lecture.returns;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {//person2(obj) is object of Person class or not
            return false;
        }
        Person per = (Person) obj;//jo obj aaya hain uska reference abhi k liye toh Object hi hain but mujhe pta hain ki woh Person hi hain(check kiya hain) toh usko ek person k reference me hi dal do
        return per.name.equals(name)&&
               per.age==age &&
               per.id.equals(id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age,id);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
    }
    
    
}
