public class Largest {
 public static void main(String[] args) {
    int a = 25;
    int b = 10;
    int c = 30;
    int largest;
    if(a>=b && a>=c){
        largest = a;
    }
    else if(b>=a && b>=c){
        largest = b;
    }
    else{
        largest = c;
    }
    System.out.println("Largest is :"+largest);
 }
}
