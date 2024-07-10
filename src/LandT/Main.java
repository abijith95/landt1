package LandT;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        double c;
//        c = (double) a+b;
//        System.out.println(c);
//
//    }
//}


//public class Main {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        DecimalFormat d = new DecimalFormat("0.00");
////        double branding = sc.nextDouble();
////        double travel = sc.nextDouble();
////        double food = sc.nextDouble();
////        double logistic = sc.nextDouble();
////        double total = branding+travel+food+logistic;
////        System.out.println("Total Expense : "+total);
////        System.out.println("Branding expense percentage : "+ d.format((branding/total)*100 ));
////        System.out.println("travel expense percentage : "+d.format((travel/total)*100));
////        System.out.println("food Expense percentage : "+d.format((food/total)*100));
////        System.out.println("Logistic expense percentage : "+d.format((logistic/total)*100));
//
//           // a > b ? a : b; ---> ternary operator:::::
//          // + unary ;:::: a++,b-- --> binary :::::::::::
//          // tab space \t --> "This is my\tspace"
//          //  System.out.println("Iam\tabijith\niam\tgood");


//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(n>0)
//        {
//            if(n>=65 && n<75)
//            {
//                System.out.println("C");
//            }
//           else if(n>=75 && n<85)
//            {
//                System.out.println("B");
//            } else if (n>=85) {
//                System.out.println("A");
//            }
//           else {
//                System.out.println("D");
//            }
//        }
//        else {
//            System.out.println("Invalid Number");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = 40;

//        if(n<0)
//        {
//            System.out.println("freezing Wether");
//        }
//        else if(n>=0 && n<=9)
//        {
//            System.out.println("very Cold Wether");
//        }
//        else if(n>=10  && n<= 19)
//        {
//            System.out.println("Cold Wether");
//        }
//        else if(n>=20 && n<=29)
//        {
//            System.out.println("Normal Wether");
//        }
//        else if(n>=30 && n<=39)
//        {
//            System.out.println("Normal Wether");
//        }
//        else {
//            System.out.println("Very hot");
//        }
        
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i=0;i<arr.length;i++)
//        {
//            arr[i] = sc.nextInt();
//        }
//        for(int j=0;j<arr.length;j++)
//        {
//            System.out.print(arr[j]);
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(n<100 || n>999)
//        {
//            System.out.println("false");
//        }
//        else {
//            int mid = (n/10)%10;
//            if(mid%3==0)
//            {
//                System.out.println("Trendy Number");
//            }
//            else {
//                System.out.println("Not Trendy Number");
//            }
//        }
//    }
//}


//:::::::::::::::::::::::::::::::::::::::::::::::OOPS:::::::::::::::::::::::::::::::::
//class Bike
//{
//    int a = 10;
//    int b = 20;
//}
//public class Main {
//    public static void main(String[] args) {
//        Bike b = new Bike();
//        System.out.println(b.a);
//        int ani = 1;
//        int abi = 2;
//        List<Integer> list = new ArrayList<>();
//    }
//
//    public static int sum(int a,int b){
//      return a+b;
//    }
//
//}


//:::::::::::::::special numbers
//public class Main {
//    public static void main(String[] args) {
//       // Instance of a class
//        Student anu = new Student("Anu",1,100.0);// object
//        Student abi = new Student("abi",21,89.0);
//        Student ani = new Student("Ani",27,100.0);
//
//
//    }
//}
//class Student
//{
//    String name; //int->datatype , reference variable or object
//    int age ;
//    String Father_name ;
//    String Mother_mname ;
//    double mark;
//
//    Student(String name,int age,double mark)
//    {
//        System.out.println(name);
//    }
//
//}



