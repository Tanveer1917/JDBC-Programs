package com.Callable;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.JdbcUtil;

class Flight
{
	private int flightid;
	private String source;
	private String destination;
	private int noOfSeats;
	private double flightfare;
	
	
	public  Flight(int flightid, String source, String destination, int noOfSeats, double flightfare) {
		super();
		this.flightid = flightid;
		this.source = source;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.flightfare = flightfare;
	}
	
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getFlightfare() {
		return flightfare;
	}
	public void setFlightfare(double flightfare) {
		this.flightfare = flightfare;
	}
	
}

public class TestFlight {
	public boolean addFlight(Flight fobj)
	{
	try
	{
		Connection con=JdbcUtil.getConnection();
		//PreparedStatement ps=con.prepareStatement("insert into flight_info values(?,?,?,?,?)");
		PreparedStatement ps=con.prepareStatement("delete from  flight_info values(?,?,?,?,?)");
		
        ps.setInt(1, fobj.getFlightid());
        ps.setString(2, fobj.getSource());
        ps.setString(3, fobj.getDestination());
        ps.setInt(4, fobj.getNoOfSeats());
        ps.setDouble(5, fobj.getFlightfare());
        int result=ps.executeUpdate();
        int result1=ps.executeUpdate();
        if(result1>0)
        {
        	return true;
        }
        
        
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return false;
	}
	public static void main(String[] args) {
		
		Flight flight=(new Flight(102,"Pune","Belgavi",10,500.0));
		Flight flight1=(new Flight(105,"Goa","Bombay",13,800.0));
		Flight flight2=(new Flight(108,"Dubai","London",15,6500.0));
		TestFlight td=new TestFlight();
		
		if(td.addFlight(flight2))
		{
			System.out.println("Flight details added successfully");
		}else
		{
			System.out.println("Addition not done");
		}

		

	}

}
