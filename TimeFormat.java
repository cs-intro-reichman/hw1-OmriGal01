// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int tensMins = minutes / 10;
		int onesMins = minutes % 10;
		int displayHours = hours;
		String amOrPm = "AM";
		if (hours == 12) {
			amOrPm = "PM";
		}
		else if (hours > 12) {
			displayHours = hours - 12;
			amOrPm = "PM";
		}
		//To convert from 24H to 12H format, we need to subtract 12H from the given hour time only if it is larger than 12,
		//but if the value is exactly 12 we need to display PM.
		System.out.print(displayHours + ":" + tensMins + "" + onesMins + " " + amOrPm);
	}
}