import java.util.ArrayList;
import java.util.List;

public class test {

		
		public static void main(String[] args) {
			
			ArrayList<Person> source = new ArrayList<Person>();
			source.add(new Person("Alice", 56.3));
			source.add(new Person("Joe", 77.0));
			source.add(new Person("Bob", 90.2));
			source.add(new Person("Jenny", 44.2));
			source.add(new Person("Anna", 51.9));
			source.add(new Person("Peter", 84.3));
			source.add(new Person("geg", 84.3));

			
			Filter<Person> personFilter = new Filter<Person>(source);
			Filter<Person> personFilter2 = new Filter<Person>(source);
			Filter<Person> personFilter3 = new Filter<Person>(source);


			FilterPredicate<Person> hasShortName = new PersonFilter1();
			FilterPredicate<Person> isFlaco = new PersonFilter2();
			FilterPredicate<Person> isPalindrome = new PersonFilter3();

			

			List<Person> result3 = personFilter3.filter(isPalindrome);
			for (Person person : result3) {
			    System.out.println(person.getReverse());
			}

			
			
			List<Person> result2 = personFilter2.filter(isFlaco);
			for (Person person : result2) {
			    System.out.println(person.getWeight());

			}
			
			
			List<Person> result = personFilter.filter(hasShortName);
			for (Person person : result) {
			    System.out.println(person.getName());

			}
			
		}

	  
	}
	
	
	
	
	

