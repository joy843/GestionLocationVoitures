module app {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.javadoc;


    opens app to javafx.fxml;
    exports app;
}
