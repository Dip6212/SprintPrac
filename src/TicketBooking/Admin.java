package TicketBooking;

import java.util.Iterator;
import java.util.List;

import annotations.RoleRequired;

@RoleRequired(role = "admin")
public class Admin extends User {

	public Admin(String id, String name) {
		super(id, name);
	}

	@Override
	void showProfile() {
		System.out.println("[Name: +"+this.name+", ID: "+this.id+"]");
	}
	
	void removeEvent(List<Event> events, String title) {
		if (isAdmin()) {			
			Iterator<Event> it = events.iterator();
			
			while(it.hasNext()) {
				Event e = it.next();
				if (e.getTitle().equals(title)) {
					it.remove();
				}
			}
		}
	}
	
	private static boolean isAdmin() {
		Class<?> adminClass = Admin.class;
		if(adminClass.isAnnotationPresent(RoleRequired.class)) {
			RoleRequired roleRequired = adminClass.getAnnotation(RoleRequired.class);
			return "Admin".equals(roleRequired.role());
		}
		return false;
	}
}
