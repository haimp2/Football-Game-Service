package Classes;

import java.util.UUID;

public class Team {
	
	//Data Members:
	private String id;
	private String name;
	
	public Team(String name){
		this.name = name;
		id = UUID.randomUUID().toString();
	}
	
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
