package edu.orangecoastcollege.cs273.kfrederick5.tipcalculator;

/**
 * Created by kfrederick5 on 9/8/2016.
 */
public class RestaurantBill {
    private double mAmount;
    private double mTipPercent;
    private double mTipAmount;
    private double mTotalAmount;

    public RestaurantBill() {
        mAmount = 0.0;
        mTipPercent = 0.0;
        mTipAmount = 0.0;
        mTotalAmount = 0.0;
    }

    public RestaurantBill(double mAmount, double mTipPercent) {
        this.mAmount = mAmount;
        this.mTipPercent = mTipPercent;
        recalcAmounts();
    }

    public double getAmount() {
        return mAmount;
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public double getTipAmount() {
        return mTipAmount;
    }

    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setAmount(double mAmount) {
        this.mAmount = mAmount;
        recalcAmounts();
    }

    public void setTipPercent(double mTipPercent) {
        this.mTipPercent = mTipPercent;
        recalcAmounts();
    }

    private void recalcAmounts()
    {
        mTipAmount = mAmount*mTipPercent;
        mTotalAmount = mAmount + mTipAmount;
    }
}
