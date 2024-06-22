module org.school.pharmacyui {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jshell;


    opens org.school.pharmacyui to javafx.fxml;
    exports org.school.pharmacyui;
}