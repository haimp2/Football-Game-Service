package Classes;

import java.util.UUID;

public class Tournament {
	
	//Data Members:
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Tournament(String name) {
		this.name = name;
		id = UUID.randomUUID().toString();
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		Tournament other = (Tournament) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tournament [id=" + id + ", name=" + name + "]";
	}
	
	

}
