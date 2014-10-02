package Assignment;

public class Car_Toyota extends Order 
{

	public Car_Toyota(String ModelName,String Color,int Cost) 
	{
		super(ModelName,Color,Cost);
		
	}

	@Override
	public void model() 
	{
		System.out.println("Model Name is: "+super.getModelNumber());
		
	}

	@Override
	public void color() 
	{
		System.out.println("Available color is :"+super.getColor());
		
	}

	@Override
	public void cost() 
	{
		System.out.println("The Effective Cost is :"+super.getCost());
		
	}
	

}
