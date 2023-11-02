package ru.oop;

/**
 * Событие бота
 */
public interface Update {

    /**
     * Возвращает сообщение события
     *
     * @return сообщение
     */
    Message getMessage();

}
