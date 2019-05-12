package factory;

import domain.Driver.Contact_info;

public class Contact_infoFactory {


        public static Contact_info getContact_info(String email, long cellNo){
            return new Contact_info.Builder()
                    .cellNo(cellNo)
                    .email(email)
                    .build();


        }
}
