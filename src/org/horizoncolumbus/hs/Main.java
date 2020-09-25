package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean junior = false;
        boolean senior = false;
        boolean teacher = false;
        boolean admin = true;
        boolean CTE = false;
        boolean Home = true;


        if(junior && CTE || senior && CTE){
            System.out.println("Windows laptop given");
        }else if(teacher && Home || admin && Home){
            System.out.println("Macbook given");
        }else{
            System.out.println("Chromebook given");
        }

    }
}
