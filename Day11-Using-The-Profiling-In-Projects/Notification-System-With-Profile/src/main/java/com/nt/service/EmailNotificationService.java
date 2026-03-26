package com.nt.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.nt.model.Notification;
@Component
@Profile("dev")
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println(n.getId()+" id Sending Email to <"+n.getRecipient()+">: <"+n.getMessage()+">.");

	}

}
