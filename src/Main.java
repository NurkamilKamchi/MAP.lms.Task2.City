import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        City city = new City(23, "City1");
        City city2 = new City(3, "City2");
        City city3 = new City(5, "City3");
        City city4 = new City(12, "City4");
        City city5 = new City(78, "City5");

        Set<City> cities = new HashSet<>(Arrays.asList(city, city2, city3, city4, city5));


        Set<City> cities1 = new TreeSet<>(cities);

        cities1.clear();
        for (City city1 : cities) {
            if (city1.getCode() % 2 != 0){
                cities1.add(city1);
            }
        }
        System.out.println(cities1);
//        for (City city12 : cities1) {
//            System.out.println(city12);
//        }
    }
}
//    City деген класс тузунуз. (code, name, )
//        Эгерде code так сан болсо TreeSetke салыныз.
//        Аларды чонунан кичинесине караган тартипте чыгарыныз.