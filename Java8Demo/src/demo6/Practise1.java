package demo6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import demo5.common.Gender;
import demo5.common.Person;

public class Practise1 {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("pankaj", 38, Gender.MALE), new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE), new Person("Monika", 25, Gender.FEMALE),
				new Person("Monikas", 35, Gender.FEMALE), new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();
		// Print all the males using imperative way - what and how both
		//Approach 1
		List<String> maleDetails = people.stream().filter(person -> person.getGender().equals(Gender.MALE))
				.map(Person::getName).collect(Collectors.toList());

		System.out.println(maleDetails);
		// Approach 2
		List<Person> maleDetails2 = people.stream().filter(person -> person.getGender().equals(Gender.MALE))
				.collect(Collectors.toList());
		for (Person male : maleDetails2) {
			System.out.println(male.getName()+"-"+male.getGender());
		}
		//Approach3
		people.stream().filter(person -> person.getGender().equals(Gender.MALE))
		.map(person -> new Person(person.getName(),person.getAge(),person.getGender()))
		.forEach(new Consumer<Person>(){

			@Override
			public void accept(Person person) {
				System.out.println(person.getName()+"-"+person.getAge());
				
			}
			
		});
		
		//Approach4
		people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
		.map(person -> new Person(person.getName(),person.getAge(),person.getGender()))
		.forEach((person)->System.out.println(person.getName()+"-"+person.getAge()));
		
		//Approach5
		people.stream().filter(person -> person.getGender().equals(Gender.MALE))
		.map(person -> new Person(person.getName(),person.getAge(),person.getGender()))
		.forEach(System.out::println);
		
	}

}
