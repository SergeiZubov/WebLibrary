package by.home.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.home.library.controller.command.Command;
import by.home.library.controller.command.impl.AddBookCommand;
import by.home.library.controller.command.impl.LoginationCommand;
import by.home.library.controller.command.impl.LoginationPage;
import by.home.library.controller.command.impl.RegistrationCommand;
import by.home.library.controller.command.impl.RegistrationPage;

class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();

	CommandProvider() {
		commands.put("add_book", new AddBookCommand());
		commands.put("logination", new LoginationCommand());
		commands.put("loginationPage", new LoginationPage());
		commands.put("registrationPage", new RegistrationPage());
		commands.put("registration", new RegistrationCommand());
	}

	Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		return command;

	}

}
