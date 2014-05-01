//This is the Magical Box, No one knows how it works other than James Wasson.
package com.toyincremental.james;
import java.util.*;
public class Box
{
    long prevMillis;
    long rate;
    public Box(){
        prevMillis = (long)System.currentTimeMillis();
        rate = 1;
    }
    public void update(long rateChange){
        updateTime(rateChange);
        updateRate(rateChange);
    }
    private void updateTime(long rateChange){
        prevMillis = (long)(System.currentTimeMillis()-rate*(System.currentTimeMillis()-prevMillis)/(rate+rateChange));
    }
    private void updateRate(long rateChange){
        rate += rateChange;
    }
    public void subtractToys(long priceChange){
        prevMillis = (long)(System.currentTimeMillis()-1000*(getToys()-priceChange)/rate);
    }
    public int getToys(){
        return (int)(rate * (System.currentTimeMillis()-prevMillis)/1000);
    }
    public int getRate(){
        return (int)rate;
    }
}
