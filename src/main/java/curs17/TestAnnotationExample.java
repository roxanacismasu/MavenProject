package curs17;
import org.testng.annotations.Test;

public class TestAnnotationExample {

	//@Test
		public void test1() {
			System.out.println("Test 1");
		}
		//@Test
		public void test2() {
			System.out.println("Test 2");
		}
		@Test
		private void test3() {
			System.out.println("Test 3");
		}
}
