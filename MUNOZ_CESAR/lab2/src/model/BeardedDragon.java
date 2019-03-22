package model;

public class BeardedDragon{
	
	//Atributes 
	private double weight;
	private String name;
	private char sex;
	private double bodyMassIndex;
	
	public BeardedDragon(double weight, String name, char sex, double bodyMassIndex){
		this.weight = weight;
		this.name = name;
		this.sex = sex;
		this.bodyMassIndex = bodyMassIndex;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public double getBodyMassIndex(){
		return bodyMassIndex;
	}
	
	public void setBodyMassIndex(double bodyMassIndex){
		this.bodyMassIndex = bodyMassIndex;
	}
	


}