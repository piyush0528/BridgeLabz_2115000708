public class ques6 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println("32°F = " + convertFahrenheitToCelsius(32) + "°C");
        System.out.println("0°C = " + convertCelsiusToFahrenheit(0) + "°F");
        System.out.println("10 pounds = " + convertPoundsToKilograms(10) + " kg");
        System.out.println("5 kg = " + convertKilogramsToPounds(5) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("5 liters = " + convertLitersToGallons(5) + " gallons");
    }
}
