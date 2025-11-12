//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1!");
byte a = 1;
System.out.println("Значение переменной a с типом byte " + "= " + 1);
short b = 7;
System.out.println("Значение переменной b с типом short " + "= " + 7);
int d = 200;
System.out.println("Значение переменной d с типом int " + "= " + 200);
long e = 450L;
System.out.println("Значение переменной e с типом long " + "= " + 450L);
float f = 3f;
System.out.println("Значение переменной f с типом float " + "= " + 3f);
double g = -3.123456;
System.out.println("Значение переменной g с типом double " + "= " + -3.123456);

System.out.println("Задача 2!");
byte numberOne = 67;
short numberTwo = -159;
short numberThree = 27897;
int numberFour = 569;
long numberFive = 987678965549L;
float numberSix = 27.12f;
double numberSeven = 2.786;

System.out.println("Задача 3!");
byte studentLD = 23;
short studentAN = 27;
int studentEA = 30;
int totalStudents = studentLD + studentAN + studentEA;
long papers = 480L;
System.out.println("На каждого ученика рассчитано " + papers / totalStudents + " листов бумаги.");

System.out.println("Задание 4!");

byte bottle = 16;
byte minTime = 2;
short timeMinutes = 20;
int quantityOne = timeMinutes / minTime * bottle;
System.out.println("За 20 минут машина произвела " + quantityOne + " штук бутылок.");

short timeDay = 60*24;
int quantityTwo = timeDay / minTime * bottle;
System.out.println("За сутки машина произвела " + quantityTwo + " штук бутылок.");

short timeThreeDays = 60*24*3;
int quantityThree = timeThreeDays / minTime * bottle;
System.out.println("За 3 дня машина произвела " + quantityThree + " штук бутылок.");

int timeMonth = 60*24*30;
int quantityFour = timeMonth / minTime * bottle;
System.out.println("За месяц машина произвела " + quantityFour + " штук бутылок.");

System.out.println("Задание 5!");

byte whiteOneClass = 2;
byte brownOneClass = 4;
byte quantityPaintCans = 120;
short oneClassCan = 2 + 4;
short totalClasses = 120 / 6;
int totalWhite = 2*20;
int totalBrown = 4*20;
System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

System.out.println("Задание 6!");


    }
}