import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.LongSupplier;

public class Lab3 {

	public static void main(String[] args) {
		// Consumer<String> scon = (s)->System.out.println(s);
		Consumer<String> scon = System.out::println;
		scon.accept("simplesinglestring");
		List<String> l1 = new ArrayList<>();
		l1.add("aaa");
		l1.add("bbbb");
		l1.add("ccc");

		l1.forEach((item) -> System.out.println(item));
		l1.forEach(System.out::println);

		Consumer<List<String>> listcon = (list) -> {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		};
		listcon.accept(l1);

		IntPredicate even = (n) -> n % 2 == 0;
		System.out.println("Check even .. 12 " + even.test(12));
		System.out.println("Check even .. 13 " + even.test(13));

	
		LongSupplier supp = ()->Calendar.getInstance().getTimeInMillis();
		System.out.println("Supplier - " + supp.getAsLong());
		
	}

}
