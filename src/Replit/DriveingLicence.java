package Replit;

import java.util.Scanner;

public class DriveingLicence {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cydeo car insurance!");
        Scanner input=new Scanner(System.in);
        double premium=0.0;
        System.out.println("Enter your Full Name");
        String fullName= input.nextLine();
        System.out.println("Do you have US driving license");
        String licence= input.next().toLowerCase();
        if (licence.equals("no")){
            System.out.println("You must have license to get have insurance");
            System.exit(0);}
        System.out.println("Enter your zipcode");
        int zip= input.nextInt();
        if (zip==20910||zip==20740){premium+=60;

        } else if (zip==22102||zip==22103) {premium+=30;

        }else {premium+=50;}
        //System.out.println(premium);
        System.out.println("Is this vehicle owned,financed or leased?");
        String ownerShip=input.next().toLowerCase();
        switch (ownerShip){
            case "owned":premium+=10;
            break;
            case "financed":premium+=15;
                break;
            case "leased":premium+=20;
                break;
                        }

        System.out.println("How is this vehicle primarily used?");
        String primarly=input.next().toLowerCase();
        if (primarly=="business"){premium+=50;}
        else if (primarly=="pleasure")
        {premium+=10;  }
        else if(primarly=="commuting"){premium+=20;
            System.out.println("Days Driven To Work And/Or School");
           int daysdriven=input.nextInt();
           premium+=daysdriven*5;

        }
        System.out.println("How old are you");
        int age=input.nextInt();
        if (age<16){
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age>16&&age<20) {premium+=10;

        }else if(age>25){premium+=premium*2;}

        System.out.println("Have you had accidents in the last 5 years?");
        String accidents=input.next().toLowerCase();
        if (accidents.equals("yes")){
            System.out.println("How many?");
            int howMany=input.nextInt();
            premium+=howMany*10;
        }
        System.out.println("What is the highest level of education you have completed");
        String education=input.next().toLowerCase();
        if (education.equals("bachelors")||education.equals("masters")){
            premium = premium-(premium*0.05);
        } else if (education.equals("phd")) {premium=premium- (premium*0.1);

        } else if (education.equals("High School")) {premium+=premium*0.05;

        }
        String referenceNumber = fullName.toUpperCase().substring(0,2) + age + fullName.toUpperCase().substring(fullName.length()-2) + zip + education.toUpperCase().replace(" ","");
        System.out.println(fullName+" here's your quote!");
        System.out.println("This your start premium cost: "+ premium);
        System.out.println("This is your reference number: "+ referenceNumber);
        input.close();
    }
}
