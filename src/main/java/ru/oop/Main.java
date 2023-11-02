package ru.oop;

/**
 * Задача: построить базовую архитектуру бота, который сможет работать в  telegram и ещё как минимум одной чат-бот
 * платформе (Discord, VK или др.).<br>
 * В качестве основного функционала бота можно возвращать в ответ текст, который отправил пользователь с пометкой от бота.<br>
 * Например "Ваше сообщение: <сообщение>".<br>
 * Нужно акцентировать внимание именно на архитектуре и интерфейсах.<br>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {

    public static void main(String[] args) {
        Bot myTelegramBot = new MyTelegramBot(System.getProperty("telegramToken"));
        Bot myDiscordBot = new MyDiscordBot(System.getProperty("discordToken"));
    }

}
