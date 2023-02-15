public class Member{
	
	private Status status;
	private String name;
	private int iDNumber;
	private boolean registered;

	public Member(Status s, String n, int id, boolean r){
		status = s;
		name = n;
		iDNumber = id;
		registered = r;
	}

	public Status getStatus(){
		return status;
	}

	public String getName(){
		return name;
	}

	public int getIDNumber(){
		return iDNumber;
	}

	public boolean getRegistered(){
		return registered;
	}

	public String toString(){
		String isIsNot = registered ? "is" : "is not";
		return name + " (" + iDNumber + ") is a " + status + " and " + isIsNot + " registered.";
	}


}