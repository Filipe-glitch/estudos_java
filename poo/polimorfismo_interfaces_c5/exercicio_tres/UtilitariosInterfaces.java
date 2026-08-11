package poo.polimorfismo_interfaces_c5.exercicio_tres;

// Conversor Financeiro
interface ConversaoFinanceira {
    void converterDolarParaReal(double valorDolar);
}

class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.20;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("US$ " + valorDolar + " equivale a R$ " + String.format("%.2f", valorReal));
    }
}

// Conversor de Temperatura
interface ConversorTemperatura {
    double celsiusParaFahrenheit(double temperaturaCelsius);
    double fahrenheitParaCelsius(double temperaturaFahrenheit);
}

class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}

// Tabuada
interface Tabuada {
    void mostrarTabuada(int numero);
}

class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("--- Tabuada do " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
