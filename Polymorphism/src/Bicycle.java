
public class Bicycle implements V{
	
	private String color;
	private int model;
	
	 public Bicycle(String color, int model) {
		// TODO Auto-generated constructor stub
		 this.color = color;
		 this.model = model;
		 
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println(model+ " is going");
	
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	

}
