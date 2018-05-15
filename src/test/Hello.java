package test;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Hello {
	private int age;
	final static short x = 2;
	public static int y = 0;

	public Hello(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Test1 test = new Test2();
		System.out.println(test.b);
		test.show();

		assert 9.4 > 7.3;

		for (int z = 0; z < 3; z++) {
			switch (z) {
				case x :
					System.out.println("0");
				case x - 1:
					System.out.println("1");
				case x - 2:
					System.out.println("2");
			}
		}
		//Hello hello = new Hello();

//		int test;
//		new Hello().stringTest();
//		long time = 2345;
//		System.out.println(new Hello().msToTime(time));
//
//		List<Integer> count = Arrays.asList(1, 2, 3, 4);
//		int totalMileAward = count.stream()
//				.reduce((sum, a) -> sum + a)
//				.get();
//		System.out.println("Value : " + totalMileAward);

	}
	
	private void stringTest() {
		String s = "-123";
		String s1 = "-123";
		System.out.println(" s = s1 ? " + (s.equalsIgnoreCase(s1)));
	}

	private void test() {
		String s = "test";
		List<String> stringList = new ArrayList<>();
		stringList.add("hello");
		
		System.out.println("test");
		
		Map<String, String> stringMap = new HashMap<>();
		stringMap.put("hello", "java");
		stringMap.forEach((k, v) -> {
			System.out.println(k + " - " + v);
		});
	}

	String msToTime(long milliseconds) {
		long seconds = (milliseconds / 1000) % 60;
		long milli = (milliseconds - (seconds * 1000));
		return seconds + " sec : " + milli + " ms";
	}
}
