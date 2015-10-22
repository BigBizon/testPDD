import java.awt.Image;
import java.util.ArrayList;

public class ImageVol1 {

	ArrayList<String> imageVol1 = new ArrayList<String>();
	ArrayList<String> imageVol2 = new ArrayList<String>();
	ArrayList<String> imageVol3 = new ArrayList<String>();
	ArrayList<String> imageVol4 = new ArrayList<String>();
	ArrayList<String> imageVol5 = new ArrayList<String>();
	
	ArrayList<String> imageVolAll = new ArrayList<String>();

	public String vol1() {
		int a = (int) (Math.random() * 3);

		imageVol1.add("res/7.jpg");
		imageVol1.add("res/8.jpg");
		imageVol1.add("res/9.jpg");

		return imageVol1.get(a);
	}
	public String vol2() {
		int a = (int) (Math.random() * 3);

		imageVol2.add("res/17.jpg");
		imageVol2.add("res/16.jpg");
		imageVol2.add("res/15.jpg");

		return imageVol2.get(a);
	}
	public String vol3() {
		int a = (int) (Math.random() * 3);

		imageVol3.add("res/12.jpg");
		imageVol3.add("res/13.jpg");
		imageVol3.add("res/14.jpg");

		return imageVol3.get(a);
	}
	public String vol4() {
		int a = (int) (Math.random() * 3);

		imageVol4.add("res/10.jpg");
		imageVol4.add("res/10.jpg");
		imageVol4.add("res/11.jpg");

		return imageVol4.get(a);
	}
	public String volAll() {
		int a = (int) (Math.random() * 800);

		imageVolAll.add(vol1());
		imageVolAll.add(vol2());
		imageVolAll.add(vol3());
		imageVolAll.add(vol4());
		
		
		return imageVol1.get(a);
	}
}
