package week1.day1;

public class Mobile {
	String mobileBrandName = "Samsung";
	char mobileLogo = 'S';
	short noOfMobilePiece = 3;
	int modelNumber = 11;
	long mobilelmeiNumber = 3453654645l;
	float mobilePrice = 21000.59f;
	boolean isDamaged = false;
	
	

	public static void main(String[] args) {
		Mobile details = new Mobile();
		System.out.println(details.mobileBrandName);
		System.out.println(details.mobileLogo);
		System.out.println(details.noOfMobilePiece);
		System.out.println(details.modelNumber);
		System.out.println(details.mobilelmeiNumber);
		System.out.println(details.mobilePrice);
		System.out.println(details.isDamaged);

	}

}
