package demo6;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import demo5.common.Gender;
import demo5.common.Person;

public class Practise3 {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("pankaj", 38, Gender.MALE), new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE), new Person("Monika", 25, Gender.FEMALE),
				new Person("Monikas", 35, Gender.FEMALE), new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();
		//find the total age of everyone
		//# : use of reduce
		//# pipe line: stream people >> map ages >> reducing
		
		//Approach 1
		
		Integer ageSum = people.stream().map(Person::getAge)
				.reduce(0,new BinaryOperator<Integer>() {

					@Override
					public Integer apply(Integer carry, Integer age) {
						return carry+age;
					}
				});
		System.out.println("The sum of Age is : "+ageSum);
		
		//Another Way
		Integer ageSum2 = people.stream().map(Person::getAge)
				.reduce(0,(carry,age)->carry+age);
		System.out.println("The sum of Age is : "+ageSum2);
		
		//Approach 2
		
		Integer ageSum3 = people.stream().map(Person::getAge)
				.reduce(0,Integer::sum);
		System.out.println("The sum of Age is : "+ageSum3);
		
		//Approach3
		Integer ageSum4 = people.stream().mapToInt(Person::getAge).sum();
		System.out.println("The sum of Age is : "+ageSum4);
	}

}
