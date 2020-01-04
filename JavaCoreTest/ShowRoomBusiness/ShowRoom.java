package com.assessment;

import java.util.HashMap;
import java.util.Map.Entry;


public class ShowRoom {
	String showRoomName;
	int totalCars = 0;
	HashMap<Integer,Car> carInShowRoom;
	
	public ShowRoom(String name){
		this.showRoomName = name;
		carInShowRoom = new HashMap<Integer,Car>();
	}
	public void AddCars(Car newCar){
		totalCars++;
		//System.out.println(newCar);
		try{
		this.carInShowRoom.put(totalCars,newCar);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("\nShowroom name: " + this.showRoomName + "\n");
		
		for (Entry<Integer, Car> entry : carInShowRoom.entrySet())  { 
			str.append("\nInventory Id: " + entry.getKey() +  entry.getValue()); 
		}
		
		return str.toString();
	}
}
