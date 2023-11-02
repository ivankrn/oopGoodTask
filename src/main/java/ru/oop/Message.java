package ru.oop;

/**
 * Сообщение
 */
public interface Message {

    /**
     * Возвращает текст сообщения
     *
     * @return текст сообщения
     */
    String getText();

    /**
     * Устанавливает текст сообщения
     *
     * @param text текст сообщения
     */
    void setText(String text);

    /**
     * Возвращает id чата
     *
     * @return id чата
     */
    long getChatId();

    /**
     * Устанавливает id чата
     *
     * @param chatId id чата
     */
    void setChatId(long chatId);

    /**
     * Возвращает отправителя сообщения
     *
     * @return отправитель
     */
    User getSender();

    /**
     * Устанавливает отправителя сообщения
     *
     * @param sender отправитель
     */
    void setSender(User sender);

}
