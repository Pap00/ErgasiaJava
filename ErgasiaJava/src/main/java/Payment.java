
public class Payment implements Pricelist{

	private String uniqueCode;
	private String date;
	private String methodOfPayment;
	private String regOrSig; //register or signup
	private long int totalPrice;
	
	Payment(String uniqueCode,String date,String methodOfPayment,String regOrSig,long int totalPrice){
		this.uniqueCode= uniqueCode;
		this.date = date;
		this.methodOfPayment = methodOfPayment;
		this.regOrSig = regOrSig;
		this.totalPrice = totalPrice;
	}
	
	
	
	String getUniqueCode() {
		return uniqueCode;
	}
	
	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
	}
	
	String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	String getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	String getRegOrSig() {
		return RegOrSig;
	}
	
	public void setRegOrSig(String regOrSig) {
		this.RegOrSig= RegOrSig;
	}
	
	long int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(long int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
