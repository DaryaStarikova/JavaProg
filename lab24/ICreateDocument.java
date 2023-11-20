package ru.mirea.lab24;

// Интерфейс для фабрики документов
public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

