package by.piskunou.study;

import by.piskunou.study.behavioral.command.CommandMain;

public class App {
    public static void main(String[] args) {
        Main main = new CommandMain();
        main.start();
    }
}
