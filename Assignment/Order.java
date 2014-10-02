package Assignment;

public abstract class Order implements Car 
{
	//Encapsulation
	private String ModelNumber;
	private String Color;
	private int Cost;
	
	//Method OverLoading
	public Order(String ModelNumber,String Color,int Cost)
	{
		this.ModelNumber=ModelNumber;
		this.Color=Color;
		this.Cost=Cost;
	}
	
	//implemented the Car interface and As it did not implemented the 
	//unimplemented method in the unterface.so it is itself abstract class
	
	public abstract void model();
	public abstract void color();
	public abstract void cost();

	//Get the hidden variable
	public String getModelNumber() 
	{
		return ModelNumber;
	}

	public String getColor()
	{
		return Color;
	}
	
	public int getCost()
	{
		return Cost;
	}
	
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
