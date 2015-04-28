package com.mobile.io;

import java.util.Scanner;


public class ConsoleHelper implements Input, Output{
    private Scanner scan = new Scanner(System.in);

    public String getInput() {
        return scan.next();
    }

    public void output(String str) {
        System.out.print(str);
    }
}
