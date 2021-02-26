package ohtu.services;

import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.UserDao;

public class AuthenticationService {

	private UserDao userDao;

	public AuthenticationService(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean logIn(String username, String password) {
		for (User user : userDao.listAll()) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}

		return false;
	}

	public boolean createUser(String username, String password) {
		if (userDao.findByName(username) != null) {
			return false;
		}

		if (invalid(username, password)) {
			return false;
		}

		userDao.add(new User(username, password));

		return true;
	}

	private boolean invalid(String username, String password) {
		//Pieleen menee, mutta miksi?
		boolean invalid = false;
		if (username.length() < 3 || password.length() < 8) {
			return true;
		}
		char[] chars = username.toCharArray();
		char[] pChars = password.toCharArray();
		for (char c : chars) {
			if ((c < 'A' && c > 'Z') || (c < 'a' && c > 'z')) {
				return true;
			}
		}
		for (char pc : pChars) {
			byte ch = (byte) pc;
			if (ch >= 97 && ch <=122 || ch >= 65 && ch <= 90) {
				invalid = true;
			} else {
				invalid = false;
				break;
			}

		}
		return invalid;
	}
}
