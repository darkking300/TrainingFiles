package com.assessment;

public class Car {
	String name;
	String color;
	String id;
	
	public Car(String name,String color,String id){
		this.name = name;
		this.color = color;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString(){
		return "\nCar name:"+this.name+"\nColor:"+this.color+"\nCar Identification Code:"+this.id + "\n";
	}
	
}
