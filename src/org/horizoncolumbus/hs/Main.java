package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean junior = true;
        boolean senior = false;
        boolean teacher = false;
        boolean admin = false;
        boolean CTE = false;
        boolean Home = false;


        if(junior || senior && CTE){
            System.out.println("Windows laptop given");
        }else if(teacher || admin && Home){
            System.out.println("Macbook given");
        }else{
            System.out.println("Chromebook given");
        }

    }
}
