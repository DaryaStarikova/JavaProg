package ru.mirea.lab24;

// Интерфейс абстрактной фабрики стульев
public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}

