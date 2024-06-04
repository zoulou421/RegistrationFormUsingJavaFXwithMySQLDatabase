module com.formationkilo.registrationformfavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.formationkilo.registrationformfavafx.registration to javafx.fxml;
   // exports com.formationkilo.registrationformfavafx;
    exports com.formationkilo.registrationformfavafx.registration;
    exports com.formationkilo.registrationformfavafx;
    exports com.formationkilo.registrationformfavafx.login;
    opens com.formationkilo.registrationformfavafx to javafx.fxml;
    opens com.formationkilo.registrationformfavafx.login to javafx.fxml;
    exports com.formationkilo.registrationformfavafx.data;
    opens com.formationkilo.registrationformfavafx.data to javafx.fxml;


}