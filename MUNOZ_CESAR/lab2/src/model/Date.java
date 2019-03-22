package model;

public class Date{
	
	//Atributes
	private int week;
	private int day;
	private int month;
	private int year;
	
	public Date(int wk, int day, int mo, int yea){
		week = wk;
		this.day = day;
		month = mo;
		year = yea;
	}
	
	public int getWeek(){
		return week;
	}
	
	public void setWeek(int week){
		this.week = week;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public int getMonth(){
		return month; 
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}


}