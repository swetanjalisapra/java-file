public class MethodCall{
    public static void main(String[] args) {
        System.out.println("1");
        method1();
        System.out.println("2");
    }
    public static void method1(){
        System.out.println("3");
        method2();
        System.out.println("4");
    }
    public static void method2(){
        System.out.println("3");
     
}
}