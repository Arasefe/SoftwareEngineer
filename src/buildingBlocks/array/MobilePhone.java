package buildingBlocks.array;

import java.util.ArrayList;

public class MobilePhone {
    /**
     * Create a program that implements a simple mobile phone with the following capabilities.
     * Able to store, modify, remove and query contact names.
     * Create a separate class for Contacts (name and phone number).
     * Create a master class (MobilePhone) that holds the ArrayList of Contacts
     * The MobilePhone class has the functionality listed above.
     * Add a menu of options that are available.
     * Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact.
     * When adding or updating be sure to check if the contact already exists (use name)
     * Be sure not to expose the inner workings of the Arraylist to MobilePhone e.g. no ints, no .get(i) etc
     * MobilePhone should do everything with Contact objects only.
     */
    private String phoneNumber;
    private ArrayList<Contact>myContacts;

    public MobilePhone(String phoneNumber){
        this.phoneNumber=phoneNumber;
        this.myContacts=new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on the file");
        }
        myContacts.add(contact);
        return true;
    }
    public boolean removeContact(Contact contact){
        int foundPosition=findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+", was not found. ");
            return false;
        }
        System.out.println(contact.getName()+ " , was found and removed from the contacts");
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    public boolean updateContact (Contact oldContact, Contact newContact){
        int foundPosition=findContact(oldContact);
        if(foundPosition<0){
            System.out.println("The position of the "+oldContact.getName()+ "was not found");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+", was replaced with "+newContact.getName());
        return true;
    }
    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }


    private int findContact(String contactName){
        for(int i=0;i<this.myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }

        }
        return-1;
    }
}