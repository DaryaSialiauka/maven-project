package by.it_academy.servlet.controller;

import java.util.HashMap;
import java.util.Map;

import by.it_academy.servlet.controller.impl.DoAuthorization;
import by.it_academy.servlet.controller.impl.DoRegistration;
import by.it_academy.servlet.controller.impl.GoToAuthorizationPage;
import by.it_academy.servlet.controller.impl.GoToRegistrationPage;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_AUTHORIZATION_PAGE, new GoToAuthorizationPage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		commands.put(CommandName.DO_AUTHORIZATION, new DoAuthorization());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
	}

	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name);
		Command command = commands.get(commandName);
		return command;

	}

}
