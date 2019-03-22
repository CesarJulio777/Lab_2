package model;

public class Kangaroo{
	
	//Atributes
	private double weight;
	private String name;
	private double height;
	private char sex;
	private String bloodType;
	private double bodyMassIndex;
	
	//Relations
	private Date birthDate;

	
	public Kangaroo(double wei, String na, double hei, char sex, String bt, double bmi, Date bd){
		weight = wei;
		name = na;
		height = hei;
		this.sex = sex;
		bloodType = bt;
		bodyMassIndex = bmi;
		birthDate = bd;
		
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
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public String getBloodType(){
		return bloodType;
	}
	
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	public double getBodyMassIndex(){
		return bodyMassIndex;
	}
	
	public void setBodyMassIndex(double bodyMassIndex){
		this.bodyMassIndex = bodyMassIndex;
	}
	
	public Date getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	
}