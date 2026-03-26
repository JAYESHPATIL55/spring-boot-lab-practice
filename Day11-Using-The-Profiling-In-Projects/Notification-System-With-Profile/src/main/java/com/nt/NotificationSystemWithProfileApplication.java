package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.Notification;
import com.nt.service.NotificationService;

@SpringBootApplication
public class NotificationSystemWithProfileApplication implements CommandLineRunner {

	public static void main(String[] args) {
			SpringApplication.run(NotificationSystemWithProfileApplication.class, args);
	}
@Autowired
	private NotificationService notificationService;
	@Override
	public void run(String... args) throws Exception {
		
//		notification.setId(101);
//		notification.setMessage("we are happy to announce ..");
//		notification.setRecipient("Jayesh");
		
		notificationService.sendNotification(new Notification(101,"We are Inviting you..","Jayesh"));		
	}

}
