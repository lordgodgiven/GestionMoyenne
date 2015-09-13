package cg.skylab.gestnote.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class CheckConnection {

	public static boolean checkConnection() {
		boolean connectionState = false;
		Connection connection = DBUtil.getConnection();

		try {
			if (connection.isValid(5))

				connectionState = true;
		} catch (SQLException e) {
			connectionState = false;
			System.out.println(e.getMessage());
		}
		return connectionState;

	}

}
