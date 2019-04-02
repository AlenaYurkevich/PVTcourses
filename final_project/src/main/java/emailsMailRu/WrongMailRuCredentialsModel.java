package emailsMailRu;

public class WrongMailRuCredentialsModel {
	private int id;
	private String username;
	private String password;

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User:: ID=" + this.id + " Username=" + this.username + " Password=" + this.password;
	}
}
