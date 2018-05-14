package seven;
 class PhoneDome
{
	public static void main(String[]args) {

	Phone p=new Phone();
	
	System.out.println(p.getBrand()+"----"+p.getColor()+"----"+p.getPrice());
	
	p.setBrand("nokia");
	p.setColor("red");
	p.setPrice(1234);
	
	System.out.println(p.getBrand()+"----"+p.getColor()+"----"+p.getPrice());
	
	}
}
class Phone {
	private String brand;
	private int price;
	private String color;
	
	public String getBrand() {
		
		return brand;
		
		
	}
	public int getPrice(){
		
		return price;
		
		
	}
	public String getColor() {
		
		return color;
	}
	public void setBrand(String brand) {
		
		this.brand=brand;
	}
	public void setPrice(int price) {
		
		this.price=price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
}
