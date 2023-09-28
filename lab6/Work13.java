package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.List;

// Интерфейс наблюдателя
interface Observer {
    void update();
}

// Класс, реализующий функциональность StringBuilder
class StringBuilderWrapper {
    private StringBuilder stringBuilder;

    public StringBuilderWrapper() {
        stringBuilder = new StringBuilder();
    }

    public void append(String str) {
        stringBuilder.append(str);
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}

// Расширенный класс StringBuilder с поддержкой оповещения
class ObservableStringBuilder {
    private StringBuilderWrapper stringBuilder;
    private List<Observer> observers;

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilderWrapper();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Пример наблюдателя
class ObserverExample implements Observer {
    private ObservableStringBuilder observableStringBuilder;

    public ObserverExample(ObservableStringBuilder observableStringBuilder) {
        this.observableStringBuilder = observableStringBuilder;
        this.observableStringBuilder.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("StringBuilder content changed: " + observableStringBuilder.toString());
    }
}

public class Work13 {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();
        ObserverExample observerExample = new ObserverExample(observableStringBuilder);

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("world!");
        observableStringBuilder.delete(0, 6);
    }
}

