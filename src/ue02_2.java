import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        int year;
        int month;
        int days=0;
        boolean leapyear=false;

        Out.print("Month: ");
        month=In.readInt();
        Out.print("Year: ");
        year=In.readInt();

        if (year%4==0&&(year%400==0||year%100!=0)){
            leapyear=true;
        }
        
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
            days = 31;
            break;
            case 4, 6, 9, 11:
            days = 30;
            break;
            case 2:
                if (leapyear){
                    days=29;
                }
                else{
                    days=28;
                }           
            break;           
            default:
            Out.println("Fehler");
            }
            Out.print("The month you selected has "+days+" days.");
        }

    }

