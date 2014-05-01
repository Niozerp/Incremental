package com.toyincremental.james;
/**
 * Builder Called Chinese Factory
 * 
 * @James Wasson
 * @1.0
 */
public class ChineseFactory extends Builder
{
    public ChineseFactory(){
        singularName = "Chinese Factory";
        pluralName = "Chinese Factories";
        basePrice = 2000;
        rate = 200;
        currentPrice = basePrice;
    }
}
