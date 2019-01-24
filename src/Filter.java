
import java.util.*;

interface FilterPredicate<T> {
	
	boolean isMatching(T candidate);
}



public class Filter<T> {
	
    private List<T> sourceList;
    
    public Filter(List<T> sourceList) {
        this.sourceList = sourceList;
}
  
    List<T> filter(FilterPredicate<T> filterPredicate) {
        ArrayList<T> resultList = new ArrayList<T>();
        for (T elem : sourceList) {
            if (filterPredicate.isMatching(elem)) {
                resultList.add(elem);
            } 
            
        }
        return resultList;
    }
	

}



class PersonFilter1 implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        return candidate.getName().length() < 5;
  } 
    
}


class PersonFilter2 implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
        
    	return candidate.getWeight() < 60.0;
  } 
    
}


class PersonFilter3 implements FilterPredicate<Person> {
    @Override
    public boolean isMatching(Person candidate) {
       
    	return candidate.getReverse() == candidate.name;
       
        
  } 
    
 }




