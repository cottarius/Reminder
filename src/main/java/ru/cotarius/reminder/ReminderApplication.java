package ru.cotarius.reminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.cotarius.reminder.telegram.TelegramSender;

import java.io.IOException;

@SpringBootApplication
public class ReminderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ReminderApplication.class, args);
////		TelegramSender sender = new TelegramSender();
////		sender.sendMessage(1212558248, "Как жизнь?");
//
//		TelegramSender sender = new TelegramSender();
//		sender.sendMessage(1171985195, "Как жизнь Укатерина?");
	}

}
