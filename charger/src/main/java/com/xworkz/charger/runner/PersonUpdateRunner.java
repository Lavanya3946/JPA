package com.xworkz.charger.runner;

import com.xworkz.charger.service.PersonService;
import com.xworkz.charger.service.PersonServiceImpl;

public class PersonUpdateRunner {
    private static PersonService personService = new PersonServiceImpl();

    public static void main(String[] args) {
        personService.updateEmailById("lavanyaanand200@gmail.com", 1);
        personService.updateAddressByName("tiptur", "lavanya");
        personService.updateContactByName(9966332255l, "manasa");

    }
}
