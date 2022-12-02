import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        System.out.println(f1(5));
        System.out.println(f2(5));
        System.out.println(f3(7));
        System.out.println(f4(5));
        System.out.println(f5(3));
        f6(5);
        System.out.println();
        f7(5,3);
        System.out.println();
        System.out.println(f8(5));

    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar (x dahil) tamsayilari toplayan bir program create ediniz.
    //structured
    public static int f1(int x){
        int sum=0;
        for (int i = 0; i <=x ; i++) {
            sum+=i;
        }
        return sum;
    }

    //functional
    public static int f2(int x){
        //return IntStream.range(0,x+1).reduce(Integer::sum).getAsInt();
        return IntStream.range(0,x+1).sum();
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int f3(int x){
        // return IntStream.rangeClosed(1,x).filter(t->t%2==0).sum();
        return IntStream.rangeClosed(1,x).filter(Lambda01::ciftEleman).sum();
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi, toplayan program  create ediniz.
    public static int f4(int x){
       //return IntStream.rangeClosed(1,x*2). // x 5 ise 1 den 10 a kadar verir
        // filter(Lambda01::ciftEleman).sum();
        return IntStream.iterate(2,t->t+2).limit(x).sum();
    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int f5(int x){
        //return IntStream.rangeClosed(1,x*2).filter(t->t%2!=0).limit(x).sum();
       return IntStream.iterate(1,t->t+2).limit(x).sum();
    }

    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void f6(int x){
        IntStream.iterate(2,t->t*2).limit(x).forEach(Lambda01::yazdir);
    }

   //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
   public static void f7(int sayi , int x){ // sayi 3 us 5 3*3*3*3*3
        IntStream.iterate(sayi,t->t*sayi).limit(x).forEach(Lambda01::yazdir);
   }
   //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
   public static int f8(int sayi){
      return IntStream.rangeClosed(1,sayi).reduce(1,(t,u)->t*u);
   }


   }
