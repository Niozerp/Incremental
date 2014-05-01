package com.toyincremental.james;
/**
 * Foundation for all future Builers. They should extend this class.
 * 
 * @James Wasson
 * @1.0
 */
public class Builder
{
    int basePrice;
    String pluralName;
    String singularName;
    int rate;
    int currentPrice;
    double priceIncreaseRate = 1.1;
    int numPurchased;
    public Builder(){//initalize all variables here.
    }
    public void purchase(){
        currentPrice = (int)(basePrice*Math.pow(priceIncreaseRate,++numPurchased));
    }
    //getters
    public String getPluralName(){
        return pluralName;
    }
    public String getSingularName(){
        return singularName;
    }
    public int getPrice(){
        return currentPrice;
    }
    public int getRate(){
        return rate;
    }
    public int getNumPurchased(){
        return numPurchased;
    }
}