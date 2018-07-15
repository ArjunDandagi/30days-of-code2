package git;

import java.util.Scanner;

public class code1
{
     
public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    Scanner scan = new Scanner(System.in);
    int I=scan.nextInt();
    double D=scan.nextDouble();
    scan.nextLine();
    String s1=scan.nextLine();
    System.out.println(i+I);
    System.out.println(d+D);
    System.out.println(s+s1);
    scan.close();
}
}