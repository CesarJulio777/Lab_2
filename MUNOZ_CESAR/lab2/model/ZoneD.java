package model;

public class ZoneD{
	
	//Atributes
	private double temp;
	private double quantityFood;
	
	//Relations
	private BeardedDragon d1;
	private BeardedDragon d2;
	
	
	public ZoneD(double temp, double qf, BeardedDragon d1, BeardedDragon d2){
		this.temp = temp;
		quantityFood = qf;
		this.d1 = d1;
		this.d2 = d2;
	
	}
	
	public double getTemp(){
		return temp;
	}
	
	public void setTemp(double temp){
		this.temp = temp;
	}
	
	public double getQuantityFood(){
		return quantityFood;
	}
	
	public void setQuantityFood(double quantityFood){
		this.quantityFood = quantityFood;
	}
	
	
	public BeardedDragon getD1(){
		return d1;
	}
	
	public void setD1(BeardedDragon d1){
		this.d1 = d1;
	}
	
	public BeardedDragon getD2(){
		return d2;
	}
	
	public void setD2(BeardedDragon d2){
		this.d2 = d2;
	}
	




}
