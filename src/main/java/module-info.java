module org.example.lab9_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab9_javafx to javafx.fxml;
    exports org.example.lab9_javafx;
}