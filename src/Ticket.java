public class Ticket {
    Attendee attendee;
    Event event;
    String status;
    Ticket()
    {
        status="Booked";
    }
    void cancel()
    {
        status="Cancelled";
    }
    String getStatus()
    {
        return status;
    }
    void ticketDetails()
    {
        attendee.showProfile();
        System.out.println("Event Name:"+event.title);
        System.out.println("Ticket Status:"+status);
    }
}
