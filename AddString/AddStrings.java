
public class AddStrings implements Add {
	private String var1, var2;

	public AddStrings(String variable1, String variable2) {
		this.var1=variable1;
		this.var2=variable2;
	}
	@Override
	public int sum() {	
		return Integer.parseInt(this.var1) + Integer.parseInt(this.var2);
	}

}
