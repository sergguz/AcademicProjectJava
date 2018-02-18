package bus;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        if ((e1.getId() .compareTo(e2.getId()))<0){
            return -1;
        }
        if ((e1.getId() .compareTo(e2.getId()))>0){
            return +1;
        }
        return 0;
    }
}
