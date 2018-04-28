
public class test {

	public static void main(String[] args) {

		if (args.length == 1 || args.length > 2)
		{
			System.err.println("Useage: AddString integer1 integer2");
			return;
		}
		if(args.length == 0) {
			System.out.println("There were no commandline arguments passed!");
		} else {
			System.out.println(new AddStrings().sum(args[0], args[1]));
		}
	}

}
