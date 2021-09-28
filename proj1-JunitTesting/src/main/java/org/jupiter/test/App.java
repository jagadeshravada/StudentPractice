package org.jupiter.test;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.boot.model.Address;
import org.boot.model.Student;
import org.jupiter.service.EmployeeAnnualSalary;
import org.jupiter.service.StudentService;
import org.jupiter.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 

{
	public static void calculate(Predicate<Integer> p,int[] x) {
		
		for(int a:x) {
			if(p.test(a))
		
		  System.out.println("value will be:"+a);
		}
			
		
		
		
	}
	
    public static void main( String[] args )
    {
    	 int[] x= {4,8,12,16,18,24,26};
		/*
		 * //using lambda expression StudentService
		 * intef=(a,b)->System.out.println("addition::"+(a+b)); //intef.service(4, 6);
		 * //using method reference StudentServiceImpl imp=new StudentServiceImpl();
		 * StudentService sint= imp::serviceAddtion; sint.service(12, 3);
		 */
    	//Predicate<String> test=str-> str.length()>4; return true /false
    	//System.out.println(test.test("jaga"));
		/*
		 * Function<String,Integer> len=str->str.length();
		 * System.out.println(len.apply("jagadesh ravada"));
		 */	 
		/*
		 * Predicate<Integer> greaterthan=n->n>10; Predicate<Integer>
		 * divideby=n->n%2==0; calculate(greaterthan.negate(), x);
		 */
    	 
    	 //--------------------------------------
    	 ArrayList<Student> alstd=new ArrayList<Student>();
    	     alstd.add(new Student(101, "jagadesh", 3450.0, 
    	    		 new Address("andhra Pradesh", 535161, 9666006182l), "7th"));
    	
    	     alstd.add(new Student(102, "ramesh", 2550.0, 
    	    		 new Address("andhra Pradesh", 535321, 9666324113l), "8th"));
    	     alstd.add(new Student(104, "naidu", 3650.0, 
    	    		 new Address("andhra Pradesh", 535156, 9666328975l), "7th"));
      
    	     alstd.add(new Student(105, "hari kumar", 4560.0, 
    	    		 new Address("Telangana", 535155, 9666322333l), "8th"));
         Stream<Student> streamst=alstd.stream().filter(st->st.getStandard().equalsIgnoreCase("8th"));
         streamst.forEach(st->System.out.println(st+"-->"+st.getAddress()));
        long count=alstd.stream().filter(st->st.getFee()>3000).count();
         System.out.println(count);
          //feest.forEach(st->System.out.println(st));
    
    }
}
