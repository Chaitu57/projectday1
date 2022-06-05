package com.netbanking.main.pojo;

public class FixedDepositeMaster {
	
	private int fixedDepositeID;
	private int duration;
	private double fixedDepositeRateOfInterest;
	
	public FixedDepositeMaster() {
		// TODO Auto-generated constructor stub
	}

	public FixedDepositeMaster(int fixedDepositeID, int duration, double fixedDepositeRateOfInterest) {
		super();
		this.fixedDepositeID = fixedDepositeID;
		this.duration = duration;
		this.fixedDepositeRateOfInterest = fixedDepositeRateOfInterest;
	}

	public int getFixedDepositeID() {
		return fixedDepositeID;
	}

	public void setFixedDepositeID(int fixedDepositeID) {
		this.fixedDepositeID = fixedDepositeID;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFixedDepositeRateOfInterest() {
		return fixedDepositeRateOfInterest;
	}

	public void setFixedDepositeRateOfInterest(double fixedDepositeRateOfInterest) {
		this.fixedDepositeRateOfInterest = fixedDepositeRateOfInterest;
	}

	@Override
	public String toString() {
		return "FixedDepositeMaster [fixedDepositeID=" + fixedDepositeID + ", duration=" + duration
				+ ", fixedDepositeRateOfInterest=" + fixedDepositeRateOfInterest + "]";
	}
	
	

}
