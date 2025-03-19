public class StringMaker {
    private String _str;

    public StringMaker(String str) {
        _str = str;

    }

    // initializing constructor to empty string
    public StringMaker() {
        _str = "";
    }

    public String getString() {
        return _str;

    }
    // writing 3 overloaded method

    public String append(String str1) {
        return _str += str1;
    }

    public String append(char ch) {
        return _str += ch;
    }

    public String append(int num) {
        return _str += num;

    }
}
