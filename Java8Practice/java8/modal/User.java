package modal;

public class User {

	private int id;
	private String firtName;
	private String lastName;

	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firtName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firtName=" + firtName + ", lastName=" + lastName + "]";
	}
}
