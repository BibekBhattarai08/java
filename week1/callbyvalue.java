public class callbyvalue{
    public static void square(int x){
        x=x*x;
        System.out.println("the square of x is"+ x );
    }
    public static void main(String[] args){
        int y=5;
        square(y);
        System.out.println(y);



    }
    
}