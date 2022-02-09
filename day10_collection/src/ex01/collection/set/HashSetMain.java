package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person { // extends Object
	String name;
	int age;
	
	public Person(String name, int age) {
		super(); // 있어도 되고 없어도 되고. 왜냐하면 여기서의 super는 Object를 의미하기 때문
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
} // Person end

public class HashSetMain {

	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		set.add(new Person("Donghun", 28));
		set.add(new Person("David", 20));
		set.add(new Person("David", 20));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);

	}

}
