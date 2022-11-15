module com.example.projectfour {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.projectfour to javafx.fxml;
    exports com.example.projectfour;
}