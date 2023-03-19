import java.io.BufferedReader; import java.io.InputStreamReader;

class Vehicle {
InputStreamReader in = new InputStreamReader(System.in); BufferedReader read = new BufferedReader(in);

String regnNumber; int speed;
String color;
String ownerName;

Vehicle() { try {
System.out.print("Enter RegNum : \t"); regnNumber = read.readLine(); System.out.print("Enter speed : \t"); speed = Integer.parseInt(read.readLine()); System.out.print("Enter color : \t");
color = read.readLine(); System.out.println("Enter owner name :"); ownerName = read.readLine();
} catch (Exception e) { System.out.println("I/O error");
}

}

public void showData() { System.out.println("This is a vehicle class.");
System.out.println("Registration No : " + regnNumber); System.out.println("Avg Speed : " + speed); System.out.println("Color of vehicle : " + color); System.out.println("vehicle owned by " + ownerName);
}
}

class Bus extends Vehicle { int routeNumber;

Bus() { try {
System.out.print("Enter Route no :"); routeNumber = Integer.parseInt(read.readLine());
} catch (Exception e) { System.out.println("I/O error");
}
}

public void showData() { super.showData();
System.out.println("Route Number: " + routeNumber);
}
}

class Car extends Vehicle { String manufacturerName;

Car() {
try {
System.out.print("Enter Manufacturer Name :"); manufacturerName = read.readLine();
} catch (Exception e) { System.out.println("I/O error");
}
}

public void showData() { super.showData();
System.out.println("Manufacturer Name: " + manufacturerName);
}
}

public class Q4 {
public static void main(String[] args) {
InputStreamReader in = new InputStreamReader(System.in); BufferedReader read = new BufferedReader(in);

System.out.println("Enter type of vehicle : "); System.out.println("1. Bus\t 2. Car"); try {

byte choice = Byte.parseByte(read.readLine());
if (choice == 1) { Bus B = new Bus(); B.showData();
} else if (choice == 2) { Car C = new Car(); C.showData();
}
else {
System.out.println("Invalid Choice");
}
} catch (Exception e) { System.out.println("I/O Error");
}
}
}