module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens main to javafx.fxml;
    exports main;
}
