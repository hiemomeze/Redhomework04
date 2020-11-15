package one;

import one.Person;

public class SuperDemo01 {
    public static void main(String[] args) {
        Person.Student stu =new Person.Student("taotao ",20,"清华");
        System.out.println(stu.getinfo());

    }
}
