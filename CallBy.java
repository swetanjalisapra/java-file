public class CallBy{
public static void main(String[] args) {
    int val=100;
    int[] arr=new int[10];
    callByValue(val);
    System.out.println(val);
   callByRef(arr);
   System.out.println(arr[0]);
}
public static void callByValue(int value){
    ++value;
    System.out.println(value);
 

}
public static void callByRef(int[] ar){
    ar[0]=15;
}

}