// Constructor::::::::::::::
//method --> contains class name
//:::::::::::::::::::::::::::::::::::::::;::::::Comparator Interface in java :::::::::::::::::::::::::::::::::::::::
//import java.util.*;
//
//class Student
//{
//    private int rollno;
//    private String name;
//
//    private int age;
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//
//    public Student(int rollno,String name,int age)
//    {
//        this.name = name;
//        this.rollno = rollno;
//        this.age = age;
//    }
//
//}
//
//class Agecompare implements Comparator<Student>
//{
//    @Override
//    public int compare(Student s1, Student s2) {
//        return Integer.compare(s1.getAge(),s2.getAge());
//    }
//}
//
//class NameCompare implements Comparator<Student>
//{
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.getName().compareTo(s2.getName());
//    }
//}
//
//
//
//class Main
//{
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         List<Student> list = new ArrayList<>();
//         for(int i=0;i<=N;i++)
//         {
//             int rollno = sc.nextInt();
//             String name = sc.next();
//             int age = sc.nextInt();
//
//             list.add(new Student(rollno,name,age) );
//         }
//
//         Collections.sort(list,new NameCompare());
//         for(Student li : list)
//         {
//             System.out.println(li.getRollno() + " "+ li.getName()+ " "+ li.getAge());
//         }
//
//
//        Collections.sort(list,new Agecompare());
//        for(Student li : list)
//        {
//            System.out.println(li.getRollno() + " "+ li.getName()+ " "+ li.getAge());
//        }
//    }
//}

// Constructor:::::::::::::::::::::::::::

//class Student
//{
//    int age ;
//    String name;
//
//
//    public Student(int aging , String naming) {
//        this.age = aging;
//        this.name = naming;
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args) {
//          Student stu1 = new Student(20,"Aswin");
//          Student stu2 = new Student(21,"Dharshini");
//
//        System.out.println(stu1.name);
//        System.out.println(stu2.name);
//
//    }
//}

//::::::::::::::::::::::::::::::::::::::::::::::::::;;Manage Student Information:::::::::::::::::::::


//public class Main {
//
//    // Class to represent a student with name and score
//    static String name;
//    static int score ;
//
//    Main(String name, int score)
//    {
//        this.name = name;
//        this.score = score;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        ArrayList<Main> students = new ArrayList<>();
//        for(int i=1;i<=n;i++){
//            name = sc.next();
//            score = sc.nextInt();
//            students.add(new Main(name,score));
//
//        }
//        System.out.println("Student details:");
//        for(Main student : students){
//            System.out.println("Name: "+student.name+", Score:"+student.score);
//        }
//
//    }
//
//}


//
//import java.util.Scanner;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.*;

//class Movie {
//    private String title;
//    private String director;
//    private int releaseYear;
//    // Constructor for initializing movie details
//    public Movie(String title, String director, int releaseYear) {
//        this.title = title;
//        this.director = director;
//        this.releaseYear = releaseYear;
//    }
//    // Calculate and return the age of the movie
//    public int calculateMovieAge(int currentYear) {
//        int ryear = releaseYear;
//        return currentYear - ryear;
//    }
//
//    // Display movie information along with age
//    public void displayMovieInfo(int currentYear) {
//        System.out.println("Title: " + title);
//
//        System.out.println("Director: " + director);
//        System.out.println("Release Year: " + releaseYear);
//        System.out.println("Age of the Movie: " + calculateMovieAge(currentYear) + " years");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Get the current year
//        // System.out.print("Enter the current year: ");
//        int currentYear = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character
//
//        // Create an ArrayList to store Movie objects
//        ArrayList<Movie> movies = new ArrayList<>();
//
//        // Prompt users to enter details for three movies
//        for (int i = 1; i <= 3; i++) {
//            // System.out.print("Enter Movie " + i + "'s Title: ");
//            String title = scanner.nextLine();
//
//            // System.out.print("Enter Movie " + i + "'s Director: ");
//            String director = scanner.nextLine();
//
//            // System.out.print("Enter Movie " + i + "'s Release Year: ");
//            int releaseYear = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//
//            // Create Movie object using constructor
//            Movie movie = new Movie(title, director, releaseYear);
//
//            // Add Movie object to the ArrayList
//            movies.add(movie);
//        }
//        // Display information about each movie along with age
//        System.out.println("\nMovies Information:");
//
//        for (Movie movie : movies) {
//            movie.displayMovieInfo(currentYear);
//            System.out.println(); // Add a newline for better readability
//        }
//
//        // Close the scanner
//        scanner.close();    }
//}

//create a class named hotels and get input from the user as name and yearOfopening and add to the list and display in the format as
//      Hotel Information :
//       Name : A2b
//       yearOfopening : 2010

//abiji

//class Student {
//    private static int nextId = 1;
//    private static List<Student> students = new ArrayList<>();
//
//    private int studentId;
//    private String name;
//    private String grade;
//
//    // Constructor
//    private Student(String name, String grade) {
//        this.studentId = nextId++;
//        this.name = name;
//        this.grade = grade;
//    }
//
//    // Method to add a new student
//    public static void addStudent(String name, String grade) {
//        Student newStudent = new Student(name, grade);
//        students.add(newStudent);
//    }
//
//    // Method to display all students
//    public static void displayAllStudents() {
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//    }
//
//    // Method to find and display the average grade
//    public static void displayAverageGrade() {
//
//
//        double totalGrades = 0;
//        for (Student student : students) {
//            totalGrades += gradeToNumeric(student.grade);
//        }
//
//        double averageGrade = totalGrades / students.size();
//        System.out.println("Average grade: " + averageGrade);
//    }
//
//    // Convert grade to a numeric value for calculation
//    private static double gradeToNumeric(String grade) {
//        switch (grade.toUpperCase()) {
//            case "A":
//                return 4.0;
//            case "B":
//                return 3.0;
//            case "C":
//                return 2.0;
//            case "D":
//                return 1.0;
//            case "F":
//                return 0.0;
//            default:
//                throw new IllegalArgumentException("Invalid grade: " + grade);
//        }
//    }
//
//    // Override toString method to print student details
//    @Override
//    public String toString() {
//        return "StudentId: " + studentId + ", Name: " + name + ", Grade: " + grade;
//    }
//
//    // Main method to demonstrate the functionality
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    String name = scanner.nextLine();
//                    String grade = scanner.nextLine();
//                    addStudent(name, grade);
//                    break;
//                case 2:
//                    displayAllStudents();
//                    break;
//                case 3:
//                    displayAverageGrade();
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}


