
public class test {

	public static void main(String[] args) {
		Manuplate<Object> mString = AddEnum.INSTANCE;
		Manuplate<Object> mInteger = AddEnum.INSTANCE;
		System.out.println(mString.add("100", "3"));
		System.out.println(mInteger.add(5, 7));
	}

}
