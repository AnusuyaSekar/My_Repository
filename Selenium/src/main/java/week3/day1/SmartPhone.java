package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp() {
		System.out.println("Connect whatsapp");
		
	}
	public void takeVideo() {
		System.out.println("Take Video in smartphone");
		
	}

	public static void main(String[] args) {
		AndroidPhone ap= new AndroidPhone();
		ap.takeVideo();
		
		
		SmartPhone smart = new SmartPhone();
		smart.sendMsg();
		smart.makeCall();
		smart.saveContact();
		smart.connectWhatsapp();
		smart.takeVideo();
		
	System.out.println(smart.instanceOF SmartPhone);
	
	Arrays.so

	}

}
