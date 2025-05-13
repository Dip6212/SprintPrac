package TicketBooking;

public class Organizer extends User{
	
	boolean active=true;
	
	public Organizer(String id,String name) {
		super(id,name);
	}
	
	boolean isActive(){
		return active;
	}
	
	void setActive(boolean val) {
		active=val;
	}
	
	@Override
	void showProfile() {
		System.out.println("id: "+ id+" name: "+name);
	}
	
}
