package model; 

public class Environment{
	
	//Atributes
	private double area;
	
	//Relations 
	private Kangaroo k1;
	private Kangaroo k2;
	private Kangaroo k3;
	
	public Environment(double area, Kangaroo k1, Kangaroo k2, Kangaroo k3){
		this.area = area;
		this.k1 = k1;
		this.k2 = k2;
		this.k3 = k3;
	}
	
	public double getArea(){
		return area;
	}
	
	public void setArea(double area){
		this.area = area;
	}
	
	public Kangaroo getK1(){
		return k1;
	}
	
	public void setK1(Kangaroo k1){
		this.k1 = k1;
	}
	
	public Kangaroo getK2(){
		return k2;
	}
	
	public void setK2(Kangaroo k2){
		this.k2 = k2;
	}
	
	public Kangaroo getK3(){
		return k3;
	}
	
	public void setK3(Kangaroo k3){
		this.k3 = k3;
	}


}