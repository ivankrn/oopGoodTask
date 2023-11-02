package ru.oop;

/**
 * Бот
 */
public interface Bot extends User {

    /**
     * Запустить бота
     */
    void start();

    /**
     * Выключить бота
     */
    void shutdown();

    /**
     * Обрабатывает поступившее событие в бота (сообщение от пользователя и т.п.)
     *
     * @param update событие
     */
    void onUpdate(Update update);


    /**
     * Отправляет сообщение
     *
     * @param message сообщение
     */
    void sendMessage(Message message);

}
