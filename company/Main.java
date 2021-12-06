package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here

        //  Java Program to convert long type variables into int
        long l=100;
        int I=(int)l;
        System.out.println("Int value " + I);

        //Java Program to convert int type variables into long
        long L = I;
        System.out.println("Long value " + L);

        //Java Program to convert boolean variables into string
        boolean b=true;
        String s=String.valueOf(b);
        System.out.println("String value " +s);

        //Java Program to convert string type variables into boolean
        String S="true";
        boolean B=Boolean.parseBoolean(S);
        System.out.println("Boolean value " +B);

        //Java Program to convert string type variables into int
        String s1="100";
        int i=Integer.parseInt(s1);
        System.out.println("Int value " +s);

        //Java Program to convert int type variables to String
        int i2=10;
        String s2=String.valueOf(i2);
        System.out.println("String value " +s2);

        //Java Program to convert int type variables to double
        int i3=200;
        double d3=i;
        System.out.println("Double value " +d3);

        //Java Program to convert double type variables to int
        double d5 = 21312.12;
        int i5 = (int)d5;
        System.out.println("Int value " +i5 );

        //Java Program to convert string variables to double
        String s6="23.6";
        double d6=Double.parseDouble(s6);
        System.out.println("Double " +d6);

        //Java Program to convert double type variables to string
        double d7=12.3;
        String s7=String.valueOf(d7);
        System.out.println(s7);

        //Java Program to convert primitive types to objects and vice versa
        int v1 = 6;
        double v2 = 1.2;
        boolean v3 = true;

        // Converts into  objects
        Integer o1 = Integer.valueOf(v1);
        Double o2 = Double.valueOf(v2);
        Boolean o3 = Boolean.valueOf(v3);

        if (o1 instanceof Integer) {
            System.out.println("Int to object ." +o1);
        }

        if (o2 instanceof Double) {
            System.out.println(" Double to object ." +o2);
        }

        if (o3 instanceof Boolean) {
            System.out.println("An object of Boolean is created" + o3);
        }

        //converts to primitive
            Integer obj1 = Integer.valueOf(50);
            Double obj2 = Double.valueOf(4.6);
            Boolean obj3 = Boolean.valueOf(true);

            // converts into primitive types
            int var1 = obj1.intValue();
            double var2 = obj2.doubleValue();
            boolean var3 = obj3.booleanValue();

            // print the primitive values
            System.out.println("Obj to int variable: " + var1);
            System.out.println("Obj double variable: " + var2);
            System.out.println("Obj boolean variable: " + var3);




    }
}
