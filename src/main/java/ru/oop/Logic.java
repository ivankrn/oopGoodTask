package ru.oop;

/**
 * Обработчик сообщений бота
 */
public class Logic {

    private final Bot bot;

    public Logic(Bot bot) {
        this.bot = bot;
    }

    /**
     * Обрабатывает пришедшее сообщение пользователя и отправляет ему ответ
     *
     * @param message сообщение пользователя
     */
    void handleMessage(Message message) {
        String reply = "Ваше сообщение: " + message.text();
        Message botReplyMessage = new Message(reply, message.chatId());
        bot.sendMessage(botReplyMessage);
    }

}
