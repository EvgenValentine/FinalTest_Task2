package com.company;
/*
 *
 * Classname : CompanyServiceImpl
 * Description : Service witch implements interface ICompanyService
 *
 *  23 June 2020
 *
 * @version 1.0 2020.06.23
 * @author Khnyznytskyj Evgen
 *
 * */
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompanyServiceImpl implements ICompanyService {


    @Override
    public Company getTopLevelParent(Company child) {
        Company result = child;
        if(child.getParent() != null ){
            result = this.getTopLevelParent(child.getParent());
        }
        return result;
    }


    private Set<Company> getAllChildrenAndCompanyToSet (Company company, List<Company> companies){
        Set<Company> children = new HashSet<>();
        Set<Company> chld = new HashSet<>();
        for(Company cmp:companies){
            while (true){
                chld.add(cmp);
                if ( cmp.getParent() == null || cmp.equals(company)){
                    break;
                }
                cmp=cmp.getParent();
            }
            if (chld.contains(company)) {
                children.addAll(chld);
            }
            chld.clear();
        }
        return children;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        Set<Company> children = this.getAllChildrenAndCompanyToSet(company, companies);
        long result = 0;
        for (Company cmp:children) {
            result+=cmp.getEmployeesCount();
        }

        return result;
    }

}