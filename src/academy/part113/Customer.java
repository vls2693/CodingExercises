package academy.part113;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    ArrayList<Double> transactionList;

    public Customer(String customerName, double transactionAmount) {
        this.customerName = customerName;
        this.transactionList = new ArrayList<>();
        transactionList.add(transactionAmount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }
}
