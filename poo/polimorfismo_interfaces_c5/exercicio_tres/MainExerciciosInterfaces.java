package poo.polimorfismo_interfaces_c5.exercicio_tres;

public class MainExerciciosInterfaces {
    public static void main(String[] args) {
        // Testando Moeda
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(50);
        System.out.println();

        // Testando Temperatura
        ConversorTemperatura conversorTemp = new ConversorTemperaturaPadrao();
        double f = conversorTemp.celsiusParaFahrenheit(25);
        System.out.println("25°C em Fahrenheit: " + f + "°F");
        System.out.println("77°F em Celsius: " + conversorTemp.fahrenheitParaCelsius(77) + "°C\n");

        // Testando Tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);
    }
}
