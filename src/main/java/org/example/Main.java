package org.example;

public class Main {

    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(int radius) {
        double a = radius * radius * Math.PI;
        double b = a * 100;
        double c = (double) Math.round(b);
        return c/100;
    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        double a = 2 * radius * Math.PI;
        double b = a * 100;
        double c = (double) Math.round(b);
        return c/100;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        return "Radius: " + radius + "\nCircumference: " + circleCircum(radius) + "\nArea: " + circleArea(radius);

    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {

        int a = minutes/60;
        int b = minutes - (a*60);

        return a + " hours and " + b + " minutes" ;
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        int a = Integer.parseInt(time.substring(0,2)) - 12;
        int b = Integer.parseInt(time.substring(3));

        return  a + ":" + b + " pm";

    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        double xd = Math.pow((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)), 0.5);
        double b = xd * 100;
        double c = (double) Math.round(b);
        return c/100;

    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {

        double thing = (double)(fahrenheit-32) * 5/9;
        double b = thing * 100;
        double c = (double) Math.round(b);
        return c/100;
//(32°F − 32) × 5/9 = 0°C
    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        double thing = (double)celsius *9/5 + 32;
        double b = thing * 100;
        double c = (double) Math.round(b);
        return thing;
//(0°C × 9/5) + 32 = 32°F
    }

}