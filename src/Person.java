 public class Person {
	String name; 
	double weight;
	
	public Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	} 
	

	double getWeight() {
		
		return weight; 
	}
	
	String getName() {
		return name; 
	}
	
	
String getReverse() {
		
	    String reverse = new StringBuffer(name).reverse().toString();
	   
	    if (reverse.equalsIgnoreCase(name) == true) {
	    	
	    	return name;
	    	
	    } else {
	    	
	    	return reverse;
	    }
	    
	   
  }
} 