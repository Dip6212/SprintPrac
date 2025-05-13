package TicketBooking;

public class Atendee extends User {

	public Atendee(String id, String name) {
	super(id, name);
	
	}
	
	@Override
	void showProfile() {
		System.out.println("id: "+ id+" name: "+name);
	}
	
}
