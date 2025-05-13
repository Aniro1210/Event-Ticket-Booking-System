public class Organizer extends User{
	private boolean active = true;
	public Organizer(String id,String name) {
		super(id,name);
	}
	@Override
	public void showProfile() {
		System.out.println("ID: "+getID() + "\t" + "Name: " + getName() + "Active Status: " + this.active);
	}
	public boolean isActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active=active;
	}
	
}
