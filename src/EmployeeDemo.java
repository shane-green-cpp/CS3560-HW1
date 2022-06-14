import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //enter first employee
        System.out.println("enter employee name: ");
        String name = kb.nextLine();
        System.out.println("enter employee ssn: ");
        String ssn = kb.nextLine();
        System.out.println("enter employee position: ");
        String position = kb.nextLine();
        System.out.println("enter employee DOB: ");
        String month = kb.nextLine();
        int day = kb.nextInt();
        int year = kb.nextInt();
        Date DOB = new Date(month, day, year);
        System.out.println("enter employee pay: ");
        float pay = kb.nextFloat();

        Employee E  = new Employee(name, ssn, position, DOB, pay);
        System.out.println("Employee to string below");
        System.out.println(E);
        System.out.println();
        kb.nextLine();

        //enter second employee
        System.out.println("enter employee name: ");
        String name2 = kb.nextLine();
        System.out.println("enter employee ssn: ");
        String ssn2 = kb.nextLine();
        System.out.println("enter employee position: ");
        String position2 = kb.nextLine();
        System.out.println("enter employee DOB: ");
        String month2 = kb.nextLine();
        int day2 = kb.nextInt();
        int year2 = kb.nextInt();
        Date DOB2 = new Date(month, day, year);
        System.out.println("enter employee pay: ");
        float pay2 = kb.nextFloat();
        System.out.println("enter hours worked: ");
        float nHours = kb.nextFloat();
        System.out.println("enter wage: ");
        float wage = kb.nextFloat();

        PTEmployee PE = new PTEmployee(name2, ssn2, position2, DOB2, pay2, nHours, wage);
        System.out.println("PTEmployee to string below");
        System.out.println(PE);

        //method calls for E and PE
        System.out.println();
        System.out.println("METHOD CALLS FOR E");
        System.out.println("DOB: " + E.getDateOfBirth());
        System.out.println("Name: " + E.getName());
        System.out.println("Pay pre raise: " + E.getPay());
        System.out.println("Position: " + E.getPosition());
        System.out.println("SSN: " + E.getSsn());
        System.out.println("Giving raise of 5%");
        E.raise(5);
        System.out.println("Pay post raise: " + E.getPay());

        System.out.println();
        System.out.println("METHOD CALLS FOR PE");
        System.out.println("DOB: " + PE.getDateOfBirth());
        System.out.println("Name: " + PE.getName());
        System.out.println("Pay pre raise: " + PE.getPay());
        System.out.println("Position: " + PE.getPosition());
        System.out.println("SSN: " + PE.getSsn());
        System.out.println("Giving raise of $5");
        PE.raise(5);
        System.out.println("Pay post raise: " + PE.getPay());
        System.out.println("wages: " + PE.getWages());
        System.out.println("hours: " + PE.getnHours());

        //EV AND PEV
        Employee EV;
        PTEmployee PEV;

        EV = E;
        /*
        neither setWages or getWages are valid methods because
        type Employee does not have wages or methods associated
         */
        //method calls
        System.out.println();
        System.out.println("EV = E method calls");
        EV.setPay(100);
        EV.getPay();
        //EV.setWages();
        //EV.getWages();
        EV.raise(4);
        EV.getDateOfBirth();
        System.out.println(EV);

        EV = PE;
        /*
        neither setWages or getWages are valid methods because
        type Employee does not have wages or methods associated
         */
        //method calls
        System.out.println();
        System.out.println("EV = PE method calls");
        EV.setPay(100);
        EV.getPay();
        //EV.setWages();
        //EV.getWages();
        EV.raise(4);
        EV.getDateOfBirth();
        System.out.println(EV);

        /*
        You cannot assign PTEmployee object with type Employee
         */
        //PEV = E;

        System.out.println();
        System.out.println("PEV method calls");
        PEV = PE;
        PEV.setPay(10);
        PEV.getPay();
        PEV.setWages(5);
        PEV.getWages();
        PEV.raise(4);
        PEV.getDateOfBirth();
        System.out.println(PEV);

    }
}
