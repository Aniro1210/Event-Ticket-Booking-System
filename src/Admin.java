

import java.util.List;

import org.w3c.dom.events.Event;

import java.util.Iterator;

@RoleRequired(role="Admin")

public class Admin extends User {
	public Admin(String id,String name) {
		super(id,name);
	}
	public void removeEvent(List<Event> events,String title) {
		Iterator<Event> iterator=events.iterator();
		while(iterator.hasNext()) {
			Event e=iterator.next();
			if(e.getTitle().ignoresEqualCase(title)) {
				iterator.remove();
				System.out.println("Event removed:"+title);
				return;
			}
		}
		
	}
	@Override
	public void showProfile() {
		System.out.println("Admin ID:"+getID() +"Name:"+getName());
	}

}
