

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.events.Event;

public class EventBookingSystem {
	List<Attendee> attendees=new ArrayList<>();
	List<Organizer> organizer=new ArrayList<>();
	List<Event> events=new ArrayList<>();
	public void registerUser(Attendee attendee) {
		attendees.add(attendee);
	}
	public void addEvent(Event event) {
		events.add(event);
	}
	public void bookTicket(String attendeeId,String eventTitle) throws InvalidBookingException {
		Attendee attendee=null;
		for()
	}

}
