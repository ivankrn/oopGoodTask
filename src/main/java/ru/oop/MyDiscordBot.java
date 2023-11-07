package ru.oop;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.intent.Intent;

import java.util.Optional;

/**
 * Дискорд-бот, присылающий в ответ пользователю приветствие и сообщение пользователя
 */
public class MyDiscordBot implements Bot {

    private DiscordApi discordApi;
    private final Logic logic = new Logic(this);

    /**
     * Регистрирует и запускает бота
     *
     * @param token токен бота
     */
    public void register(String token) {
        discordApi = new DiscordApiBuilder().setToken(token).addIntents(Intent.MESSAGE_CONTENT).login().join();
        discordApi.addMessageCreateListener(event -> {
            if (!event.getMessageAuthor().isBotUser()) {
                Message message = new Message(event.getMessageContent(), event.getChannel().getId());
                logic.handleMessage(message);
            }
        });
    }

    @Override
    public void sendMessage(Message message) {
        if (discordApi.getChannelById(message.chatId()).isPresent()) {
            Optional<TextChannel> textChannel = discordApi.getChannelById(message.chatId()).get().asTextChannel();
            textChannel.ifPresent(channel -> channel.sendMessage(message.text()));
        }
    }
}
