package org.school.pharmacyui.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Purchase class
public class Purchase implements Comparable<Purchase> {
    private int purchaseId;
    private Drug drug;
    private Customer customer;
    private int quantity;
    private double totalAmount;
    private LocalDateTime purchaseDateTime;

    public Purchase(int purchaseId, Drug drug, Customer customer, int quantity, LocalDateTime purchaseDateTime) {
        this.purchaseId = purchaseId;
        this.drug = drug;
        this.customer = customer;
        this.quantity = quantity;
        this.totalAmount = drug.getDrugPrice() * quantity;
        this.purchaseDateTime = purchaseDateTime;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public Drug getDrug() {
        return drug;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd MMM h:mm a", Locale.ENGLISH);
        return purchaseDateTime.format(formatter);
    }

    @Override
    public int compareTo(Purchase other) {
        int result = this.purchaseDateTime.compareTo(other.getPurchaseDateTime());

        // date and time is equal, compare the total amount
        if(result == 0) {
            result = Double.compare(this.totalAmount, other.totalAmount);
        }

        return result;
    }

    @Override
    public String toString() {
        return purchaseId + ": (" + drug.getDrugName() + ") - " + totalAmount;
    }
}
