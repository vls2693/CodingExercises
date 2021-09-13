package academy.part113;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    ArrayList<Branch> branchList;
    Scanner scanner = new Scanner(System.in);

    public Bank() {
        branchList = new ArrayList<>();
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    public void bankMenu() {
        System.out.println("Select one of the options below:");
        System.out.println("1 - Add branch");
        System.out.println("2 - Add customer to the branch");
        System.out.println("3 - Add transaction to customer");
        System.out.println("4 - Print the customer list");
        System.out.println("5 - Print the customer list with transaction");
        System.out.println("0 - Exit");
        int number = scanner.nextInt();
        do {
            switch (number) {
                case 1:
                    createBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printCustomerList();
                    break;
                case 5:
                    printCustomerListWithTransactions();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong number. Choose from 0 to 5");
                    break;
            }
            System.out.println("Select one of the options below:");
            System.out.println("1 - Add branch");
            System.out.println("2 - Add customer to the branch");
            System.out.println("3 - Add transaction to customer");
            System.out.println("4 - Print the customer list");
            System.out.println("5 - Print the customer list with transaction");
            System.out.println("0 - Exit");
            number = scanner.nextInt();
        } while (number != 0);
    }

    public boolean createBranch() {
        scanner.nextLine();
        System.out.println("Enter the branch name");
        String branchName = scanner.nextLine();
        if (findBranchNumberByName(branchName) != -1) {
            System.out.println("Error. The branch already exists!");
            return false;
        }
        System.out.println("Enter the customer name");
        String customerName = scanner.nextLine();
        System.out.println("Enter the transaction amount");
        double transactionAmount = scanner.nextDouble();
        Customer customer = new Customer (customerName, transactionAmount);
        Branch branch = new Branch (branchName, customer);
        branch.getCustomerList().add(customer);
        branchList.add(branch);
        System.out.println("Branch " + branch.getBranchName() + " with customer " + customer.getCustomerName()
                + " and transaction amount " + customer.getTransactionList().get(0) + " was created");
        return true;
    }

    public int findBranchNumberByName(String branchName) {
        for (int i = 0; i < branchList.size(); i++) {
            if (branchList.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addTransaction() {
        scanner.nextLine();
        System.out.println("Enter the branch name");
        String branchName = scanner.nextLine();
        int branchNumber = findBranchNumberByName(branchName);
        if (branchNumber == -1) {
            System.out.println("Error. The branch doesn't exist!");
            return false;
        }
        System.out.println("Enter the customer name");
        String customerName = scanner.nextLine();
        int customerNumber = branchList.get(branchNumber).findCustomerNumberByName(customerName);
        if (customerNumber == -1) {
            System.out.println("The customer doesn't exist!");
            return false;
        }
        System.out.println("Enter the transaction amount");
        double transactionAmount = scanner.nextDouble();
        branchList.get(branchNumber).addTransactionToCustomer(customerName, transactionAmount);
        System.out.println("Transaction with amount " + transactionAmount + " for the customer " + customerName
                + " in branch " + branchName + " was created");
        return true;
    }

    public boolean addCustomer() {
        scanner.nextLine();
        System.out.println("Enter the branch name");
        String branchName = scanner.nextLine();
        int branchNumber = findBranchNumberByName(branchName);
        if (branchNumber == -1) {
            System.out.println("Error. The branch doesn't exist!");
            return false;
        }
        System.out.println("Enter the customer name");
        String customerName = scanner.nextLine();
        int customerNumber = branchList.get(branchNumber).findCustomerNumberByName(customerName);
        if (customerNumber != -1) {
            System.out.println("The customer exists!");
            return false;
        }
        System.out.println("Enter the transaction amount");
        double transactionAmount = scanner.nextDouble();
        branchList.get(branchNumber).addCustomer(customerName,transactionAmount);
        System.out.println("Customer " + customerName + " with amount " + transactionAmount + " for the branch " + branchName
                + " was created");
        return true;
    }

    public boolean printCustomerList() {
        scanner.nextLine();
        System.out.println("Enter the branch name");
        String branchName = scanner.nextLine();
        int branchNumber = findBranchNumberByName(branchName);
        if (branchNumber == -1) {
            System.out.println("Error. The branch doesn't exist!");
            return false;
        }
        for (int i = 0; i < branchList.get(branchNumber).getCustomerList().size(); i++) {
            System.out.println(branchList.get(branchNumber).getCustomerList().get(i).getCustomerName());
        }
        return true;
    }

    public boolean printCustomerListWithTransactions() {
        scanner.nextLine();
        System.out.println("Enter the branch name");
        String branchName = scanner.nextLine();
        int branchNumber = findBranchNumberByName(branchName);
        if (branchNumber == -1) {
            System.out.println("Error. The branch doesn't exist!");
            return false;
        }
        for (int i = 0; i < branchList.get(branchNumber).getCustomerList().size(); i++) {
            System.out.println(branchList.get(branchNumber).getCustomerList().get(i).getCustomerName());
            for (int y = 0; y < branchList.get(branchNumber).getCustomerList().get(i).getTransactionList().size(); y++) {
                System.out.println(branchList.get(branchNumber).getCustomerList().get(i).getTransactionList().get(y));
            }
        }
        return true;
    }
}
