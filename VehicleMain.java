//Vehicle
package com.ltts;


import java.util.Scanner;

//Vehicle class
class Vehicle
{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
	{
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	
	void displayMake()
	{
		System.out.println("Make:"+(this.make));
	}
	void displayBasicinfo()
	{
		System.out.println("****"+(this.getMake())+"****");
		System.out.println("----Basic Information ----");
		System.out.println("Vehicle Number:"+(this.vehicleNumber));
		System.out.println("Fuel Capacity:"+(this.fuelCapacity));
		System.out.println("Fuel Type:"+(this.fuelType));
		System.out.println("CC:"+(this.cc));
	}
	void displayDetailInfo()
	{
		
	}
}

class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}



	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}



	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		//TwoWheeler Constructor 
		this.kickStartAvailable=kickStartAvailable;
	}

	
	
	void displayDetailInfo()
	{
		System.out.println("----Detail Information----");
		String s;
		if(this.kickStartAvailable)
		{
			s="yes";
		}
		else
		{
			s="no";
		}
		System.out.println("kick Start Available:"+s.toUpperCase());
	}
}

class FourWheeler extends Vehicle
{
	private String audioSystem;
	private int numberOfDoors;
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		//FourWheeler constructor
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
	}
	void displayDetailInfo()
	{
		System.out.println("----Detail Information----");
		System.out.println("Audio System:"+(this.audioSystem));
		System.out.println("Number of Doors:"+(this.numberOfDoors));
	}
}



public class VehicleMain {
	public static void main(String[] args) {
		int ch;
		String vmake = null;
		String vnum = null;
		String ftype= null;
		int fcap=0;
		int cc=0;
		boolean Kick=false;
		String kick1;
		String audio= null;
		int numd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		ch=sc.nextInt();
		if(ch==1)
		{
			FourWheeler v1=new FourWheeler(vmake, vnum, ftype, fcap, cc, audio, numd);
			//vehicle make
			System.out.println("Vehicle Make:");
			vmake=sc.next();
			v1.setMake(vmake);
			//vehicle number
			System.out.println("Vehicle Number:");
			vnum=sc.next();
			v1.setVehicleNumber(vnum);
			//Fuel type
			System.out.println("Fuel Type:\n1.Petrol \n2.Deisel");
			ch=sc.nextInt();
			if(ch==1)
			{
				v1.setFuelType("Petrol");
			}
			else
			{
				v1.setFuelType("Diesel");
			}
			//fuel capacity
			System.out.println("Fuel Capacity:");
			fcap=sc.nextInt();
			v1.setFuelCapacity(fcap);
			//engine CC
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			v1.setCc(cc);
			//audio system
			System.out.println("Audio System:");
			audio=sc.next();
			v1.setAudioSystem(audio);
			//number of doors
			System.out.println("Number of doors:");
			numd=sc.nextInt();
			v1.setNumberOfDoors(numd);
			
			v1.displayBasicinfo();
			v1.displayDetailInfo();
			
		}
		else
		{
			TwoWheeler v1=new TwoWheeler(vmake, vnum, ftype, fcap, cc, Kick);
			//vehicle make
			System.out.println("Vehicle Make:");
			vmake=sc.next();
			v1.setMake(vmake);
			//vehicle number
			System.out.println("Vehicle Number:");
			vnum=sc.next();
			v1.setVehicleNumber(vnum);
			//Fuel type
			System.out.println("Fuel Type:\n1.Petrol \n2.Deisel");
			ch=sc.nextInt();
			if(ch==1)
			{
				v1.setFuelType("Petrol");
			}
			else
			{
				v1.setFuelType("Diesel");
			}
			//fuel capacity
			System.out.println("Fuel Capacity:");
			fcap=sc.nextInt();
			v1.setFuelCapacity(fcap);
			//engine CC
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			v1.setCc(cc);
			//kick start
			System.out.println("kick Start Available(yes/no):");
			kick1=sc.next();
			if(kick1.equals("yes"))
			{
				v1.setKickStartAvailable(true);
			}
			else
			{
				v1.setKickStartAvailable(false);
			}
			
			
			v1.displayBasicinfo();
			v1.displayDetailInfo();
		}
	}
}
