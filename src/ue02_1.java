import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");
         
        int num1;
        int num2;
        int num3;
        int max;

        Out.print("1.Zahl: ");
        num1=In.readInt();
        Out.print("2.Zahl: ");
        num2=In.readInt();
        Out.print("3.Zahl: ");
        num3=In.readInt();

        if  (num1>=num2&&num1>=num3)
            max=num1;
        else if (num2>=num1&&num2>=num3)
            max=num2;
        else 
        max=num3;
        
        Out.print("Das Maximum ist:"+max);

    }
}
