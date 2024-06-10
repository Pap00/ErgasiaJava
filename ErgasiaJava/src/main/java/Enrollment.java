public class Enrollment implements InterfacePriceList{
	private int code;
	private String athlete;
	private String date;
	private int cost;
	private int sale;
	
	Enrollment(int code, String athlete, String date, int cost, int sale){
		this.code=code;
		this.athlete=athlete;
		this.date=date;
		this.cost=cost;
		this.sale=sale;				
	}
	
	public String calculateTotalPrice() {		
		return null;
	}
	
	
	
}