import javax.swing.*;
import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.Scanner;

//abstract class Employee {
//    String name;
//    String designation;
//    double bonus;
//    double baseSalary;
//
//    public Employee(String name, String designation, double bonus) {
//        this.name = name;
//        this.designation = designation;
//        this.bonus = bonus;
//    }
//
//    abstract double calculateSalary();
//}
//
//class Manager extends Employee {
//    public Manager(String name, String designation, double bonus) {
//        super(name, designation, bonus);
//        this.baseSalary = 5000;
//    }
//
//    @Override
//    double calculateSalary() {
//        return baseSalary + bonus;
//    }
//}
//
//class Salesperson extends Employee {
//    private static final double COMMISSION_RATE = 0.05;
//
//    public Salesperson(String name, String designation, double bonus) {
//        super(name, designation, bonus);
//        this.baseSalary = 3000;
//    }
//
//    @Override
//    double calculateSalary() {
//        return baseSalary + (bonus * COMMISSION_RATE);
//    }
//}
//
//public class EmployeeSalaryCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter employee details (name designation bonus):");
//        String input = scanner.nextLine();
//
//        String[] inputParts = input.split(" ");
//        if (inputParts.length != 3) {
//            System.out.println("Invalid input format. Please provide name, designation, and bonus separated by spaces.");
//            return;
//        }
//
//        String name = inputParts[0];
//        String designation = inputParts[1].toLowerCase();
//        String bonusStr = inputParts[2];
//
//        if (!name.matches("[a-zA-Z]+")) {
//            System.out.println("Invalid name. Name should only contain alphabetical characters.");
//            return;
//        }
//
//        if (!designation.matches("[a-zA-Z]+")) {
//            System.out.println("Invalid designation. Designation should only contain alphabetical characters.");
//            return;
//        }
//
//        double bonus;
//        try {
//            bonus = Double.parseDouble(bonusStr);
//        } catch (NumberFormatException e) {
//            System.out.println("Bonus should be a numeric value.");
//            return;
//        }
//
//        Employee employee = null;
//        switch (designation) {
//            case "manager":
//                employee = new Manager(name, designation, bonus);
//                break;
//            case "salesperson":
//                employee = new Salesperson(name, designation, bonus);
//                break;
//            default:
//                System.out.println("Invalid designation. Available designations: salesperson, manager");
//                return;
//        }
//        double salary = employee.calculateSalary();
//        System.out.println("The salary of " + name + " (" + designation + ") is Rs. " + salary);
//    }
//}



