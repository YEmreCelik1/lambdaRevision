import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {

      /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
      public static void main(String[] args) {
          Universite u01 = new Universite("bogazici","matematik",571,93);
          Universite u02 = new Universite("istanbul tk","matematik",600,81);
          Universite u03 = new Universite("istanbul","hukuk",1400,71);
          Universite u04 = new Universite("marmara","bilg muh",1080,71);
          Universite u05 = new Universite("odtu","gemi mh",333,74);

          List<Universite> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));
          System.out.println(f1(unv));
          System.out.println(f2(unv));
          System.out.println(f3(unv));

      }
    //task 01--> Universitelerin hepsinin notOrt'larinin 74' den buyuk olup olmadigini kontrol eden pr create ediniz.

    public static boolean f1(List<Universite> list){
          return list.stream().allMatch(t->t.getNotOrt()>74);
    }
    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean f2(List<Universite> list){
        return   list.stream().anyMatch(t->t.getBolum().equalsIgnoreCase("mat"));
    }
    //task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> f3(List<Universite> list){
          return list.stream().sorted(Comparator.comparing(Universite::getOgrSayisi).reversed()).collect(Collectors.toList());
    }
}
