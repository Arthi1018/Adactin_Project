package org.Adactin;

public class Details {
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.setAge(10);
		s.setName("Arthiha");
		
		String name = s.getName();
		System.out.println(name);
		
		int age = s.getAge();
		System.out.println(age);
		
		
	}

}
