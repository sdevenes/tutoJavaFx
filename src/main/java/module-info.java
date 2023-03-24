module com.example.tutojavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tutojavafx to javafx.fxml;
    exports com.example.tutojavafx;
}