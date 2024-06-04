module com.formationkilo.registrationformfavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.formationkilo.registrationformfavafx.registration to javafx.fxml;
   // exports com.formationkilo.registrationformfavafx;
    exports com.formationkilo.registrationformfavafx.registration;

}