//abstract class Employee
//{
//    String name;
//    String designation;
//    double bonus;
//    double basesalary;
//
//    public Employee(String name,String designation,double bonus)
//    {
//        this.name = name;
//        this.designation = designation;
//        this.bonus = bonus;
//    }
//
//    abstract double calculatesalary();
//}
//
//class Manager extends Employee
//{
//    public Manager(String name,String designation,double bonus)
//    {
//        super(name,designation,bonus);
//        this.basesalary = 5000;
//    }
//
//    double calculatesalary()
//    {
//        return basesalary + bonus;
//    }
//
//}
//
//
//class Salesperson extends Employee
//{
//    public Salesperson(String name,String designation,double bonus)
//    {
//        super(name,designation,bonus);
//        this.basesalary = 3000;
//    }
//
//    double calculatesalary()
//    {
//        return basesalary + (bonus * 0.05);
//    }
//
//}
//
///* Name of the class has to be "Main" only if the class is public. */
//class Program
//{
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine().trim();
//
//        String[] str = s.split(" ");
//
//        if(str.length != 3)
//        {
//            System.out.println( "Invalid input format. Please provide name, designation, and bonus separated by spaces.");
//            return;
//        }
//
//
//        String name = str[0];
//        String designation = str[1].toLowerCase();
//        String bonusstr = str[2];
//
//        if(!name.matches("[a-zA-Z]+"))
//        {
//            System.out.println("Invalid name. Name should only contain alphabetical characters.");
//            return;
//        }
//
//        if(!designation.matches("[a-zA-Z]+"))
//        {
//            System.out.println("Invalid designation. Designation should only contain alphabetical characters.");
//            return;
//        }
//        double bonus;
//        try{
//            bonus = Double.parseDouble(bonusstr);
//        }catch(NumberFormatException e)
//        {
//            System.out.println("Bonus should be a numeric value.");
//            return;
//        }
//
//        Employee employee = null;
//        switch(designation)
//        {
//            case "manager":
//                employee = new Manager(name,designation,bonus);
//                break;
//
//            case "salesperson":
//                employee = new Salesperson(name,designation,bonus);
//                break;
//
//            default:
//                System.out.println("Invalid Designation.");
//                break;
//        }
//
//
//        System.out.println("Name: "+name+", Bonus: $"+bonus+", Salary"+employee.calculatesalary());
//
//
//    }
//}

//class Student
//{
//    String name;
//    int age;
//
//    Student(String name,int age)
//    {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String dis()
//    {
//        return name;
//    }
//}
//class Main
//{
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next().toUpperCase();
//        int age = sc.nextInt();
//
//        Student stu = new Student(name,age);
//        stu.dis();
//        }
//        }

