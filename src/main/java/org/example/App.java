package org.example;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
        String token;
        try {
            Scanner scanner = new Scanner(new File("token.txt"));
            token = scanner.nextLine();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Bot bot = new Bot(token);
        bot.run();
    }
}
