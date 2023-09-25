package com.example.clover.clu;

/**
 * Created by Nishanth on 20-03-2017.
 */

public class Singleton {

    public int resultcs,resultss,resultdb;
    public  String cssf,cssf2,sssf,sssf2,dbsf,dbsf2;
    public  int i=0,j=0;
    public  int[] csusar=new int[11];
    public  int[] ssusar=new int[8];
    public  int[] clusar=new int[8];

    public  int[] js=new int[11];
    public  int[] objc=new int[11];
    public  int[] angjs=new int[11];
    public  int[] swift=new int[11];
    public  int[] jquery=new int[11];
    public  int[] python=new int[11];

    public  int[] php=new int[8];
    public  int[] aspnet=new int[8];
    public  int[] coldfusion=new int[8];
    public  int[] python1=new int[8];
    public  int[] nodejs=new int[8];
    public  int[] jsp=new int[8];
    public  int[] perl=new int[8];

    public  int[] mysql=new int[8];
    public  int[] oracle=new int[8];
    public  int[] sqllite=new int[8];
    public  int[] microsoftsql=new int[8];

    private static Singleton singleton = new Singleton( );

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton() { }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        return singleton;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}
