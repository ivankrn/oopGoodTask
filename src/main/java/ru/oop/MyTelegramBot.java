package ru.oop;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;

/**
 * Телеграм-бот, присылающий в ответ пользователю приветствие и сообщение пользователя
 */
public class MyTelegramBot implements Bot {

    private TelegramBot botApi;

    public MyTelegramBot(String token) {
        register(token);
    }

    @Override
    public void register(String token) {
        botApi = new TelegramBot(token);
        botApi.setUpdatesListener(updates -> {
            updates.forEach(update -> {
                String reply = "Привет, я телеграм бот! Твое сообщение: " + update.message().text();
                sendMessage(reply, update.message().chat().id());
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    @Override
    public void sendMessage(String message, long chatId) {
        SendMessage sendMessage = new SendMessage(chatId, message);
        botApi.execute(sendMessage);
    }
}
