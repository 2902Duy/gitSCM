import java.util.Scanner;

class bai2{
    public static void main(String[] str)
    {
        info student = new info();
        Scanner sc = new Scanner(System.in);
        System.out.println("ma sinh vien: ");
        student.iD = sc.nextLine();
        System.out.println("Ten: ");
        student.name = sc.nextLine();
        System.out.println("Tuoi: ");
        student.age =sc.nextInt();
        System.out.println("Nam sinh: ");
        student.date = sc.nextInt();
        System.out.println(student.iD +" "+ student.name +" "+ student.age +" "+ student.date);
    }
}





















