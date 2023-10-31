package ru.oop;

/**
 * Транспорт
 */
public interface Transport extends Positioned {

    /**
     * Войти в транспорт пассажиру
     *
     * @param passenger пассажир
     */
    void enter(Person passenger);

    /**
     * Выйти из транспорта пассажиру
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
