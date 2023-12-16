import java.util.Scanner;

class DaysInMonthAky 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a month: ");
        String month = scanner.nextLine().toLowerCase();

        switch (month) 
{
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
