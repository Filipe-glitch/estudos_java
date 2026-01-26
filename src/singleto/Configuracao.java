package singleto;

public class Configuracao {
	// única instância
    private static Configuracao instancia;

    // atributos de configuração
    private String idioma;
    private boolean modoDebug;

    // construtor privado
    private Configuracao() {
        idioma = "pt-BR";
        modoDebug = false;
    }

    // método de acesso à instância
    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    // getters e setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isModoDebug() {
        return modoDebug;
    }

    public void setModoDebug(boolean modoDebug) {
        this.modoDebug = modoDebug;
    }

    public void info() {
        System.out.println("Idioma: " + idioma);
        System.out.println("Modo debug: " + modoDebug);
    }
}
//código mostra que há apenas uma configuração no sistema.
