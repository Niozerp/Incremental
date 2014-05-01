package com.toyincremental.james;
/**
 * Builder Called Planet
 * 
 * @James Wasson
 * @1.0
 */
public class Planet extends Builder
{
    public Planet(){
        singularName = "Planet";
        pluralName = "Planets";
        basePrice = 10000000;
        rate = 30000;
        currentPrice = basePrice;
    }
}
