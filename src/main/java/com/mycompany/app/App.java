package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {
//For initialization purpose
}

    public static void main(String[] args) {
	String message = new App().getMessage();
        System.out.println(message);
    }

    private final String getMessage() {
        return message;
    }

}
