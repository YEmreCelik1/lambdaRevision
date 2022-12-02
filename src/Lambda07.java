import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda07 {
    public static void main(String[] args) {
        String str = "ali          delice    veli    delice";
        String newStr[] = str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim().split(" ");
        f1(newStr);

        System.out.println(asal(6));
        System.out.println();
        f2(5);
    }
    public static void f1(String [] str){

        System.out.println(Arrays.stream(str).sorted(Comparator.comparing(String::length).reversed()).distinct().toArray()[0]);

    }
    //  Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük olan ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
    //  Bir dönüş yönteminde sayıların çift olup olmadığını kontrol edin.
    public static void f2(int a){
        IntStream.iterate(a,t-> t+1).filter(Lambda07::asal).limit(10).forEach(Lambda01::yazdir);
    }
    public static boolean asal (int a){
       int counter=0;
       boolean sonuc= true;

       for (int i=2;i<a;i++){
           if(a%i==0){
               counter++;
               sonuc=false;
               break;
           }
       }
       if(counter==0){
           sonuc=true;
       }
       return sonuc;



}
}
