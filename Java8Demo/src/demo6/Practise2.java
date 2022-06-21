package demo6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import demo5.common.Gender;
import demo5.common.Person;

public class Practise2 {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("pankaj", 38, Gender.MALE), new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE), new Person("Monika", 25, Gender.FEMALE),
				new Person("Monikas", 35, Gender.FEMALE), new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();
		//Print all males but name in upperclass
		//important thing is , Original person name should not be changed. This talks about
		//non-mutating property
		
			people.stream().filter(person -> person.getGender().equals(Gender.MALE))
			.map(person->new Person(person.getName().toUpperCase(),person.getAge(),person.getGender()))
			.forEach(System.out::println);
	}

}
