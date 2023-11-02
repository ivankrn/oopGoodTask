package ru.oop;

/**
 * Сообщение Telegram
 */
public class TelegramMessage implements Message {

    private String text;
    private long chatId;

    private User sender;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public long getChatId() {
        return chatId;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    @Override
    public void setSender(User sender) {
        this.sender = sender;
    }
}
