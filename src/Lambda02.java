import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));
        f1(sayi);
        System.out.println();
        f2(sayi);
        System.out.println();
        f3(sayi);
        System.out.println();
        f4(sayi);
        System.out.println();
        f5(sayi);
        System.out.println();
        f6(sayi);
        System.out.println();
        f7(sayi);
        System.out.println();
        f8(sayi);
        f9(sayi);
        System.out.println();
        f10(sayi);
        System.out.println();
        f11(sayi);
    }
//TASK 1 : Function programing ile listin cift elemanlarinin karelerini ayni satirda aralarina bosluk brakarak print ediniz.

    public static void f1(List<Integer> list){
        list.stream().filter(Lambda01::ciftEleman).map(t->t*t).forEach(Lambda01::yazdir);
    }

    // Task 2: Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void f2(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->(t*t*t)+1).forEach(Lambda01::yazdir);
    }
    // Task-3 : Functional Programming ile listin cift elemanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void f3(List<Integer> list){
        list.stream().filter(Lambda01::ciftEleman).map(Math::sqrt).forEach(t-> System.out.print(t+" "));
    }

    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void f4(List<Integer> list){
        Optional opt = list.stream().reduce(Integer::max);
        System.out.println(opt); //Optional[15]
        System.out.println(list.stream().reduce(Integer.MIN_VALUE, Integer::max));// int 15
    }
    //structured yapi ile cozelim yukardaki soruyu
    public static void f5(List<Integer> list){
        int max = Integer.MIN_VALUE;
        for (Integer w:list) {
            if (w>max){
                max=w;
            }
        }
        System.out.println(max);
    }
    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void f6(List<Integer> list){
        System.out.println(list.stream().filter(Lambda01::ciftEleman).map(t -> t * t).reduce(Integer::max));
    }

    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    public static void f7(List<Integer> list){
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(0, Math::addExact));
    }
    //TASK 7 listdeki cift elemanlarin carpimini yazdiriniz
    public static void f8(List<Integer> list){
        System.out.println(list.stream().filter(Lambda01::ciftEleman).reduce(1, (a, b) -> a * b));
        System.out.println(list.stream().filter(Lambda01::ciftEleman).reduce(1,Math::multiplyExact));
    }

    //TASK - 8 list deki elemanlarin en kucugunu yazdiriniz
    public static void f9(List<Integer> list){
        System.out.println(list.stream().reduce(Integer.MAX_VALUE, Integer::min));
        System.out.println(list.stream().reduce(Lambda02::fonk));
        System.out.println(list.stream().reduce(Integer.MAX_VALUE,Lambda02::fonk));
    }
    public static int fonk(int a, int b){
        return a<b ? a :b;
    }

    // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void f10(List<Integer> list){
        System.out.println(list.stream().filter(t -> t > 5 && t % 2 != 0).reduce( Integer::min));
        System.out.println(list.stream().filter(t -> t > 5 && t % 2 != 0).reduce( Integer.MAX_VALUE,Integer::min));
    }
    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz
    public static void f11(List<Integer> list){
        list.stream().filter(Lambda01::ciftEleman).map(t->t*t).sorted().forEach(Lambda01::yazdir);
    }


}
