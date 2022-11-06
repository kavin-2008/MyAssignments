package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
    long chassisNumer = 3833438434L;
    boolean isPunctured = true;
    String bikeName = "Hero Honda";
    double runningKM = 2055.45;
    

	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		System.out.println(tw.noOfWheels);
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.chassisNumer);
		System.out.println(tw.isPunctured);
		System.out.println(tw.bikeName);
		System.out.println(tw.runningKM);
	}

}
