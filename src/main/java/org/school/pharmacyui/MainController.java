package org.school.pharmacyui;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.school.pharmacyui.models.Customer;
import org.school.pharmacyui.models.Drug;
import javafx.scene.control.TableView;
import org.school.pharmacyui.models.Purchase;
import org.school.pharmacyui.models.Supplier;

import java.io.IOException;
import java.util.LinkedList;

public class MainController {
    private MainApplication mainApp;

    private LinkedList<Drug> drugs;
    private LinkedList<Purchase> purchases;
    private LinkedList<Customer> customers;
    private LinkedList<Supplier> suppliers;

    public void setMainApp(MainApplication mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void goToAddDrugScreen() throws IOException {
       mainApp.navigate(Utils.Page.ADD_DRUGS);
    }

    @FXML
    public void goToDrugsScreen() throws IOException {
        mainApp.navigate(Utils.Page.DRUGS);
    }

    @FXML
    public void goToPurchasesScreen() throws IOException {
        mainApp.navigate(Utils.Page.PURCHASES);
    }

    @FXML
    public void goToCustomersScreen() throws IOException {
        mainApp.navigate(Utils.Page.CUSTOMERS);
    }

    @FXML
    public void goToSuppliersScreen() throws IOException {
        mainApp.navigate(Utils.Page.SUPPLIERS);
    }

    @FXML
    private TableView<Drug> drugsTable;

    @FXML
    private TableView<Purchase> purchasesTable;

    @FXML
    private TableView<Customer> customersTable;

    @FXML
    private TableView<Supplier> suppliersTable;

    @FXML
    private TextField search;

    @FXML
    private TextField name;

    @FXML
    private TextField description;

    @FXML
    private TextField price;

    @FXML
    private TextField quantity;

    @FXML
    private TextField minStock;

    @FXML
    private TextField maxStock;

    @FXML
    public void addNewDrug() throws IOException {
        Drug newDrug = new Drug(drugs.size() + 1, name.getText(), description.getText(), Double.parseDouble(price.getText()), Integer.parseInt(quantity.getText()), Integer.parseInt(minStock.getText()), Integer.parseInt(maxStock.getText()));
        drugs.push(newDrug);
        Utils.initializeDrugsTable(drugs, drugsTable);
        mainApp.navigate(Utils.Page.DRUGS);
    }

    @FXML
    public void onDrugSearch() {
        Utils.initializeDrugsTable(Utils.searchDrugs(search.getText(), drugs), drugsTable);
    }

    @FXML
    public void onPurchaseSearch() {
        Utils.initializePurchasesTable(Utils.searchPurchases(search.getText(), purchases), purchasesTable);
    }

    @FXML
    public void onCustomerSearch() {
        Utils.initializeCustomersTable(Utils.searchCustomers(search.getText(), customers), customersTable);
    }

    @FXML
    public void onSupplierSearch() {
        Utils.initializeSuppliersTable(Utils.searchSuppliers(search.getText(), suppliers), suppliersTable);
    }

    public void initialize() {
        drugs = Data.getDrugs();
        purchases = Data.getPurchases();
        customers = Data.getCustomers();
        suppliers = Data.getSuppliers();

        Utils.initializeDrugsTable(drugs, drugsTable);
        Utils.initializePurchasesTable(purchases, purchasesTable);
        Utils.initializeCustomersTable(customers, customersTable);
        Utils.initializeSuppliersTable(suppliers, suppliersTable);
    }
}