package com.crickInfo.exceptions;

public class PlayerIdNotFoundException extends RuntimeException {
	
	public PlayerIdNotFoundException(int id) {
		super("No player found with the given Player-Id : " +id);
	}

}
