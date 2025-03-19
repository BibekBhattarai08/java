public class Test {
    public static void main(String[] args) {

        StringMaker bibek = new StringMaker("Bibek");

        bibek.append(' ');
        bibek.append("Bhattarai");
        System.out.println(bibek.getString());

        StringMaker numbers = new StringMaker("");

        for (int i = 1; i <= 10; i++) {
            numbers.append(i);
            if (i < 10) {
                numbers.append(' ');
            }
        }
      
        System.out.println(numbers.getString());
    }
}
