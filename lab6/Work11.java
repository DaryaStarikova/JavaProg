package ru.mirea.lab6;

interface Convertable {
    void convert(double celsiusTemperature);
}

class TemperatureConverter implements Convertable {
    @Override
    public void convert(double celsiusTemperature) {
        double kelvin = celsiusToKelvin(celsiusTemperature);
        double fahrenheit = celsiusToFahrenheit(celsiusTemperature);

        System.out.println("Celsius: " + celsiusTemperature);
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    private double celsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    private double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }
}

public class Work11 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double celsiusTemperature = 20.0; // Example Celsius temperature

        System.out.println("Converting temperature from Celsius to Kelvin and Fahrenheit:");
        converter.convert(celsiusTemperature);
    }
}