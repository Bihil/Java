
public class AddEnum  {
	public static <T> Manuplate<T> getHandler(Class<T> clazz) {
		if (clazz.equals(String.class))
			return (Manuplate<T>) new AddString();
		if (clazz.equals(Integer.class))
			return (Manuplate<T>) new AddInt();
		return null;
	}
	}
