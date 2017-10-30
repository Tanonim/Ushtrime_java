package ushtrime;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Ushtrimi6{
    private String datafillim;
    private String datafund;

    public void calculateDate(){
        @SuppressWarnings("resource")
        Scanner in=new Scanner(new InputStreamReader(System.in));

        System.out.println("Vendos daten e fillimit te punes (DD/MM/YY) :");
        datafillim=in.next();

        System.out.println("Vendos daten e fundit te punes (DD/MM/YY) :");
        datafund=in.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            Calendar start = Calendar.getInstance();
            start.setTime(sdf.parse(datafillim));
            Calendar end = Calendar.getInstance();
            end.setTime(sdf.parse(datafund));
            int ditepune = 0;
            while(!start.after(end))
            {
                int ditet = start.get(Calendar.DAY_OF_WEEK);
                if ((ditet != Calendar.SATURDAY) && (ditet != Calendar.SUNDAY))
                    ditepune++;
                start.add(Calendar.DATE, 1);
            }
            System.out.println("Dite pune jane: " + ditepune);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
       Ushtrimi6 daysCounter=new Ushtrimi6();
        daysCounter.calculateDate();
    }
}