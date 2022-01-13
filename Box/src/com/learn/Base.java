package com.learn;

public class Base {
	protected double length, width, height, area, flute;
	protected double pinOrPasting;
	protected String part;
	protected final static int A = 10,B = 30,C = 20,E = 40,F =50,G = 20; 
	protected double extraGSM;
	protected double GSM;
	public Base(double length, double width, double height, double pinOrPasting, String part)
	{
		this.length=length;
		this.width=width;
		this.height=height;
		this.area=length*width*height;
		this.pinOrPasting=pinOrPasting;
		this.part=part;
	}
	
	public double getExtraGSM() {
		return extraGSM;
	}

	public void setExtraGSM(double extraGSM) {
		this.extraGSM = extraGSM;
	}

	public double getGSM() {
		return GSM;
	}

	public void setGSM(double gSM) {
		GSM = gSM;
	}

	public double cost()
	{
		double totalGSM=extraGSM+GSM*100;
		double stitchingCost=pinOrPasting;
		return area*totalGSM*extraGSM*stitchingCost*(part.equals("double")?3:1);
	}
	
}
