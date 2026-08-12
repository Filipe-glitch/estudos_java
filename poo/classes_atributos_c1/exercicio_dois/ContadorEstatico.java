package poo.classes_atributos_c1.exercicio_dois;

public class ContadorEstatico {
    private static int totalInstancias = 0; 
    
    private int contadorComum = 0; 

    public ContadorEstatico() {
        totalInstancias++;
    }

    public void incrementarComum() {
        this.contadorComum++;
    }

    public int getContadorComum() {
        return contadorComum;
    }

    public static int getTotalInstancias() {
        return totalInstancias;
    }
}