package sec_8_arays_java_inbuilt_lists_autoboxing_unboxing.arraylist_challenge;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String name, String phone) {
        this.phoneNumber = phone;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
