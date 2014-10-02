package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Car_Info 
{
	public static void main(String[] args) 
	{ 
		List<Order> order1=new ArrayList<Order>();
		order1.add(new Car_BMW("BMW100","Black",90000));
		order1.add(new Car_Toyota("Toyota100","Black",30000));
		
		
		Order order[]=new Order[2];
		order[0]=new Car_BMW("BMW100","Black",50000);
		order[1]=new Car_Toyota("Toyota100","Black",10000);
		
		System.out.println("Using Fixed  Array");
		System.out.println("********************************");
		for(int i=0;i<order.length;i++)
		{	
			order[i].model();
			order[i].color();
			order[i].cost();
			System.out.println("********************************");
		}
		
		System.out.println("Using Dinamic ArrayList");
		System.out.println("*************************************");
		
		for(int i=0;i<order1.size();i++)
		{
			order1.get(i).model();
			order1.get(i).color();
			order1.get(i).cost();
			System.out.println("********************************");
		}
		
	}

}
