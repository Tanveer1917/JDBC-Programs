package CreativeDesignPattern;

class TV
{
	String brandName;
	String  size;
	double price;
	
	
	public TV(String brandName, String size, double price) {
		super();
		this.brandName = brandName;
		this.size = size;
		this.price = price;
	}


	public String getBrandName() {
		return brandName;
	}


	public String getSize() {
		return size;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Tv [brandName=" + brandName + ", size=" + size + ", price=" + price + "]";
	}
}
	
	class TVBuilder
	{
		String brandName;
		String  size;
		double price;
		
		public TVBuilder setBrandName(String bname) {
			brandName = bname;
			return this;
		}
		public TVBuilder setSize(String size) {
			this.size = size;
			return this;
		}
		public TVBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public TV getTv()
		{
			return new TV(brandName,size,price);
		
		
	}
	
}

public class TestBuilderPattern {

	public static void main(String[] args) {
		
		TV tv = new TVBuilder().setBrandName("SONY").getTv();
		System.out.println(tv);
		
		TV tv1=new TVBuilder().setBrandName("LG").setPrice(45000.00).getTv();
		System.out.println(tv1);
		TV tv2=new TVBuilder().setSize("46").getTv();
		System.out.println(tv2);
		
		

	}
}

