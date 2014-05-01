package com.toyincremental.james;
/**
 * Holds all of the Builders in an Array so that the Menu class doesn't have to deal with it.
 * 
 * @James Wasson
 * @1.0
 */
import java.util.ArrayList;
public class WorkerList
{
    public static ArrayList<Builder> getBuilders(){
        ArrayList<Builder> group = new ArrayList<Builder>();
        group.add(new Hammer());
        group.add(new Elf());
        group.add(new ChineseWorker());
        group.add(new ChineseFactory());
        group.add(new China());
        group.add(new Planet());
        return group;
    }
}