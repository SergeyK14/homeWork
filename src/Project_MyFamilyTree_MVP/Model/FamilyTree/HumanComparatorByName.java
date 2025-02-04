package Project_MyFamilyTree_MVP;

import java.util.Comparator;

public class HumanComparatorByName<T extends FamilyTreeItem> implements Comparator<T>{
    
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
