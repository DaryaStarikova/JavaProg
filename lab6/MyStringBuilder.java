package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.List;

// Команда для выполнения операции append
class AppendCommand implements Command {
    private MyStringBuilder stringBuilder;
    private String text;

    public AppendCommand(MyStringBuilder stringBuilder, String text) {
        this.stringBuilder = stringBuilder;
        this.text = text;
    }

    @Override
    public void execute() {
        stringBuilder.append(text);
    }
}

// Команда для выполнения операции delete
class DeleteCommand implements Command {
    private MyStringBuilder stringBuilder;
    private int start;
    private int end;

    public DeleteCommand(MyStringBuilder stringBuilder, int start, int end) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.end = end;
    }

    @Override
    public void execute() {
        stringBuilder.delete(start, end);
    }
}

// Интерфейс для команд
interface Command {
    void execute();
}

// Класс MyStringBuilder с поддержкой undo
public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private List<Command> commandHistory;

    public MyStringBuilder() {
        stringBuilder = new StringBuilder();
        commandHistory = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        commandHistory.add(new AppendCommand(this, str));
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        commandHistory.add(new DeleteCommand(this, start, end));
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.execute();
        }
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        // Append some text
        myStringBuilder.append("Hello, ");
        myStringBuilder.append("world!");

        System.out.println("Current content: " + myStringBuilder);

        // Perform delete
        myStringBuilder.delete(0, 6);
        System.out.println("After delete: " + myStringBuilder);

        // Undo the last operation
        myStringBuilder.undo();
        System.out.println("After undo: " + myStringBuilder);

    }
}
