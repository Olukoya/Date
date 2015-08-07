
public class DateActivity {

String weather;
String w;

public String getThatDay() {
	if (w.equals("2"))
		return "It was a Sunday ";
	else if (w.equals("3"))
		return "It was a Monday ";
	else if (w.equals("4"))
		return "It was a Tuesday ";
	else if (w.equals("5"))
		return "It was a Wednesday ";
	else if (w.equals("6"))
		return "It was a Thurday ";
	else if (w.equals("0"))
		return "It was a Friday ";
	else if (w.equals("1"))
		return "It was a Saturday ";
	else
		return w;
}

public void setW(String w) {
	this.w = w;
}

public String getWeather() {
	if (weather.equals("0"))
		return "It was a rainy day and the temperature averaged 56 degrees.";
	else if (weather.equals("1"))
		return "It was a cloudy day and the temperature averaged 78 degrees.";
	else if (weather.equals("2"))
		return "It was a sunny day and the temperature averaged 100 degrees.";
	else if (weather.equals("3"))
		return "It was a freezing day and the temperature averaged -35 degrees.";
	else
		return "Just employ me as a business analyst";
}

public void setWeather(String weather) {
	this.weather = weather;
}


}
