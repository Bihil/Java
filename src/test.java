
public class test {

	public static void main(String[] args) {

		Manuplate<String> stringHandler = AddEnum.getHandler(String.class);
		Manuplate<Integer> intHandler = AddEnum.getHandler(Integer.class);

		System.out.println(stringHandler.add("100", "3"));
		System.out.println(intHandler.add(5, 7));
	}

}
