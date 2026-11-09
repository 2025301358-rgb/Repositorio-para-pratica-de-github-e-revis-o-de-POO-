package main;

import utils.Input;

public class main {
    static void main(String[] args) {


     series s1 = new series("Mentalista", "Netflix");
     series s2 = new series(Input.st("informe o nome da serie"));

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
