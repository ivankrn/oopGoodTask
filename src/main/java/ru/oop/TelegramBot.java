package ru.oop;

/**
 * Бот Telegram
 */
public class TelegramBot implements Bot {

    private final String name;

    public TelegramBot(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        // запускаем бота
    }

    @Override
    public void shutdown() {
        // выключаем бота
    }

    @Override
    public void onUpdate(Update update) {
        String replyText = "Ваше сообщение: " + update.getMessage().getText();
        Message message = new TelegramMessage();
        message.setSender(this);
        message.setChatId(update.getMessage().getChatId());
        message.setText(replyText);
        sendMessage(message);
    }

    @Override
    public void sendMessage(Message message) {
        // посылаем сообщение
    }

    @Override
    public String getUsername() {
        return name;
    }

}
