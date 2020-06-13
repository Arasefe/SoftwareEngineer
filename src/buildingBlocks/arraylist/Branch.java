package buildingBlocks.arraylist;

import java.util.ArrayList;

public class Branch {
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customerArrayList;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customerArrayList.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customerArrayList.size(); i++) {
            Customer checkedCustomer = this.customerArrayList.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
