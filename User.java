package java_training;

public abstract class User {
	private String id;
	private String name;
	
	public User(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public abstract void showProfile();
	
	public String getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public void setID(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
}
