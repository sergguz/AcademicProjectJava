package bus;

import java.util.Comparator;

public class SocialComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        if ((e1.getSocialSecurityNumber().compareTo(e2.getSocialSecurityNumber()))<0){
            return -1;
        }
        if ((e1.getSocialSecurityNumber().compareTo(e2.getSocialSecurityNumber()))>0){
            return +1;
        }
        return 0;
    }
}
