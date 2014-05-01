package com.toyincremental.james;
/**
 * Builder Called Hammer
 * 
 * @James Wasson
 * @1.0
 */
public class Hammer extends Builder
{
    public Hammer(){
        singularName = "Hammer";
        pluralName = "Hammers";
        basePrice = 20;
        rate = 1;
        currentPrice = basePrice;
    }
}
