
public class Student {
	 int id;
	 String name="Student";
     String major="CS";
	
	public Student(int id)
	{
		this.id = id;
	}
	public String get_name() {  // Allows me to access these and return their info (Getter)
		return name;
		
	}
	public String get_major() { // Allows me to access these and return their info (Getter)
		return major;
		
	}
	public int get_id() {      // Allows me to access these and return their info (Getter)
		return id;
	}
	public void set_name(String user_name) {  // Allows me to access these and return their info (Getter)
		this.name=user_name;
		
	}
	public void set_id(int id){
		this.id=id;
		
	}
	public void printData()
	{
		System.out.println("id: "+ id);
		System.out.println("Name: " + name);
		System.out.println("Major: " + major);
	
	}
	
  
	
}