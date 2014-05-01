package com.toyincremental.james;
/**
 * Builder Called ChineseWorker
 * 
 * @James Wasson
 * @1.0
 */
public class ChineseWorker extends Builder
{
    public ChineseWorker(){
        singularName = "Chinese Worker";
        pluralName = "Chinese Workers";
        basePrice = 500;
        rate = 30;
        currentPrice = basePrice;
    }
}
