package ru.oop;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;

/**
 * Телеграм-бот, присылающий в ответ пользователю приветствие и сообщение пользователя
 */
public class MyTelegramBot implements Bot {

    private TelegramBot botApi;
    private final Logic logic = new Logic(this);

    /**
     * Регистрирует и запускает бота
     *
     * @param token токен бота
     */
    public void register(String token) {
        botApi = new TelegramBot(token);
        botApi.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                Message message = new Message(update.message().text(), update.message().chat().id());
                logic.handleMessage(message);
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    @Override
    public void sendMessage(Message message) {
        SendMessage sendMessage = new SendMessage(message.chatId(), message.text());
        botApi.execute(sendMessage);
    }
}
