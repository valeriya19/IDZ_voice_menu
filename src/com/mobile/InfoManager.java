package com.mobile;

import com.mobile.io.ConsoleHelper;
import com.mobile.io.Input;
import com.mobile.io.Output;

import java.util.LinkedList;

public class InfoManager {

    public static void main(String[] args) {

        LinkedList<Menu> callStack = new LinkedList<>();
        Input input = new ConsoleHelper();
        Output output = new ConsoleHelper();

        Menu main = new Menu("Главное меню");
        main.setFirst(true);

        Menu action = new Menu("Акции");
        action.addField(new Menu("звони ночью бесплатно"));
        action.addField(new Menu("Поплни счет и получи подарок"));
        action.addField(new Menu("Поезда в Сочи за счет друга"));

        Menu balance = new Menu("Баланс");
        balance.addField(new Menu("На экран"));
        balance.addField(new Menu("Сообщением"));

        Menu operCall = new Menu("Соеденение с оператором");
        operCall.addField(new Menu("Василий"));
        operCall.addField(new Menu("Петр 1"));
        operCall.addField(new Menu("Иван"));


        main.addField(action);
        main.addField(balance);
        main.addField(operCall);


        callStack.add(main);
        while (true){
            Menu current = callStack.getLast();
            output.output(current.toString());
            output.output("Ваш выбор: ");
            int i = Integer.valueOf(input.getInput());

            if (i == 0){
                if(current.isFirst())
                    System.exit(0);
                else
                    callStack.removeLast();
            }
            else
                callStack.add(current.getField(i));
        }
    }
}
