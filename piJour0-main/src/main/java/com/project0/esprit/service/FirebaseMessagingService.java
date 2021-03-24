package com.project0.esprit.service;

import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import com.project0.esprit.entity.Note;
/*
@Service
public class FirebaseMessagingService {
	 private final FirebaseMessaging firebaseMessaging;

	    public FirebaseMessagingService(FirebaseMessaging firebaseMessaging) {
	        this.firebaseMessaging = firebaseMessaging;
	    }


	    public String sendNotification(Note note, String token) throws FirebaseMessagingException {

	        Notification notification = Notification
	                .builder()
	                .setTitle(note.getSubject())
	                .setBody(note.getContent())
	                .build();

	        Message message = Message
	                .builder()
	                .setToken(token)
	                .setNotification(notification)
	                .putAllData(note.getData())
	                .build();

	        return firebaseMessaging.send(message);
	    }

}*/
