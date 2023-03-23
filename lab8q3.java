import java.util.Scanner;

public class lab8q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter  the  basic  salary:-");
        a = s.nextInt();

        Substaff st = new Substaff(a);
        st.calculate();
        st.bonus();
        st.display();

    }

}

interface Money {
    public void earnings();

    public void deductions();

    public void bonus();
}

abstract class Manager implements Money {
    double earning, deduction;

    public void earnings() {
        System.out.println("Manager  implementing  the  method  earnings.");
    }

    public void deductions() {
        System.out.println("Manager  implemneting  the  method  deductions.");
    }
}

class Substaff extends Manager implements Money {
    double basic_salary, bonus;

    Substaff(int bs) {
        basic_salary = bs;
    }

    public void calculate() {
        earning = basic_salary + (0.8 * basic_salary) + (0.15 * basic_salary);
        deduction = 0.12 * basic_salary;
        bonus = 0.5 * basic_salary;
    }

    public void bonus() {
        System.out.println("Substaff  implementing  the  method  bonus.");
    }

    public void display() {
        System.out.println("Earning  of  the  employee  :  " + earning);
        System.out.println("Deduction  of  the  employee  :  " + deduction);
        System.out.println("Bonus  of  the  employee  :  " + bonus);
    }
}