import java.util.Scanner;
//class CustomException extends Exception
//{
//    public CustomException(String str)
//    {
//        super(str);
//    }
//}
//class Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        try
//        {
//            if(age >= 18)
//            {
//                System.out.println("Age is valid");
//            }
//            else {
//                throw new CustomException("Age is not valid");
//            }
//        }catch (CustomException e)
//        {
//            System.out.println(e);
//        }
//    }
//}
//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size = 0;
//
//        // Prompt the user to enter the size of the seating arrangement
//        while (true) {
//            try {
//                size = Integer.parseInt(scanner.nextLine());
//                if (size <= 0) {
//                    System.out.println("Enter the valid input");
//                } else {
//                    break;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Enter the valid input");
//            }
//        }
//
//        // Initialize the seating arrangement
//        int[][] seats = new int[size][size];
//
//        // Prompt the user to enter the number of seats to be booked
//        int numberOfSeatsToBook = 0;
//        while (true) {
//            try {
//                numberOfSeatsToBook = Integer.parseInt(scanner.nextLine());
//                if (numberOfSeatsToBook <= 0) {
//                    System.out.println("Enter the valid input");
//                } else {
//                    break;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Enter the valid input");
//            }
//        }
//
//        // Prompt the user to enter the seat numbers to be booked
//        for (int i = 0; i < numberOfSeatsToBook; i++) {
//            while (true) {
//                try {
//                    int seatNumber = Integer.parseInt(scanner.nextLine());
//                    if (seatNumber < 1 || seatNumber > size * size) {
//                        throw new ArrayIndexOutOfBoundsException(seatNumber);
//                    }
//                    int row = (seatNumber - 1) / size;
//                    int col = (seatNumber - 1) % size;
//                    if (seats[row][col] == 1) {
//                        System.out.println("SeatNotAvailableException: Already Booked");
//                    } else {
//                        seats[row][col] = 1;
//                        break;
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.println("Enter the valid input");
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
//                }
//            }
//        }
//
//        // Display the final seating arrangement
//        System.out.println("The seats booked are:");
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(seats[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}

//class  Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = 0;
//
//        while(true){
//            try
//            {
//                size = Integer.parseInt(sc.nextLine());
//                if(size<=0)
//                {
//                    System.out.println("Enter the valid input broo..");
//                }
//                else {
//                    break;
//                }
//            }catch (NumberFormatException e)
//            {
//                System.out.println("Enter the valid input");
//            }
//        }
//         int[][] seatArray = new int[size][size];
//        int seats = 0;
//        while(true){
//            try
//            {
//                seats = Integer.parseInt(sc.nextLine());
//                if(seats < 0 || seats > size*size)
//                {
//                    System.out.println("Enter the valid input");
//                }
//                else{
//                    break;
//                }
//
//            }catch (NumberFormatException e)
//            {
//                System.out.println("Enter the valid input.");
//            }
//        }
//
//
//        for(int i=0;i<seats;i++)
//        {
//            while(true)
//            {
//                int seatno = 0;
//                try
//                {
//                    seatno = Integer.parseInt(sc.nextLine());
//                    int row = seatno/size;
//                    int col = seatno%size;
//                    if(seatArray[row][col] == 1){
//                        System.out.println("Filled");
//                    }
//                    else {
//                        seatArray[row][col] = 1;
//                        break;
//                    }
//                }
//                catch (NumberFormatException e)
//                {
//                    System.out.println("Enter valid number::");
//                }
//                catch (ArrayIndexOutOfBoundsException e)
//                {
//                    System.out.println(e+""+seatno);
//                }
//
//            }
//        }
//
//
//        for(int i=0;i<size;i++)
//        {
//            for(int j=0;j<size;j++)
//            {
//                System.out.print(seatArray[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}


//class Product implements Comparable<Product>
//{
//    int id;
//    String name;
//    int rating;
//    public Product(int id,String name,int rating)
//    {
//        this.id = id;
//        this.rating = rating;
//        this.name = name;
//    }
//    @Override
//    public int compareTo(Product o) {
//         return 0;
//    }
//}
//
//class Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//
//          ArrayList<Product> list = new ArrayList<>();
//        for(int i=0;i<n;i++)
//        {
//            int id = sc.nextInt();
//            String name =  sc.nextLine();
//            int rating = sc.nextInt();
//
//          list.add(new Product(id,name,rating));
//
//        }
//
//
//    }
//}


import java.util.*;

// Step 1: Define the Product class with Comparable
//class Product implements Comparable<Product> {
//    int product_id;
//    String name;
//    double price;
//    int rating;
//
//    // Constructor
//    public Product(int product_id, String name, double price, int rating) {
//        this.product_id = product_id;
//        this.name = name;
//        this.price = price;
//        this.rating = rating;
//    }
//
//    // Natural ordering by product_id
//    @Override
//    public int compareTo(Product other) {
//        return Integer.compare(this.product_id, other.product_id);
//    }
//
//    @Override
//    public String toString() {
//        return product_id + " " + name + " " + price + " " + rating;
//    }
//}
//
//// Comparator to sort by Product Name
//class SortByName implements Comparator<Product> {
//    public int compare(Product p1, Product p2) {
//        return p1.name.compareTo(p2.name);
//    }
//}
//
//// Comparator to sort by Rating
//class SortByRating implements Comparator<Product> {
//    public int compare(Product p1, Product p2) {
//        return Integer.compare(p2.rating, p1.rating); // Descending order
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Step 2: Create a LinkedList to hold Product objects
//        LinkedList<Product> productList = new LinkedList<>();
//
//        // Step 3: Read input data
//        int N = scanner.nextInt(); // number of products
//        scanner.nextLine(); // consume the newline
//
//        for (int i = 0; i < N; i++) {
//            int product_id = scanner.nextInt();
//            scanner.nextLine(); // consume the newline
//            String name = scanner.nextLine();
//            double price = scanner.nextDouble();
//            int rating = scanner.nextInt();
//            scanner.nextLine(); // consume the newline
//
//            // Add the product to the list
//            productList.add(new Product(product_id, name, price, rating));
//        }
//
//        // Step 4: Determine sorting choice
//        int choice = scanner.nextInt();
//
//        // Sort based on the choice
//        switch (choice) {
//            case 1:
//                // Sort by Product ID (Natural ordering via Comparable)
//                Collections.sort(productList);
//                System.out.println("Sort by Product_id :");
//                break;
//            case 2:
//                // Sort by Product Name
//                Collections.sort(productList, new SortByName());
//                System.out.println("Sort by Product_name :");
//                break;
//            case 3:
//                // Sort by Rating
//                Collections.sort(productList, new SortByRating());
//                System.out.println("Sort by Product_rating :");
//                break;
//            default:
//                System.out.println("Invalid choice");
//                return;
//        }
//
//        // Step 5: Display the sorted list using an iterator
//        Iterator<Product> iterator = productList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}


//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        strings.add("apple");
//        strings.add("orange");
//        strings.add("banana");
//        strings.add("grape");
//
//        // Sort the list in descending order using a Comparator
//        strings.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });
//
//        // Print the sorted list
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }
//}
//class Product implements Comparable<Product>
//{
//    int id;
//    String name;
//    Double price ;
//    int rating;
//
//    Product(int id,String name,double price,int rating)
//    {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.rating = rating;
//    }
//
//    @Override
//    public int compareTo(Product o) {
//        return Integer.compare(this.id,o.id);
//    }
//
//    @Override
//    public String toString() {
//        return "id=" +id + ", name='" + name + '\'' + ", price=" + price + ", rating=" + rating ;
//    }
//}
//
//class Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Product> list = new ArrayList<Product>();
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for(int i=0;i<n;i++)
//        {
//            int product_id = sc.nextInt();
//            sc.nextLine();
//            String name = sc.nextLine();
//            double price = sc.nextDouble();
//            int rating = sc.nextInt();
//            sc.nextLine();
//
//            list.add(new Product(product_id,name,price,rating));
//        }
//
//        Collections.sort(list);
//
//        for(Product pro : list)
//        {
//            System.out.println(pro);
//        }
//    }
//}


