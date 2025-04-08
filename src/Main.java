import java.lang.reflect.Array;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        add(3, 11);
        System.out.println("------------------------");
        System.out.println(PISq());
        System.out.println("------------------------");
        System.out.println(multiply(5, 3));
        System.out.println("------------------------");
        int[] numbers = {1, 2, 30, 15, 0, -2, 33};
        array(numbers);
        System.out.println("\n------------------------");
        int rndNum = rnd(1, 10);
        System.out.println("Random skaicius: " + rndNum);
        System.out.println("------------------------");
        int[] randomArray = rndArray(1, 15, 6);
        System.out.println("Random masyvas: ");
        array(randomArray);
        System.out.println("\n------------------------");
        int sum = arraySum(randomArray);
        System.out.println("Masyvo suma: " + sum);
        System.out.println("------------------------");
        double avg = arrayAvg(randomArray);
        System.out.println("Masyvo vidurkis: " + avg);
        System.out.println("------------------------");
        rectangle(4,6);
        System.out.println("------------------------");
        String random = "Šiandien labai graži diena";
        sentence((random));
        System.out.println("------------------------");
        String name = "Naglis";
        String reverse = backwards(name);
        System.out.println(reverse);
        System.out.println("------------------------");
        String whatever = "Labas vakaras";
        String surround = beforeAfter(whatever);
        System.out.println(surround);
        System.out.println("------------------------");
        String test = generateRndStr(10);
        System.out.print("Sugeneruotas masyvas: " + test);
        System.out.println("\nMasyvas sutvarkytas stulpeliu: ");
        fixedStr(test);
        System.out.println("------------------------");
        int number = divide(20);
        System.out.println(divide(number));

    }

    //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Suma: " + sum);
    }

    //Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
    public static double PISq() {
        return 9.8596;
    }

    //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.
    public static int multiply(int c, int d) {
        return c * d;
    }

    //Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių vienoje eilutėje.
    public static void array(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų
    public static int rnd(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    //Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo
    //kintamuosius, min, max ir length reikšmėms nustatyti.

    public static int[] rndArray(int min, int max, int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(max - min + 1) + min;
        }
        return randomArray;
    }

    //Sukurkite Funkciją kuri panaudotų 6toje užduotyje sugeneruotą masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

    public static int arraySum(int[] rndArray) {
        int sum = 0;
        for (int i = 0; i < rndArray.length; i++) {
            sum += rndArray[i];
        }
        return sum;
    }

    //Sukurkite Funkciją kuri priimtų 6toje užduotyje sugeneruotą masyvą ir gražintų jos skaičių vidurkį (double).

    public static double arrayAvg(int[] rndArray) {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < rndArray.length; i++) {
            sum += rndArray[i];
        }
        avg = sum / rndArray.length;
        return avg;
    }

    //Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
    //Pirmas int - išoriniam ciklui, antras vidiniam.

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int h = 0; h < b; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
    //Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

    public static void sentence(String sentc) {
        int symbols = sentc.length();
        System.out.println("Sakinyje yra: " + symbols + " simboliai.");
    }

    //Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
    //Pvz “Naglis” turi gautis “silgaN”.

    public static String backwards (String back) {
        String reversed = "";
        for (int i = 0; i < back.length(); i++) {
            reversed = back.charAt(i) + reversed;
        }
        return reversed;
    }

    //Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant “---”
    //pradžioje ir gale. PVZ (---labas---)

    public static String beforeAfter (String argument) {
       String surrounded;
       surrounded = "---" + argument + "---";
       return surrounded;
    }

    //Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu.
    //Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }

    public static void fixedStr (String generatedStr) {
        StringBuilder result = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < generatedStr.length(); i++) {
            char c = generatedStr.charAt(i);
            if (Character.isDigit(c)) {
                numbers.append(c);
            } else {
                if (numbers.length() > 0) {
                    result.append("[").append(numbers.toString()).append("]").append("\n");
                    numbers.setLength(0);
                }
                result.append(c).append("\n");
            }
        }
        if (numbers.length() > 0) {
            result.append("[").append(numbers.toString()).append("]").append("\n");
        }
        System.out.print(result.toString());
    }

//Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių jos argumentas
//dalijasi be liekanos (išskyrus vienetą ir patį save).

    public static int divide (int number){
        int numcount = 0;
        for (int i = 3 ; i < number ; i++) {
            if (number % i == 0) {
                numcount++;
            } else {
                break;
            }
        }
        return numcount;
    }







}
