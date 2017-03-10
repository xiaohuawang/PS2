package com;

public class EngineDemo {

	public static void main(String[] args) throws NoEngineExistException {
		// TODO Auto-generated method stub
		System.out.println("wozhishi yizhigou");
		EngineInventory inv=new EngineInventory();
		
//		ps1	
//		Engine e1=new TwoStroke(1,2000,25,'g');
//		Engine e2=new FourStroke(2,2000,25,'g');
//		Engine e3=new TwoStroke(3,2000,25,'d');
//		Engine e4=new FourStroke(4,2000,25,'d');
//		
//		System.out.println(e1.getMileage());
//		System.out.println(e2.getMileage());
//		System.out.println(e3.getMileage());
//		System.out.println(e4.getMileage());
		
//		ps2
//		Engine e1=new TwoStroke(1,2000,25,'g');
//		Engine e2=new FourStroke(2,2000,25,'g');
//		Engine e3=new TwoStroke(3,2000,25,'d');
//		Engine e4=new FourStroke(2,2000,25,'d');
		
//		System.out.println(inv.addEngine(e1));
//		System.out.println(inv.addEngine(e2));
//		System.out.println(inv.addEngine(e3));
//		System.out.println(inv.addEngine(e4));
		
//		System.out.println(inv.searchEngine('g'));
//		System.out.println(inv.searchEngine('d'));
		
//		ps3
		Engine e1=new TwoStroke(1,2200,25,'d');
		Engine e2=new FourStroke(2,2400,25,'g');
		Engine e3=new TwoStroke(3,2600,25,'d');
		Engine e4=new FourStroke(4,2800,25,'g');
		
		System.out.println(inv.addEngine(e1));
		System.out.println(inv.addEngine(e2));
		System.out.println(inv.addEngine(e3));
		System.out.println(inv.addEngine(e4));
		
		System.out.println(inv.enginesWithMileageGreaterThan(20));
		
		System.out.println(inv.enginesWithMileageGreaterThan(50));
	}

	
}
