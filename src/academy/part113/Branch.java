package academy.part113;

import java.util.ArrayList;

public class Branch {
    String branchName;
    ArrayList<Customer> customerList;

    public Branch(String branchName, Customer customer) {
        this.branchName = branchName;
        customerList = new ArrayList<>();
        customerList.add(customer);
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public int findCustomerNumberByName(String name) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addCustomer(String name, double transactionAmount) {
        if (findCustomerNumberByName(name) != -1) {
            Customer customer = new Customer(name, transactionAmount);
            customerList.add(customer);
            return true;
        }
        return false;
    }

    public boolean addTransactionToCustomer(String name, double transactionAmount) {
        if (findCustomerNumberByName(name) != -1) {
            customerList.get(findCustomerNumberByName(name)).getTransactionList().add(transactionAmount);
            return true;
        }
        return false;
    }

}
