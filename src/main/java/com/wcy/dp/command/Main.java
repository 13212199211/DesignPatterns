package com.wcy.dp.command;

public class Main {
    public static void main(String[] args) {
        Command command = new CopyCommand("line");
        command.doit();
        command.undo();
    }
}
