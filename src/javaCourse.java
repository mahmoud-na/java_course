import sec_7_oop_master_challenge.DeluxeBurger;
import sec_7_oop_master_challenge.Hamburger;
import sec_7_oop_master_challenge.HealthyBurger;

import java.util.Scanner;


public class javaCourse {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//            int age = (2021 - yearOfBirth);
//            if(age >= 0 && age<=100 ){
//                System.out.println("Your age is: " +age);
//            }else{
//                System.out.println("Invalid year of birth");
//            }
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//            System.out.println("Your Name is: " + name);
//        } else {
//            System.out.printf("Unable parse a year of birth");
//        }
//
//
//        scanner.close();
//        inputThenPrintSumAndAverage();
//        System.out.println(getBucketCount(3.4,2.1,1.5,2));

//
//        BankAccount account = new BankAccount("123456789",0.00,"Amr Nagy","amr@gmail.com","4031");
//        account.depositFunds(5000);
//        System.out.println("Your Balance is: " + account.getBalance()+ " $");
//        account.withdrawFunds(10000);
//        System.out.println("Your Balance is: " + account.getBalance()+ " $");
//
//        BMW bmw = new BMW(36);
//        bmw.accelerate(30);

//        Circle circle = new Circle(3.75);
//        System.out.println("radius "+ circle.getRadius());
//        System.out.println("area "+ circle.getArea());
//
//        Cylinder cylinder =new Cylinder(5.55,7.25);
//        System.out.println("from cylinder radius "+ cylinder.getRadius());
//        System.out.println("from cylinder height "+ cylinder.getHeight());
//        System.out.println("from cylinder area "+ cylinder.getArea());
//        System.out.println("from cylinder volume "+ cylinder.getVolume());


        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            int bucketsNeeded = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
//            System.out.println("Area: " + area + " Bucket needed without extras: "+ (area/areaPerBucket)+" just bucket Needed only: "+ bucketsNeeded );
            return bucketsNeeded;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width > 0 && height > 0 && areaPerBucket > 0) {
            int bucketsNeeded = (int) Math.ceil(((width * height) / areaPerBucket));
//            System.out.println("Area: " + area + " Bucket needed without extras: "+ (area/areaPerBucket)+" just bucket Needed only: "+ bucketsNeeded );
            return bucketsNeeded;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area > 0 && areaPerBucket > 0) {
            int bucketsNeeded = (int) Math.ceil((area / areaPerBucket));
//            System.out.println("Area: " + area + " Bucket needed without extras: "+ (area/areaPerBucket)+" just bucket Needed only: "+ bucketsNeeded );
            return bucketsNeeded;
        } else {
            return -1;
        }
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter = 1;
        boolean hasNextInt;
        while (true) {
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                avg = (int) Math.round((double) sum / counter);
            } else {
                break;
            }
            counter++;
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

    public static void minAndMaxInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max;
        int min;
        boolean hasNextInt;
        System.out.println("Enter number:");
        hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            number = scanner.nextInt();
            max = number;
            min = number;
            while (true) {
                System.out.println("Enter number:");
                hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    number = scanner.nextInt();
                    if (number >= max) {
                        max = number;
                    } else if (number <= min) {
                        min = number;
                    }
                } else {
                    System.out.println("Invalid Number");
                    System.out.println("Maximum Number: " + max + " ,And Minimum Number: " + min);
                    break;
                }
                scanner.nextLine();
            }

        } else {
            System.out.println("Invalid First Input");
        }

        scanner.close();
    }

    public static void takeTenNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt;
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                counter++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
