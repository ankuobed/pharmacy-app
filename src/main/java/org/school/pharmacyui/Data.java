package org.school.pharmacyui;

import org.school.pharmacyui.models.Customer;
import org.school.pharmacyui.models.Drug;
import org.school.pharmacyui.models.Purchase;
import org.school.pharmacyui.models.Supplier;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Data {
    public static LinkedList<Drug> getDrugs() {
        LinkedList<Drug> list = new LinkedList<>();

        list.add(new Drug(1, "Aspirin", "A common pain reliever and anti-inflammatory drug", 10.00, 100, 200, 500));
        list.add(new Drug(2, "Ibuprofen", "A nonsteroidal anti-inflammatory drug (NSAID) used for pain relief", 15.00, 50, 150, 400));
        list.add(new Drug(3, "Acetaminophen", "A pain reliever and a fever reducer", 8.00, 80, 250, 600));
        list.add(new Drug(4, "Amoxicillin", "An antibiotic used to treat bacterial infections", 25.00, 30, 100, 300));
        list.add(new Drug(5, "Metformin", "A medication used to treat type 2 diabetes", 20.00, 40, 120, 350));
        list.add(new Drug(6, "Atorvastatin", "A statin used to lower cholesterol", 30.00, 60, 180, 450));
        list.add(new Drug(7, "Lisinopril", "An ACE inhibitor used to treat high blood pressure", 18.00, 70, 190, 500));
        list.add(new Drug(8, "Omeprazole", "A proton pump inhibitor used to treat acid reflux", 22.00, 50, 160, 420));
        list.add(new Drug(9, "Albuterol", "A bronchodilator used to treat asthma", 35.00, 20, 70, 200));
        list.add(new Drug(10, "Levothyroxine", "A medication used to treat hypothyroidism", 28.00, 45, 130, 360));
        list.add(new Drug(11, "Amlodipine", "A calcium channel blocker used to treat high blood pressure", 24.00, 50, 140, 400));

        return list;
    }

    public static LinkedList<Supplier> getSuppliers() {
        LinkedList<Supplier> list = new LinkedList<>();

        list.add(new Supplier(1, "PharmaPlus", "123 Main St", "555-1234"));
        list.add(new Supplier(2, "HealthSource", "456 Oak Ave", "555-5678"));
        list.add(new Supplier(3, "MediSupply Co.", "789 Pine Rd", "555-9101"));
        list.add(new Supplier(4, "Wellness Distributors", "321 Elm St", "555-1122"));
        list.add(new Supplier(5, "CareFirst Pharmaceuticals", "654 Maple Ave", "555-3344"));
        list.add(new Supplier(6, "Global Health Supplies", "987 Birch Blvd", "555-5566"));

        return list;
    }

    public static LinkedList<Customer> getCustomers() {
        LinkedList<Customer> customers = new LinkedList<>();

        customers.add(new Customer(1, "Alex Johnson", "123 Main St", "555-1234"));
        customers.add(new Customer(2, "Jane Smith", "456 Oak Ave", "555-5678"));
        customers.add(new Customer(3, "Michael Johnson", "789 Pine Rd", "555-9101"));
        customers.add(new Customer(4, "Emily Davis", "321 Elm St", "555-1122"));
        customers.add(new Customer(5, "Daniel Brown", "654 Maple Ave", "555-3344"));
        customers.add(new Customer(6, "Sophia Wilson", "987 Birch Blvd", "555-5566"));
        customers.add(new Customer(7, "James Anderson", "159 Cedar Ln", "555-7788"));
        customers.add(new Customer(8, "Olivia Martinez", "753 Spruce St", "555-9900"));
        customers.add(new Customer(9, "Benjamin White", "852 Fir Ct", "555-2233"));
        customers.add(new Customer(10, "Isabella Harris", "951 Walnut Dr", "555-4455"));

        return customers;
    }

    public static LinkedList<Purchase> getPurchases() {
        LinkedList<Purchase> purchases = new LinkedList<>();
        LinkedList<Drug> drugs = getDrugs();
        LinkedList<Customer> customers = getCustomers();

        purchases.add(new Purchase(1, drugs.get(0), customers.get(0), 3, LocalDateTime.now().minusDays(1)));
        purchases.add(new Purchase(2, drugs.get(1), customers.get(1), 1, LocalDateTime.now().minusDays(2)));
        purchases.add(new Purchase(3, drugs.get(2), customers.get(2), 5, LocalDateTime.now().minusDays(3)));
        purchases.add(new Purchase(4, drugs.get(3), customers.get(3), 2, LocalDateTime.now().minusDays(4)));
        purchases.add(new Purchase(5, drugs.get(4), customers.get(4), 7, LocalDateTime.now().minusDays(5)));
        purchases.add(new Purchase(6, drugs.get(5), customers.get(5), 6, LocalDateTime.now().minusDays(6)));
        purchases.add(new Purchase(7, drugs.get(6), customers.get(6), 4, LocalDateTime.now().minusDays(7)));
        purchases.add(new Purchase(8, drugs.get(7), customers.get(7), 8, LocalDateTime.now().minusDays(8)));
        purchases.add(new Purchase(9, drugs.get(8), customers.get(8), 9, LocalDateTime.now().minusDays(9)));
        purchases.add(new Purchase(10, drugs.get(9), customers.get(9), 1, LocalDateTime.now().minusDays(10)));
        purchases.add(new Purchase(11, drugs.get(10), customers.get(0), 2, LocalDateTime.now().minusDays(11)));
        purchases.add(new Purchase(12, drugs.get(0), customers.get(1), 3, LocalDateTime.now().minusDays(12)));
        purchases.add(new Purchase(13, drugs.get(1), customers.get(2), 5, LocalDateTime.now().minusDays(13)));
        purchases.add(new Purchase(14, drugs.get(2), customers.get(3), 6, LocalDateTime.now().minusDays(14)));
        purchases.add(new Purchase(15, drugs.get(3), customers.get(4), 7, LocalDateTime.now().minusDays(15)));
        purchases.add(new Purchase(16, drugs.get(4), customers.get(5), 8, LocalDateTime.now().minusDays(16)));
        purchases.add(new Purchase(17, drugs.get(5), customers.get(6), 9, LocalDateTime.now().minusDays(17)));
        purchases.add(new Purchase(18, drugs.get(6), customers.get(7), 1, LocalDateTime.now().minusDays(18)));
        purchases.add(new Purchase(19, drugs.get(7), customers.get(8), 2, LocalDateTime.now().minusDays(19)));
        purchases.add(new Purchase(20, drugs.get(8), customers.get(9), 4, LocalDateTime.now().minusDays(20)));

        return purchases;
    }
}
