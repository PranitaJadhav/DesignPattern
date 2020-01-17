package com.bridgelabz.mediatordesignpattern;



public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Pranit");
		User user2 = new UserImpl(mediator, "Piyush");
		User user3 = new UserImpl(mediator, "Sampda");
		User user4 = new UserImpl(mediator, "Hanumant");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi everyone");
		
	}

}

