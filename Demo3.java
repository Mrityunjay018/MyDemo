package p1;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(600);
		//To do
		al1.addAll(al2);
		System.out.println(al1);
		
		al1.addAll(1,al2);
		System.out.println(al1);
		
		System.out.println(al1.contains(200));
		System.out.println(al1.get(2));
		System.out.println(al1.getClass());
		System.out.println(al1.isEmpty());
		
		al1.clear();
		System.out.println(al1.isEmpty());

	}

}
