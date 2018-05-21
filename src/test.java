
public class test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        AddEnum.registerDataType(String.class, AddString.class);
        AddEnum.registerDataType(Integer.class, AddInt.class);

        Manuplate<String> stringhandler = AddEnum.getHandler(String.class);
        Manuplate<Integer> intHandler = AddEnum.getHandler(Integer.class);

		//Manuplate<String> stringHandler = AddEnum.getHandler(String.class);
		//Manuplate<Integer> intHandler = AddEnum.getHandler(Integer.class);

		System.out.println(stringhandler.add("100", "3"));
		System.out.println(intHandler.add(5, 7));
	}

}
