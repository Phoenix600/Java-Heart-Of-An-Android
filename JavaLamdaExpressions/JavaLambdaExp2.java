import java.util.ArrayList;
import java.util.function.Consumer;

class Main {
	public static void main(String... args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(12);
		number.add(10);
		number.add(17);
		number.add(52);
		number.add(18);
		number.add(1);
		number.add(2);
		number.add(78);
		number.add(99);

		Consumer<Integer> iterator = (num) -> {
			System.out.println(num);
		};

		number.forEach(iterator);

		ArrayList<String> names = new ArrayList<String>();
		names.add("Pranay");
		names.add("Pranay1");
		names.add("Pranay2");
		names.add("Pranay3");
		names.add("Pranay4");

		Consumer<String> itter = (name) ->{
			System.out.println(name);
		};		

		names.forEach(itter);


		ArrayList<Float> marks = new ArrayList<Float>();
		marks.add(98.50f);
		marks.add(80.50f);
		marks.add(90.50f);
		marks.add(95.50f);
		marks.add(96.50f);
		marks.add(99.50f);

		Consumer<Float> con = (mark)->{ System.out.println(mark);};
		marks.forEach(con);


		// ArrayList<Double> money = new ArrayList<Double>();



	}
}
