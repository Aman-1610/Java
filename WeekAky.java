import java.util.Scanner;

class WeekAky 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitive comparison
        
        switch (dayOfWeek) 
{
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("It's a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's a weekend day.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
