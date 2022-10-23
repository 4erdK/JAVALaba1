import java.time.Period;
import java.util.*;
import java.util.function.ToDoubleFunction;

public class Main {

    public static String MostRaited(ArrayList<Pevec> Masiv)
    {
        Masiv.sort(Comparator.comparingDouble(Pevec::getRaiting).reversed());

        return Masiv.get(0).toString1();
    }

    public static double AvgCountAlbum(ArrayList<Pevec> Masiv)
    {
        double sum = 0;
        for(Pevec pevec : Masiv) {
            sum += pevec.getAlbumcount();
        }
        return sum/Masiv.size();
    }
    public static void ReversedAlphabet(ArrayList<Pevec> Masiv)
    {
        Masiv.sort(Comparator.comparing(Pevec::getLastname).reversed());
    }
    public static Pevec Search(ArrayList<Pevec> Masiv)
    {
        Pevec result = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию исполнителя : ");
        String LastnameSearch = scan.nextLine();
        for (Pevec pevec : Masiv)
            if (Objects.equals(LastnameSearch, pevec.getLastname())) {
                System.out.println(pevec);
                result = pevec;
            }
        return result;
    }

    public static void Edit(ArrayList<Pevec> Masiv)
    {
        Pevec pevec = Search(Masiv);
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            if(pevec != null) {
                System.out.println("Введите 1 чтобы изменить имя, 2 чтобы изменить фамилию, 3 чтобы изменить рейтинг, 4 чтобы изменить количество альбомов, 0 чтобы выйти");
                String edit = scan.nextLine();
               switch (edit){
                   case("1") -> {
                       System.out.println("Введите имя : ");
                       pevec.setName(scan.nextLine());
                   }
                   case("2") -> {
                       System.out.println("Введите фамилию : ");
                       pevec.setLastname(scan.nextLine());
                   }
                   case("3") -> {
                       System.out.println("Введите рейтинг : ");
                       pevec.setRaiting(Double.parseDouble(scan.nextLine()));
                   }
                   case("4") -> {
                       System.out.println("Введите количество альбомов : ");
                       pevec.setAlbumcount(Double.parseDouble(scan.nextLine()));
                   }
                   case("0") -> {
                       System.out.println(pevec.toString());
                       System.exit(0);
                   }
                   default -> System.out.println("Вы ввели неправильное значение");
               }
            }
            else {
                System.out.println("Такой фамилии несуществует");
                break;}
        }
        scan.close();
    }

    public static void main(String[] args) {
        ArrayList<Pevec> pevec = new ArrayList<>();
        pevec.add(new Pevec("Kurt","Cobain",5.5,3));
        pevec.add(new Pevec("Adam", "Gontier",5.2, 4));
        pevec.add(new Pevec("Fredy","Mercury",5,15));
        for(Pevec value : pevec) {
            System.out.println(value.toString());
        }
        System.out.println(MostRaited(pevec));//1 zadanie
        System.out.println("Среднее значение количества альбомов : "+AvgCountAlbum(pevec));
        for(int i = 0; i < pevec.size();i++) {
            if (pevec.get(i).getAlbumcount() > AvgCountAlbum(pevec)) {
                System.out.println("Певец с количеством альбомов больше среднего : " + pevec.get(i).getLastname());//2 zadanie
            }
        }
        ReversedAlphabet(pevec);
        for(Pevec value : pevec) {
            System.out.println(value.toString2());//3 zadanie
        }
        Edit(pevec);//4 zadanie
    }

}