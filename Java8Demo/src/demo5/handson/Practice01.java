package demo5.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import demo5.common.Gender;
import demo5.common.Person;

public class Practice01 {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("pankaj", 38, Gender.MALE), new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE), new Person("Monika", 25, Gender.FEMALE),
				new Person("Monikas", 35, Gender.FEMALE), new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {

		List<Person> people = createPeople();

		// Get the name of female in uppercase having age morethan 6
		// 1. Imperative way - you know what to do and how to do
		List<String> filterNames = new ArrayList<String>();
		for (Person person : people) {
			if (person.getAge() > 6 && person.getGender().equals(Gender.FEMALE)) {
				filterNames.add(person.getName().toLowerCase());
			}
		}
		System.out.println(filterNames);

		// 2.Declarative way - what to do without specify how to do

		
		  List<String> filterdName = people.stream().filter(x ->
		  x.getGender().equals(Gender.FEMALE)) .filter(x -> x.getAge() > 6).map(x ->
		  x.getName().toUpperCase()).collect(Collectors.toList());
		  System.out.println(filterdName);
		  
		 
		
		Map<Gender, Long> CountEmployees = people.stream()
				.collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));
		System.out.println(CountEmployees);
	}
}
