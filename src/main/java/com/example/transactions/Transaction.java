package com.example.transactions;

public class Transaction {

    // keep track of next transaction id
    private static Integer nextTransactionId = 1;

    private int transactionId;

    private int transactionAmount;

    private String expenseCategory;

    private String textNote;

    private int transactionDate;

    private String transactionMonth;

    private int transactionYear;

    /* constructor 
     * to autogenerate the transaction IDs
    */
    public Transaction() {
        this.transactionId = nextTransactionId++;
    }

    /* getters and setters */

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public int getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(int transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionMonth() {
        return transactionMonth;
    }

    public void setTransactionMonth(String transactionMonth) {
        this.transactionMonth = transactionMonth;
    }

    public int getTransactionYear() {
        return transactionYear;
    }

    public void setTransactionYear(int transactionYear) {
        this.transactionYear = transactionYear;
    }

}
