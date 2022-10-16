/////**
//// * 

package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

////
////import java.util.Arrays;
////import java.util.Comparator;
//import java.util.Scanner;
////
/////**
//// * @author Damini Sanghwal
//// *
//// */
//////class sortSubjects implements Comparator<Subject>
//////{
//////@Override
//////	public int compare(Subject s1, Subject s2) {
//////		// TODO Auto-generated method stub
//////		return s2.getLevel()-s1.getLevel();
//////	}
//////}
//
//
//////		// TODO Auto-generated method stub
////		//Demo d =new Demo();
////		//Child c = new Child();
////		//d.doSomething();
////		//c.printName();
////		//add a =new add();
////		//a.add2(new int []{1,2,3});
////
////		//Address ad= new Address();
////		//ad.setCity("Delhi");
////		//ad.setPincode(123);
////		//ad.setState("Punjab");
////		
////		//Person p = new Person();
////		//p.setAddress(ad);
////		//p.setAge(14);
////		//p.setName("Damini");
////	
////		//System.out.println(p);
////		//System.out.println(ad);
//////		
//////		Subject sb= new Subject("C++","2M","2");
//////		Student s =new Student("Slay","Programming",23,sb);
//////		
//////		s.Display();
////		
//////		Subject[] s= new Subject[4];
//////		 for(int i=0;i<4;i++)
//////		 {
//////			 try (Scanner sc = new Scanner(System.in)) {
//////				System.out.println("Enter subject,Duration,level :");
//////				 String name= sc.nextLine();
//////				 String duration=sc.nextLine();
//////				 String level=sc.nextLine();
//////  s[i]= new Subject(name,duration,level);
//////			}
//////		 }
//////		 for(int i=0;i<4;i++)
//////		 {
//////			 System.out.println(s[i]);
//////		 } 		 
//////	
////		
////// Subject[] arr=
//////	 {
//////			 new Subject("CPP","2M",2),
//////			 new Subject("Python","2M",4),
//////			 new Subject("C","2M",1),
//////			 new Subject("C++","2M",5),
//////			 new Subject("Java","2M",9),
//////	 };
////// Arrays.sort(arr,new sortSubjects());
////// for(int i=0;i<arr.length;i++)
////// {
//////	 System.out.println(arr[i].getName());
////// }
//////		 
////	System.out.print//("enter");
////	Scanner sc = new Scanner(System.in);
//	
//class RankException extends Exception{
//		
//		public RankException(String msg)
//		{
//			super(msg);
//		}
//	}
//
//	for(int i=1;i<=5;i++)
//	{
//		Multithreading m = new Multithreading();
//		try
//		{
//			m.start();
//		}
//	
//	
//	catch(Exception e)
//	{
//		System.out.println(e);
//	}
//	}
//interface Demo1
//	{
//	public void doSomething(String str);
//	}
public class CoreJava 
{
	
	public static void main(String [] args)
	{
//		Demo1 d=(p) ->{
//			System.out.println("Implements do something "+ p);
//		};
//		d.doSomething("Hello");
//	}
//		ArrayList<String> al= new ArrayList<String>();
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
//		
//		ArrayList<String> al2= new ArrayList<String>();
//		al2.add("Damini");
//		al2.add("Mitali");
//		
//		al .addAll(1,al2);
//		
//		System.out.println("------------");
//		
//		al.forEach((s) ->
//		{
//			System.out.println(s);
//			
//		});
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(45);
		a.add(35);
		
		List<Integer> r= a.stream().map((n)->
				{
			      return n*2;
				}).collect(Collectors.toList());
		
		List<Integer> b= a.stream().filter((n)->
		{
	      return n>20;
		}).collect(Collectors.toList());
		
		b.forEach((s) ->{
			System.out.println(s);
		});
	}
}



	
