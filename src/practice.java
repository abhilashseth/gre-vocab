public class practice {

   public  String foo(int a)
    {
        return " " ;
    }

   private String foo(String b)
    {
        return b;
    }

    public static void main(String[] args)
    {
        System.out.println("abh");
        practice p=new practice();
        System.out.println(p.foo(10));
        System.out.println(p.foo("abh"));

    }
}
