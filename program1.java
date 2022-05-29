import java.util.Scanner;

/**
 * program1
 */
public class program1 {
    String name;
    String dept;
    int age;
    double salary;
    public void getdata() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your Name ");
            this.name = sc.nextLine();
            System.out.println("Enter your Department Name ");
            this.dept = sc.nextLine();
            System.out.println("Enter your Age ");
            this.age = sc.nextInt();
            System.out.println("Enter your Salary ");
            this.salary = sc.nextDouble();
        }
        System.out.println("");
    }
    public void dispdata(int count) {
        System.out.println("Employee "+count+" Detail :");
        System.out.println("Name "+name);
        System.out.println("Department "+dept);
        System.out.println("Age "+age);
        System.out.println("Salary "+salary);
        System.out.println("--------------------------------------------");
        
    }
    public static void main(String[] args) {
       program1[] ob = new program1[5];
       for (int i = 0; i < ob.length; i++) {
           ob[i] = new program1();
           ob[i].getdata();
       }
       for (int i = 0; i < ob.length; i++) {
        ob[i].dispdata(i);
    }

    }
}