package com.learn;

public class Main {
	public static void main(String[] args) {
		Universal universal=new Universal(30,20,10,20,"double");
		universal.setExtraGSM(10);
		universal.setGSM(10);
		System.out.println(universal.cost());
		AllFlapMeeting allFlapMeeting =new AllFlapMeeting(2,1,1,30,"single");
		allFlapMeeting.setExtraGSM(10);
		allFlapMeeting.setGSM(10);
		System.out.println(allFlapMeeting.cost());
		HoneyComb honeyComb=new HoneyComb(3,2,1,40,"single");
		honeyComb.setExtraGSM(10);
		honeyComb.setGSM(10);
		System.out.println(honeyComb.cost());
		ReverseTuckIn reverseTuckIn=new ReverseTuckIn(4,2,1,40,"double");
		reverseTuckIn.setExtraGSM(10);
		reverseTuckIn.setGSM(10);
		System.out.println(reverseTuckIn.cost());
		TopOpeningSnapLock topOpeningSnapLock = new TopOpeningSnapLock(5, 4, 2, 50, "single");
		topOpeningSnapLock.setExtraGSM(10);
		topOpeningSnapLock.setGSM(10);
		System.out.println(topOpeningSnapLock.cost());
	}
}
