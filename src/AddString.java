public class AddString implements Manuplate<String> {

    @Override
    public int add(String str1, String str2){
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }

}
