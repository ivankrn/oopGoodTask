package ru.oop;

/**
 * Задача: построить базовую архитектуру бота, который сможет работать в  telegram и ещё как минимум одной чат-бот
 * платформе (Discord, VK или др.).<br>
 * В качестве основного функционала бота можно возвращать в ответ текст, который отправил пользователь с пометкой от бота.<br>
 * Например "Ваше сообщение: <сообщение>".<br>
 * Нужно акцентировать внимание именно на архитектуре и интерфейсах.<br>
 */
public class App {

    /**
     * Точка входа для запуска ботов
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        MyTelegramBot myTelegramBot = new MyTelegramBot();
        myTelegramBot.register(System.getProperty("telegramToken"));
        MyDiscordBot myDiscordBot = new MyDiscordBot();
        myDiscordBot.register(System.getProperty("discordToken"));
    }

}
