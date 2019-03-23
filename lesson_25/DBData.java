package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pages.TestDataPage;

public class DBData {
	TestDataPage testData;

	public DBData(TestDataPage testData) {
		this.testData = testData;
	}

	public TestDataPage getTestData() {
		return testData;
	}

	public void fillTestDataWithDataFromDB() {
		String login = null;
		String password = null;
		String email = null;
		String emailText = null;
		String emailSubject = null;
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false";
		String userDB = "root";
		String passwordDB = "MySQL1003";

		String query = "SELECT login, password, email, emailText, emailSubject FROM Test_Automation.UserInfo";
		// Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection(url, userDB, passwordDB);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			if (rs.next()) {
				login = rs.getString(1);
				testData.setLogin(login);

				password = rs.getString(2);
				testData.setPassword(password);

				email = rs.getString(3);
				testData.setEmail(email);

				emailText = rs.getString(4);
				testData.setEmailText(emailText);

				emailSubject = rs.getString(5);
				testData.setEmailSubject(emailSubject);

			}

			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();

		}

	}

}