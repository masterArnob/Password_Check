module com.mycompany.password_check {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.password_check to javafx.fxml;
    exports com.mycompany.password_check;
}
