class Event
{
    String title;
    int availableTickets;
    Event(String title,int availableTickets)
    {
        title=this.title;
        availableTickets=this.availableTickets;
    }
    boolean isAvailable()
    {
        return availableTickets>0;
    }
    void setAvailable(int count)
    {
        availableTickets=count;
    }
    String getTitle()
    {
        return this.title;
    }
    
}