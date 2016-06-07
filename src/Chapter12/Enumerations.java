package Chapter12;

import java.util.Random;

/**
 * Created by Nikhil on 5/30/2016.
 */
enum Month{
    January(1), Febuvary(2), March(3), April(4), May(5),June(6), July(7), August(8), September(9), October(10), November(11), December(12) ;
    private int monthNumber; // price of each apple
    // Constructor
    Month(int p) { monthNumber = p; }
    int getMonthNumber() { return monthNumber; }
}

public class Enumerations {
    public static void main(String[] args) {
        System.out.println(Month.January.ordinal());
        //System.out.println(Month.January.getMonthNumber());
        System.out.println("\nPrinting Values:");
        for (Month m: Month.values()) {
            System.out.println( m.getMonthNumber() + "\t" + m );
        }
        //Ordinal
        System.out.println("\n" +  "\nPrinting Ordinal:");
        for (Month m: Month.values()) {
            System.out.println( m.ordinal() + "\t" + m.name() );
        }
        System.out.println("\nPrinting Month with Random use");
        printRandomMonth();
    }

    public static void printRandomMonth(){
        for (int i = 0; i <20; i++) {
            Random random = new Random();
            int probability = (int)( (12 * random.nextDouble()) + 1 );
            switch (probability){
                case 1:
                    System.out.println(Month.January.ordinal()+1 + "\t" + Month.January);
                    break;
                case 2:
                    System.out.println(Month.Febuvary.ordinal()+1 + "\t" + Month.Febuvary);
                    break;
                case 3:
                    System.out.println(Month.March.ordinal()+1 + "\t" + Month.March);
                    break;
                case 4:
                    System.out.println(Month.April.ordinal()+1 + "\t" + Month.April);
                    break;
                case 5:
                    System.out.println(Month.May.ordinal()+1 + "\t" + Month.May);
                    break;
                case 6:
                    System.out.println(Month.June.ordinal()+1 + "\t" + Month.June);
                    break;
                case 7:
                    System.out.println(Month.July.ordinal()+1 + "\t" + Month.July);
                    break;
                case 8:
                    System.out.println(Month.August.ordinal()+1 + "\t" + Month.August);
                    break;
                case 9:
                    System.out.println(Month.September.ordinal()+1 + "\t" + Month.September);
                    break;
                case 10:
                    System.out.println(Month.October.ordinal()+1 + "\t" + Month.October);
                    break;
                case 11:
                    System.out.println(Month.November.ordinal()+1 + "\t" + Month.November);
                    break;
                case 12:
                    System.out.println(Month.December.ordinal()+1 + "\t" + Month.December);
                    break;
            }
        }
    }


}
