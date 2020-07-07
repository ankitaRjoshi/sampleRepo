package ankitaAndKaranProject;

public class MyStudent {
	int id;
	String name;
	double marks;
	
	//constructor declaration
	public MyStudent (int id, String name, double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	//getters&Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks=marks;
	}
}