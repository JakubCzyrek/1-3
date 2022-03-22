import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
  Scanner Wczytywanie = new Scanner(System.in);
    int x, y, suma;
    System.out.println("Wprowadz liczbe x:");
    x=Wczytywanie.nextInt();
    System.out.println("Podaj liczbe y:");
    y=Wczytywanie.nextInt();
    suma=x+y;
    System.out.println("Suma liczb x oraz y to:"+suma);
  }
}