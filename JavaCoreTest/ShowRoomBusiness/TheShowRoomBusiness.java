package com.assessment;

public class TheShowRoomBusiness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Aston Martin DB11","Silver","01");
		Car car2 = new Car("Lamborghini Aventador","Black","0D342");
		Car car3 = new Car("Audi R8","Red","1FR5");
		Car car4 = new Car("Maserati Grand cabrio","Blue","F87");
		Car car5 = new Car("Maserati granturismo","Metallic orange","F88");
		Car car6 = new Car("Ford Mustang GT","Topaz","F990324");
		
		ShowRoom show1 = new ShowRoom("Fast Buy");
		show1.AddCars(car1);
		show1.AddCars(car2);
		show1.AddCars(car5);
		
		ShowRoom show2 = new ShowRoom("Shelby and Co.");
		show2.AddCars(car5);
		show2.AddCars(car6);
		show2.AddCars(car4);
		show2.AddCars(car3);
		
		System.out.println(show1);
		//System.out.println(show2);
	}

}
