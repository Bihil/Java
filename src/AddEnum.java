

import java.util.HashMap;
import java.util.Map;


public class AddEnum  {
    static Map<Class<?>, Class<? extends Manuplate>> registry = new HashMap<>();
    public static void registerDataType(Class<?> dataType, Class<? extends Manuplate> handlerType) {
        registry.put(dataType, handlerType);
    }
    public static <T> Manuplate<T> getHandler(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return registry.get(clazz).newInstance();
    }



/*	public static <T> Manuplate<T> getHandler(Class<T> clazz) {
		if (clazz.equals(String.class))
			return (Manuplate<T>) new AddString();
		if (clazz.equals(Integer.class))
			return (Manuplate<T>) new AddInt();
		return null;
	}*/
	}
