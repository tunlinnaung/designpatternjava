package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hello {
	public static void main(String[] args) {
		int test;
		new Hello().stringTest();
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
}
