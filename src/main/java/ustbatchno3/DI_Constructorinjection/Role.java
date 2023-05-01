package ustbatchno3.DI_Constructorinjection;

public class Role {
	private String character;
	private String responsibility;
	public Role(String character, String responsibility) {
		super();
		this.character = character;
		this.responsibility = responsibility;
	}
	
	public void display() {
		System.out.println("My name is "+character+" and my responsibility is "+responsibility);
	}
}
