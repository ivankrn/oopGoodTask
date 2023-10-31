package ru.oop;

public interface Car {

    /**
     * Выйти из машины пассажиру
     *
     * @param passenger пассажир
     */
    void exit(Person passenger);

    /**
     * Доехать до указанного места из текущего местоположения, либо до наиболее близкого места к указанному
     *
     * @param destination место назначения
     */
    void goWhileHasPath(Position destination);

}
