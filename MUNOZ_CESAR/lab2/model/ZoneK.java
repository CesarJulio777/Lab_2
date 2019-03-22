package model;

public class ZoneK{
	
	//Atributes
	private double temp;
	private double quantityFood;
	
	//Relations
	private Environment envi1;
	private Environment envi2;
	private Environment envi3;
	
	
	public ZoneK(double temp, double qf, Environment envi1, Environment envi2, Environment envi3){
		this.temp = temp;
		quantityFood = qf;
		this.envi1 = envi1;
		this.envi2 = envi2;
		this.envi3 = envi3;
		
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
	
	
	public Environment getEnvi1(){
		return envi1;
	}
	
	public void setEnvi1(Environment envi1){
		this.envi1 = envi1;
	}
	
	public Environment getEnvi2(){
		return envi2;
	}
	
	public void setEnvi2(Environment envi2){
		this.envi2 = envi2;
	}
	
	public Environment getEnvi3(){
		return envi3;
	}
	
	public void setEnvi3(Environment envi3){
		this.envi3 = envi3;
	}
	



}
