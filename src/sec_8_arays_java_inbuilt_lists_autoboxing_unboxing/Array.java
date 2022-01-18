package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing;

import sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.arraylist_challenge.Contact;
import sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.arraylist_challenge.MobilePhone;
import sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.list_and_array_list.GroceryList;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();
    public static MobilePhone mobilePhone = new MobilePhone("01151742505");


    /////////////////////////////////// ArrayList Challenge //////////////////////////////////////


    public void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts.\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - To remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions."
        );
        System.out.println("Choose your action: ");
    }

    public static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " +
                existingContactRecord.getName() +
                " phone number is " +
                existingContactRecord.getPhoneNumber());
    }


    public static void printContact() {
        mobilePhone.printContacts();
    }


    /////////////////////////////////// ArrayList //////////////////////////////////////
    public static void printInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("please Enter the Grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current Item name: ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }


    public static void removeItem() {
        System.out.println("please Enter the Grocery Item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.println("Item to search for:  ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];

        myArray = groceryList.getGroceryList().toArray(myArray);
    }


    ///////////////////////////////////Reverse Array Challenge//////////////////////////////////////
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
    }

    ///////////////////////////////////Minimum Element Challenge//////////////////////////////////////
    public static int readInteger() {
        int count;
        System.out.println("Please Enter Array Size: ");
        count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count) {
        System.out.println("Enter " + count + " integer values.");
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    ///////////////////////////////////Sorted Array Challenge//////////////////////////////////////
    public static int[] getIntegers(int arrSize) {
        int[] array = new int[arrSize];
        System.out.println("Enter " + arrSize + " integer values.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ", typed value was " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int temp;
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = arr[i];
        }
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
