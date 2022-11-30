import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> menu = new ArrayList<>(Arrays.asList("trilece","havucDilim","guvec","kokorec","kusleme","arabAsi","waffle","kunefe","guvec"));

        f1(menu);
        System.out.println();
        f2(menu);
        System.out.println();
        f3(menu);
        System.out.println();
        f4(menu);
        System.out.println();
        f5(menu);
        System.out.println();
        f6(menu);
        System.out.println();
        f7(menu);
        System.out.println();
        f8(menu);

    }
    // Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

    public static void f1(List<String> list){
        list.stream().map(t->t.toUpperCase()).distinct().forEach(Lambda01::yazdir);
        System.out.println();
        list.stream().map(String::toUpperCase).distinct().forEach(Lambda01::yazdir);
    }

    //// Task -2 : list elelmanlarinin character sayisini, ters sirali olarak tekrarsiz(ayni karakter sayisi olmayacak) print ediniz..
    public static void f2(List<String> list){
        list.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::yazdir);
    }

    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..
    public static void f3(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Lambda01::yazdir);
        System.out.println();
        list.stream().sorted(Comparator.comparing(String::length)).distinct().forEach(Lambda01::yazdir);
    }

    // ******************************************************************************************
// *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    // Task-4 : List elelmmalarinin hepsinin  karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void f4(List<String> list){
        System.out.println(list.stream().allMatch(t -> t.length() <= 7) ? "Elemanlarin hepsinin karakter sayisi 7 ye esit veya buyuk" :
                "Elemanlarin hepsinin karakter sayisi 7 ye esit veya buyuk degil");
    }
    // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void f5(List<String> list){
        System.out.println(list.stream().noneMatch(t -> t.startsWith("w")) ? "List elemanlarinin hepsi 'w' ile basliyor" :
                "List elemanlarindan en az biri 'w' ile basliyor");
        System.out.println(list.stream().allMatch(t -> t.startsWith("w")) ? "List elemanlarinin hepsi 'w' ile basliyor" :
                "List elemanlarinin hepsi 'w' ile baslamiyor");

    }
    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı var mi kontrol ediniz.
    public static void f6(List<String> list){
        System.out.println(list.stream().anyMatch(t -> t.endsWith("x")) ? "elemanlardan en az biri x ile bitiyor." :
                "elemanlardan x ile biten yok.");
    }
    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void f7(List<String> list){
       Stream<String> stream1= list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1);
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2= list.stream().sorted(Comparator.comparing(t->t.length()));
        System.out.println(stream2.toArray()[list.size()-1]);

        list.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(Lambda01::yazdir);
    }
    // Task-8 : list elemanlarini son harfine göre siralayıp, ilk eleman hariç, kalan elemanlari print ediniz.

    public static void f8(List<String> list){
        list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(1).forEach(Lambda01::yazdir);
    }
}
