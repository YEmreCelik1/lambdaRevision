import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda07 {
    public static void main(String[] args) {
        String str = "ali          delice    veli    delice";
        String newStr[] = str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim().split(" ");
        f1(newStr);

        //Q1 : 10 öğelik bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.
        String[] name={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list = new ArrayList<>(Arrays.asList(name));


    }
    public static void f1(String [] str){

        System.out.println(Arrays.stream(str).sorted(Comparator.comparing(String::length).reversed()).distinct().toArray()[0]);

    }

    public static void f2(List<String> list){


    }
}
