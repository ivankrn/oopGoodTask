package ru.oop;

/**
 * Бот
 */
public interface Bot {

    /**
     * Запустить бота
     */
    void register(String token);

    /**
     * Отправляет сообщение
     *
     * @param message сообщение
     * @param chatId id чата
     */
    void sendMessage(String message, long chatId);

}
