package java384class.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Contact{
    private String name;
    private String phone;

    public Contact(){

    }

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void add(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public void update(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public void delete(String phone){
        if (phone.equals(this.phone)){
            this.name=null;
            this.phone=null;
        }
    }

    @Override
    public String toString() {
        return "name= " + name + ", phone=" + phone;
    }
}

public class ContactsManagement {
    public static void main(String[] args) {
        Contact c1=new Contact("Alamin", "01222679672");
        Contact c2=new Contact("Rakib", "01777768195");
        Contact c3=new Contact();
        c3.add("Rahim", "019555678914");


        Contact[] contacts= {c1,c2,c3};
        System.out.println("Printing contacts: ");
        for(Contact c:contacts){
            System.out.println(c);
        }

        c2.update("Rakib Mia", "0182267982");
        System.out.println("Printing contacts after update: ");
        for(Contact c:contacts){
            System.out.println(c);
        }

        //using a list
        List<Contact> contactList = new ArrayList<>(Arrays.asList(c1, c2, c3));
        System.out.println("Printing contacts: using a list");
        for(Contact c:contactList){
            System.out.println(c);
        }
    }
}
