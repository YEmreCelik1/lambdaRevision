import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lamda06 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("portaklal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");

        //S4 : icinde e olanlardan yeni bir list olusturunuz
        System.out.println(list.stream().filter(t -> t.contains("e")).collect(Collectors.toList()));

        //S6: List elemanarını 2.harfe gore sıralayıp
        //ilk 5 elemandan char sayısı en buyuk elemanı print
        list.stream().sorted(Comparator.comparing(t->t.charAt(1))).limit(5).
                sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(Lambda01::yazdir);
        System.out.println();
        //S7: uzunlugu 3 ile 7 arası olan veya a ile biten elemanlardan yeni bir liste olustur
        System.out.println(list.stream().filter(t -> t.length() > 3 && t.length() < 7).collect(Collectors.toList()));


        //S8:list elemanlarını uzunluklarına ve ikinci harflerine göre benzersiz sıralayıp yazdırın
        System.out.println(list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(1)))
                .distinct().collect(Collectors.toList()));


        //System.out.println(list.stream().sorted(Comparator.comparing(String::length)).sorted(Comparator.comparing(t -> t.charAt(1)))
            //    .distinct().collect(Collectors.toList()));


        //S9: uzunlugu 4 ve 8 olanlar haric bir liste olusturunuz
        System.out.println(list.stream().filter(t -> t.length() != 4 && t.length() != 8).collect(Collectors.toList()));

        //S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın
        //System.out.println(list.stream().sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).reversed()).limit(3).collect(Collectors.toList()));
        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(list.size() - 3).collect(Collectors.toList()));

        //soru1-Kullanıcıdan girdi olarak bir String alan ve
        // bu dizgede meydana gelen maksimum karakteri bulan bir Java programı yazın. (Büyük/küçük harf duyarlılığını dikkate almayın)


        System.out.println(f1(4));
        System.out.println(f4(4));
        System.out.println(f5(3));
        f6(3);
        List<String> menu = new ArrayList<>(Arrays.asList("trilece","havucDilim","guvec","kokorec","kusleme","arabAsi","waffle","kunefe","guvec"));

    }

    ////TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int f1(int a){
        return IntStream.rangeClosed(2,a).filter(t->t%2==0).sum();
    }
    ////TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

    public static int f4(int a){
        return IntStream.iterate(2,t->t+2).limit(a).sum();
    }
    ////TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int f5(int a){
        return IntStream.iterate(1,t->t+2).limit(a).sum();
    }
    ////TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void f6(int x){

        IntStream.iterate(2,t->t*2).limit(x).forEach(Lambda01::yazdir);

    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void f7(int istenenSayi, int us){
        IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(us).forEach(t-> System.out.println(t+" "));
    }
}
