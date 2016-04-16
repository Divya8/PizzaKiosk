package com.company;
import com.sun.xml.internal.stream.Entity;

import java.util.*;

import static com.company.Crust.tkortn.thick;

public class Pizza
{

    Crust TOC;
    enum size {small, medium, large}

    public size s;
    Toppings TOT;
}
class Crust
{
        enum  tkortn {thick,thin}
        public tkortn t;
        float stuff_level;
        void set_tkortn(tkortn tk_tn) {
            t = tk_tn;
        }


        void set_stuff_level(float us_stuff_level) {
            stuff_level = us_stuff_level;
        }

}
class Toppings
{
    String top_name;

    enum top_type {veg, non_veg}
    public top_type t ;
}
    class Packaging {
        float retain_heat;

        void set_retain_heat(float us_retain_heat) {
            retain_heat = us_retain_heat;
        }

    }


    public static void main(String[] args) {
	// write your code here
        Pizza p =new Pizza();
        Crust c=new Crust();
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello Sir!Order please");
        System.out.println("What kind of Crust do yu prefer?");
        if(sc.next().toUpperCase().equals("THICK"))
        {
            c.set_tkortn(thick);












    }
}
