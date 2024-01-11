package CreativeDesignPattern;

interface  Ticket
{
	Ticket getTicket();
	
}

class MovieTicket implements Ticket {
	String showName;
	String showTime;
	String showDate;
	String screenNumber;
	String seatNumber;
	
	public MovieTicket(String showName, String showTime, String showDate, String screenNumber, String seatNumber) {
		super();
		this.showName = showName;
		this.showTime = showTime;
		this.showDate = showDate;
		this.screenNumber = screenNumber;
		this.seatNumber = seatNumber;
		
		
	}

	@Override
	public String toString() {
		return "MovieTicket [showName=" + showName + ", showTime=" + showTime + ", showDate=" + showDate
				+ ", screenNumber=" + screenNumber + ", seatNumber=" + seatNumber + "]";
	}

	public Ticket getTicket() {
		
		return new MovieTicket(showName,showTime,showDate,screenNumber,seatNumber);
		
	}

	private void MovieTicket(String showName2, String showTime2, String showDate2, String screenNumber2,
			String seatNumber2) {
		// TODO Auto-generated method stub
		
	}

	
}

public class ProtoTypeDemo1 {

	public static void main(String[] args) {
		
		MovieTicket mv1=new MovieTicket("salaar","5:30 p.m","11/01/24","1","24");
		System.out.println(mv1);
		
		Ticket t=mv1.getTicket();
		System.out.println(t);
		MovieTicket mv2=(MovieTicket)mv1.getTicket();
		System.out.println(mv2);
		
	}

}
