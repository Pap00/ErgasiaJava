
public class Payment implements Pricelist{

	private String uniqueCode;
	private String date;
	private char methodOfPayment;
	private String regOrSig; //register or signup
	private long int totalPrice;
	
	Payment(String uniqueCode,String date,char methodOfPayment,String regOrSig,long int totalPrice){
		this.uniqueCode= uniqueCode;
		this.date = date;
		this.methodOfPayment = methodOfPayment;
		this.regOrSig = regOrSig;
		this.totalPrice = totalPrice;
	}
	
	
	
	String getUniqueCode() {
		return uniqueCode;
	}
	
	public void setUniqueCode() {
		this.uniqueCode = uniqueCode;
	}
	
	String getDate() {
		return date;
	}
	
	public void setDate() {
		this.date = date;
	}
	
	char getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment() {
		this.methodOfPayment = methodOfPayment;
	}

	String getRegOrSig() {
		return RegOrSig;
	}
	
	public void setRegOrSig() {
		this.RegOrSig= RegOrSig;
	}
	
	long int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice() {
		this.totalPrice = totalPrice;
	}
	
}
