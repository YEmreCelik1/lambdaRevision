import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34,22,16,11,35,20,63,21,65,44,66,64,81,38,15));
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
        System.out.println();
        f9(sayi);

    }

    //TASK: Structured Programing kullanarak list elemanlarini ayni satirda aralarinda bosluk olacak sekilde print ediniz.

    public static void f1(List<Integer>nombre){
        for (Integer w : nombre) {
            System.out.print(w+" ");
        }
    }

    //TASK: Functional Programing kullanarak list elemanlarini ayni satirda aralarinda bosluk olacak sekilde print ediniz.
    public static void f2(List<Integer>nombre){
        nombre.stream().forEach((t)-> System.out.print(t + " ")); //Lambda Expression
    }
    public static void f3(List<Integer> nombre){
        nombre.stream().forEach(System.out::print);
    }
    public static void yazdir(int a){
        System.out.print(a + " ");
    }
    public static void yazdir(String a){
        System.out.print(a + " ");
    }
    public static void f4(List<Integer> nombre){
        nombre.stream().forEach(Lambda01::yazdir);
    }

    //TASK  : functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void f5(List<Integer> nombre){
        nombre.stream().filter(t->t%2==0).forEach(Lambda01::yazdir);
    }

    //Task: yukaridaki Task i filter() kismini method referance ile yapalim
    public static boolean ciftEleman(int a){
            return a%2==0;
    }
    public static void f6(List<Integer> nombre){
        nombre.stream().filter(Lambda01::ciftEleman).forEach(Lambda01::yazdir);
    }
    //TASK  : structural Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void f7(List<Integer> nombre){
        for (Integer w:nombre) {
            if(w%2==0){
                System.out.print(w);
            }
        }
    }

    //TASK :functional Programming ile list elemanlarinin 34 den kucuk cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void f8(List<Integer> nombre){
       // nombre.stream().filter(t->t<34&&t%2!=0).forEach(Lambda01::yazdir);
        nombre.stream().filter(Lambda01::ciftEleman).filter(t->t<34).forEach(Lambda01::yazdir);

    }

    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void f9(List<Integer> nombre){
        nombre.stream().filter(t->t>34||t%2==0).forEach(Lambda01::yazdir);
    }



}
