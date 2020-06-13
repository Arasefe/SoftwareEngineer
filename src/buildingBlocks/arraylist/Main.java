package buildingBlocks.arraylist;

public class Main {
    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("BOA");                            //Constructor

        if (bank.addBranch("Schuamburg")) {
            System.out.println("Schuamburg branch created");
        }

        bank.addCustomer("Schuamburg", "Ismail YILDIRIM", 50.05);
        bank.addCustomer("Schuamburg", "Banu YILDIRIM", 175.34);
        bank.addCustomer("Schuamburg", "Aras YILDIRIM", 220.12);

        bank.addBranch("Elk Grove");
        bank.addCustomer("Elk Grove", "Tulpar YILDIRIM", 150.54);

        bank.addCustomerTransaction("Schuamburg", "Ismail YILDIRIM", 44.22);
        bank.addCustomerTransaction("Schuamburg", "Banu YILDIRIM", 12.44);
        bank.addCustomerTransaction("Schuamburg", "Aras YILDIRIM", 1.65);

        bank.listCustomers("Schuamburg", true);
        bank.listCustomers("Elk Grove", true);

        bank.addBranch("Paletines");

        if (!bank.addCustomer("Paletines", "Alper YILMAZ", 5.53)) {
            System.out.println("Error Paletines branch does not exist");
        }

        if (!bank.addBranch("Schuamburg")) {
            System.out.println("Schuamburg branch already exists");
        }

        if (!bank.addCustomerTransaction("Schuamburg", "Ahmet HAKAN", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Schuamburg", "Ismail YILDIRIM", 12.21)) {
            System.out.println("Customer already exists");
        }
        }
    }
