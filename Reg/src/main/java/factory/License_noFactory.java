package factory;

import java.util.Date;
import domain.Driver.License_no;


public class License_noFactory {

    public static License_no getLicense_no(long license_no, Date expiryDate){

        return new License_no.Builder().license_no(license_no)
                .expiryDate(expiryDate)
                .build();



    }
}
