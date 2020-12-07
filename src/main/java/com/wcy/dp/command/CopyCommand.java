package com.wcy.dp.command;

public class CopyCommand extends Command {

    private String copyLine = "hello";
    private String originLine;

    public CopyCommand(String originLine) {
        this.originLine = originLine;
    }

    @Override
    public void doit() {
        originLine += copyLine;
        System.out.println(originLine);
    }

    @Override
    public void undo() {
        originLine = originLine.substring(0, originLine.length() - copyLine.length());
        System.out.println(originLine);
    }
}
