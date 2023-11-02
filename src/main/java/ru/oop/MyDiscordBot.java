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

    public MyDiscordBot(String token) {
        register(token);
    }

    @Override
    public void register(String token) {
        discordApi = new DiscordApiBuilder().setToken(token).addIntents(Intent.MESSAGE_CONTENT).login().join();
        discordApi.addMessageCreateListener(event -> {
            if (!event.getMessageAuthor().isBotUser()) {
                String reply = "Привет, я дискорд бот! Твое сообщение: " + event.getMessageContent();
                sendMessage(reply, event.getChannel().getId());
            }
        });
    }

    @Override
    public void sendMessage(String message, long chatId) {
        if (discordApi.getChannelById(chatId).isPresent()) {
            Optional<TextChannel> textChannel = discordApi.getChannelById(chatId).get().asTextChannel();
            textChannel.ifPresent(channel -> channel.sendMessage(message));
        }
    }
}
