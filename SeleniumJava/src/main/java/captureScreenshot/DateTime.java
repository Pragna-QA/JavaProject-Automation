package captureScreenshot;

import java.text.SimpleDateFormat;

public class DateTime {

public static void main(String[] args) {
	
	 	
		DateTime d=new DateTime();
		
		System.out.println("Current format "+d);

		SimpleDateFormat myformat=new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		
		String newFormat=myformat.format(d);
		
		System.out.println("New Date Format "+newFormat);
		
	}

}