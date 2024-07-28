package LandT;

import java.util.ArrayList;
import java.util.Scanner;

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


import java.util.ArrayList;
import java.util.Scanner;
import java.time.Year;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

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

class Product implements Comparable<Product>
{
    int id;
    String name;
    int rating;


    Product(int id,String name,int rating)
    {
        this.id = id;
        this.name = name;
        this.rating= rating;
    }

    public int compareTo(Product o)
    {
        return this.rating - o.rating;
    }

    public String toString()
    {
        return id+" "+name+" "+rating;
    }
}
        class Main
        {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                ArrayList<Product> list = new ArrayList<>();

                for(int i=0;i<n;i++)
                {
                    int id = sc.nextInt();
                    String name = sc.nextLine();
                    int rating = sc.nextInt();

                    list.add(new Product(id,name,rating));
                }
                Collections.sort(list);
                System.out.println("Sorted by rating");

                for(Product li : list)
                {
                    System.out.println(li);
                }


            }
        }