package io.jenkins.tools;

public class Main {
    public static void main(String[] args) {
        String a = "null";
        System.out.println(a.toString());
        System.out.println( "Hello World!" );
        // TODO: this is a task
        // FIXME: this is another task
        try {
            a = "Hello";
        } catch (Exception e) {}
    }
}
