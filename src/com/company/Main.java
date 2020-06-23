package com.company;

/*
 *
 * Classname : Main
 * Description : main class
 *
 *  23 June 2020
 *
 * @version 1.0 2020.06.23
 * @author Khnyznytskyj Evgen
 *
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CompanyServiceImpl service = new CompanyServiceImpl();

        List<Company> companies = new ArrayList<>();
        Company chief = new Company(null, 2);
        Company lawyer = new Company(chief, 4);
        Company developer = new Company(chief, 6);
        Company frontEnd = new Company(developer, 5);
        Company backEnd = new Company(developer, 7);
        Company design = new Company(frontEnd, 2);
        Company devOps = new Company(backEnd, 5);
        Company accounting = new Company(null, 4);

        System.out.println(service.getTopLevelParent(chief));
        System.out.println(service.getTopLevelParent(lawyer));
        System.out.println(service.getTopLevelParent(developer));
        System.out.println(service.getTopLevelParent(frontEnd));
        System.out.println(service.getTopLevelParent(backEnd));
        System.out.println(service.getTopLevelParent(design));
        System.out.println(service.getTopLevelParent(devOps));
        System.out.println(service.getTopLevelParent(accounting));

        System.out.println(service.getEmployeeCountForCompanyAndChildren(backEnd, companies));
    }
}
