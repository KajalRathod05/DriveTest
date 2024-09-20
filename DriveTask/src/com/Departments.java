package com;
import java.util.*;
public class Departments {

	public static void main(String args[])
	  {
			     Employee e=new Employee();
			     e.eid=101;
			     e.ename="abc";
			     e.department="CSE";
			    
			    Employee e1=new Employee();
			     e1.eid=102;
			     e1.ename="xyz";
			     e1.department="CSE";
		
			    Employee e2=new Employee();
			     e2.eid=103;
			     e2.ename="lmn";
			     e2.department="CSE";
		
			    List<Employee> elist1=new ArrayList<>();    //list1
			                   elist1.add(e);
			                   elist1.add(e1);
			                   elist1.add(e2);

			  Employee e3=new Employee();
			     e3.eid=104;
			     e3.ename="lmn";
			     e3.department="AI";
		
			  Employee e4=new Employee();
			     e4.eid=104;
			     e4.ename="lmn";
			     e4.department="AI";

			  List<Employee> elist2=new ArrayList<>();    //list2
                    elist2.add(e3);
                    elist2.add(e4);
                
	     
	        List<List<Employee>> dlist=new ArrayList<>();    //dlist
	                    dlist.add(elist1);   //CSE
	                    dlist.add(elist2);    //AI
    

	     Map<Integer,List<List<Employee>>> m = new HashMap<>();

	               m.put(1, dlist);
	             
	             Set<Integer> keys=m.keySet();
	             
	             for(int key:keys)
	             {
	            	 //System.out.println(key+" : "+ m.get(key));
	            	 List<List<Employee>> dlist1=m.get(key);
	            	 
	            	 for(List<Employee> list:dlist1)
	            	 {
	            		   for(Employee el:list)
	            		   {
	            			   System.out.println(key+" : "+ e1.eid +"  "+e1.department);
	            		   }
	            	  }
	            	 
	             }

	  }
	
}
