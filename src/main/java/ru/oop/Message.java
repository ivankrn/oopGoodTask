package ru.oop;

/**
 * Сообщение
 *
 * @param text текст сообщения
 * @param chatId id чата
 */
public record Message (String text, long chatId) {
}
