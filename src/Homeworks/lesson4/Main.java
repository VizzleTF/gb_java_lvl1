package Homeworks.lesson4;

public class Main {


    public static void main(String[] args){

        int[] ageArray = new int[5];
        ageArray[0] = 1974;
        ageArray[1] = 1975;
        ageArray[2] = 1979;
        ageArray[3] = 1999;
        ageArray[4] = 1984;

        int[] salaryArray = new int[5];
        salaryArray[0] = 50000;
        salaryArray[1] = 55000;
        salaryArray[2] = 45000;
        salaryArray[3] = 100000;
        salaryArray[4] = 65000;

        String[] fioArray = new String[5];
        fioArray[0] = "Ivanov Ivan Ivanovich";
        fioArray[1] = "Ivanov Petr Ivanovich";
        fioArray[2] = "Mihailov Mihail Alexeevich";
        fioArray[3] = "Mihailov Sergey Mihaylovich";
        fioArray[4] = "Alexeev Alexey Sergeevich";

        Employer[] emplArray = new Employer[5];
        for (int i = 0; i < fioArray.length; i++) {
            emplArray[i] = new Employer(fioArray[i], salaryArray[i], ageArray[i]);
        }

        for (int i = 0; i < emplArray.length; i++) {
            emplArray[i].showInfo();
        }


        showOld(40, emplArray);
        increaseSalary(45, 5000, emplArray);
        averAge(emplArray);
        averSalary(emplArray);
    }

    private static void showOld(int age, Employer[] emplArray) {
        System.out.println();
        for (Employer employer : emplArray)
            if (employer.getAge() > age)
                employer.showInfo();
    }

    private static void increaseSalary(int age, int howMuch, Employer[] emplArray) {
        System.out.println();
        for (Employer employer : emplArray)
            if (employer.getAge() > age) {
                employer.setSalary(employer.getSalary() + howMuch);
                employer.showInfo();
            }
    }
    private static void averAge(Employer[] emplArray) {
        System.out.println();
        int aa = 0;
        for (int i = 0; i < emplArray.length; i++)
            aa += emplArray[i].getAge();
        System.out.println("Average age: " + aa / emplArray.length);
    }

    private static void averSalary(Employer[] emplArray) {
        System.out.println();
        int aa = 0;
        for (Employer employer : emplArray) aa += employer.getSalary();
        System.out.println("Average salary: " + aa / emplArray.length);
    }
}
