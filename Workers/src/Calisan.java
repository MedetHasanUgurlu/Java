
public class Calisan {
	
	int id;
	String name;
	String surName;
	
	
	public Calisan(int id,String name,String surName) {
		this.id= id;
		this.name = name;
		this.surName = surName;
	}
	public void display() {
		
		System.out.println("id "+id);
		System.out.println("Name "+name);
		System.out.println("SurName "+surName);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	
	
	
	

}
