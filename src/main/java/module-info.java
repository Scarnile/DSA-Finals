module com.example.dsafinals {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dsafinals to javafx.fxml;
    exports com.example.dsafinals;
}