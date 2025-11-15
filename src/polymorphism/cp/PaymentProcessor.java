package polymorphism.cp;

// Method Overloadding
public class PaymentProcessor 
{
	public void processPayment(String cardNumber,String expiryDate,int cvv) 
	{
		// credit card
		System.out.println("Processing payment via Credit Card...");
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Payment Successful using Credit Card.\n");
	} 
	public void processPayment(String upiId) 
	{
		// UPI
	   System.out.println("Processing payment via UPI...");
       System.out.println("UPI ID: " + upiId);
       System.out.println("Payment Successful using UPI.\n");
	} 
	public void processPayment(String walletId, int otp) 
	{
		// Wallet
		System.out.println("Processing payment via Wallet...");
		System.out.println("Wallet ID: " + walletId);
		System.out.println("OTP Verified: " + otp);
		System.out.println("Payment Successful using Wallet.\n");
	}

	private String maskCardNumber(String cardNumber) 
	{
		if (cardNumber.length() > 4)
		{
			return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
		}
		return cardNumber;
	}

	public static void main(String[] args) 
	{
		PaymentProcessor payment = new PaymentProcessor();

		// credit card
		payment.processPayment("123456789", "12/27", 345);

		// upi
		payment.processPayment("rahul@upi");

		// wallet
		payment.processPayment("wallet123", 7890);
	}
}
