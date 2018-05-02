
public class AddNumbers implements Add {
	private int var1, var2;
	public AddNumbers(int variable1, int variable2) {
		this.var1 = variable1;
		this.var2 = variable2;
	}	

	@Override
	public int sum(){		
		return this.var1 +this.var2;
	}	


}
