package ushtrime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Environment {

	public static void main(String[] args) {

		String dateStart = "10/29/2017 10:00:00";
		String dateStop = "10/30/2017 12:30:00";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " dite, ");
			System.out.print(diffHours + " ore, ");
			System.out.print(diffMinutes + " minuta, ");
			System.out.print(diffSeconds + " sekonda.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

