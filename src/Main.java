import java.lang.reflect.Array;
import java.util.Arrays;
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
        rectangle(4, 6);
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
        int number = 16;
        int divideCount = divide(number);
        System.out.println("Skaicius " + number + " dalijasi is " + divideCount + " sveiku skaiciu.");
        System.out.println("------------------------");
        Integer[] sorted = divisors(33, 77, 100);
        System.out.println("Surusiuotas masyvas pagal dalikliu be liekanos kieki: ");
        array(sorted);
        System.out.println("------------------------");
        int[] arrayPrimes = rndArray(333, 777, 100);
        array(arrayPrimes);
        System.out.println("\nMasyve yra: " + primes(arrayPrimes) + " pirminiu skaiciu.");
        System.out.println("------------------------");
        allPrimes(1, 33, 3);
        System.out.println("------------------------");
        arrayFromArrays(1,100,100);
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

    public static String backwards(String back) {
        String reversed = "";
        for (int i = 0; i < back.length(); i++) {
            reversed = back.charAt(i) + reversed;
        }
        return reversed;
    }

    //Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant “---”
    //pradžioje ir gale. PVZ (---labas---)

    public static String beforeAfter(String argument) {
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
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static void fixedStr(String generatedStr) {
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

    public static int divide(int number) {
        int numcount = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                numcount++;
            }
        }
        return numcount;
    }

//Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
//Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.

    public static Integer[] divisors(int min, int max, int length) {
        int[] numArray = rndArray(min, max, length);
        Integer[] numArrayIntegers = new Integer[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            numArrayIntegers[i] = numArray[i];
        }
        Arrays.sort(numArrayIntegers, (a, b) -> Integer.compare(divide(b), divide(a)));
        return numArrayIntegers;
    }

    public static void array(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 333 iki 777.
//Naudodami 3 uždavinio funkciją iš masyvo suskaičiuokite kiek yra pirminių skaičių.

    public static int primes(int[] arr) {
        int primeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (divide(num) == 0) {
                primeCount++;
            }
        }
        return primeCount;
    }

//Sugeneruokite masyvą iš trijų elementų, kurie yra atsitiktiniai skaičiai nuo 1 iki 33.
//Jeigu tarp trijų paskutinių elementų yra nors vienas ne pirminis skaičius,
//prie masyvo pridėkite dar vieną elementą- atsitiktinį skaičių nuo 1 iki 33.
//Vėl patikrinkite pradinę sąlygą ir jeigu reikia pridėkite dar vieną elementą.
//Kartokite, kol sąlyga nereikalaus pridėti elemento.

    public static void allPrimes(int min, int max, int length) {
        int[] arr = rndArray(min, max, length);
        System.out.println("Pradinis masyvas: " + Arrays.toString(arr));
        while (true) {
            int primeCount = 0;
            for (int i = arr.length - 3; i < arr.length; i++) {
                if (divide(arr[i]) != 0) {
                    primeCount = 0;
                    break;
                } else {
                    primeCount++;
                }
            }
            if (primeCount == 3) {
                break;
            } else {
                int newArrLength = arr.length + 1;
                int[] newArr = new int[newArrLength];

                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[arr.length] = rnd(min, max);
                arr = newArr;

                System.out.println("Naujas masyvas: " + Arrays.toString(arr));
            }
        }
        System.out.println("Masyvas kurio 3 paskutiniai skaiciai yra pirminiai: " + Arrays.toString(arr));
    }

    //Sugeneruokite masyvą iš 10 elementų, kurie yra masyvai iš 10 elementų, kurie yra atsitiktiniai skaičiai nuo 1 iki 100.
    //Jeigu tokio didelio masyvo (ne atskirai mažesnių) pirminių skaičių vidurkis mažesnis už 70,
    //suraskite masyve mažiausią skaičių (nebūtinai pirminį) ir prie jo pridėkite 3.
    //Vėl paskaičiuokite masyvo pirminių skaičių vidurkį ir jeigu mažesnis nei 70 viską kartokite.

    public static void arrayFromArrays (int min, int max, int length){
        int[] mainArray = rndArray(1,100,100);
        System.out.println("Pradinis masyvas: ");
        array(mainArray);

        while (true) {
            int primeCount = 0;
            double primeSum = 0;

            for (int i = 0; i < mainArray.length; i++) {
                int num = mainArray[i];
                boolean isPrime = true;
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int a = 2; a < Math.sqrt(num); a++) {
                        if (num % a == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    primeCount++;
                    primeSum += num;
                }
            }
            double primeAvg;
            if (primeCount == 0) {
                primeAvg = 0;
            } else {
                primeAvg = primeSum / primeCount;
            }
            System.out.println("Pirminiu skaiciu vidurkis: " + primeAvg);
            if (primeAvg >= 70) {
                System.out.println("Masyve yra pakankamai pirminiu skaiciu su vidurkiu virs 70.");
                break;
            }
            int minValue = Arrays.stream(mainArray).min().getAsInt();
            for (int i = 0; i < mainArray.length; i++) {
                if (mainArray[i] == minValue) {
                    mainArray[i] += 3;
                    break;
                }
            }
            //System.out.println("Naujas masyvas po to, kai pridedame 3 prie maziausio skaiciaus:");
            //array(mainArray);
        }


    }


















}
