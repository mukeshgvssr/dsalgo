package dsalgo;

import java.util.StringTokenizer;

public class AngleHMhands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String time = "0:15"; 
     System.out.println("Acute Angle between Hours and Minutes hands in 12HR clock is:"+findHMAngle(time) );
     
	}
	static double findHMAngle(String timeNow)
	{
		double hour=0,minute=0,accuteAngle;
		StringTokenizer st=new StringTokenizer(timeNow,":");
		String strHour=st.nextToken();
		String strMin=st.nextToken();
		hour =Integer.parseInt(strHour)*30+Integer.parseInt(strMin)*0.5;
		minute=Integer.parseInt(strMin)*6;
		accuteAngle=Math.abs(hour-minute);
		if( accuteAngle > 180)
			return (360-accuteAngle);
		else
			return accuteAngle;
	}
	

}
