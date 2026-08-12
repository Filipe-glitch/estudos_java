package poo.design_pattern.singleton;

public class Configuracao {
    private static Configuracao instancia;

    private String idioma;
    private boolean modoDebug;

    private Configuracao() {
        this.idioma = "pt-BR";
        this.modoDebug = false;
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

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

    public void exibirInformacoes() {
        System.out.println("Idioma: " + idioma + " | Modo Debug: " + modoDebug);
    }
}
