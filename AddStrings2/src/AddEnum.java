
public enum AddEnum implements Manuplate<Object> {
	INSTANCE;
	
	@SuppressWarnings("unchecked")
    public static <T> Manuplate<T> getListener() {
        return (Manuplate<T>) INSTANCE;
    }
	
	public int add(Object obj1, Object obj2) {
		if(obj1 instanceof String) {
			return Integer.parseInt((String) obj1) + Integer.parseInt((String) obj2);
		}
		else if(obj1 instanceof Integer) {
			return (Integer) obj1 + (Integer) obj2;
		}
		return 0;

	}
}
