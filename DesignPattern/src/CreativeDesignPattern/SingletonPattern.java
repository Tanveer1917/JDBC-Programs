package CreativeDesignPattern;

class Service {
	String servicename;
	String serviceStarTime;
	String ServiceEndTime;

	private Service() {

	}

	private Service(String serviceName, String st, String set) {
		this.servicename = serviceName;
		serviceStarTime = st;
		ServiceEndTime = set;

	}

	static Service service;

	public static Service getsingleServiceInstance(String name, String st, String en) 
	{
		if (service==null) 
		{

			service = new Service(name, st, en);
		}
		return service;

	}

}

public class SingletonPattern {

	public static void main(String[] args) {

		Service s1Service = Service.getsingleServiceInstance("tomcat", "4:20AM", "4:50AM");
		Service s2Service = Service.getsingleServiceInstance("zomato", "7:20AM", "8:50AM");
        System.out.println(s1Service.hashCode()+s2Service.hashCode());
       
	}

}
