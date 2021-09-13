package academy.exercise45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        branch.newCustomer(customerName, initialTransaction);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        branch.addCustomerTransaction(customerName, transaction);
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        System.out.println("Customers details for branch " + branchName);
        for (int i = 0; i < branch.getCustomers().size(); i++) {
            System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                for (int y = 0; y < branch.getCustomers().get(i).getTransactions().size(); y++) {
                    System.out.println("[" + (y + 1) + "] Amount " + branch.getCustomers().get(i).getTransactions().get(y));
                }
            }
        }
        return true;
    }
}