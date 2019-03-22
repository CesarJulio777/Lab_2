package model; 

public class Exhibition{
	
	//Atributes
	private double area;
	private String name;
	
	//Relations
	private ZoneK zonK;
	private ZoneD zonD;
	
	
	public Exhibition(double ar, String nam, ZoneK zonK, ZoneD zonD){
		area = ar;
		name = nam;
		this.zonK = zonK;
		this.zonD = zonD;
	}
	
	public double getArea(){
		return area;
	}
	
	public String getName(){
		return name;
	}
	
	public void setArea(double area){
		this.area = area;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public ZoneK getZonK(){
		return zonK;
	}
	
	public ZoneD getZonD(){
		return zonD;
	}
	
	public void setZonK(ZoneK zonK){
		this.zonK = zonK;
	}
	
	public void setZonD(ZoneD zonD){
		this.zonD = zonD;
	}


}