package erros;
import java.io.*;
public class Principa {

	public static void main(String[] args) {
		try {
            FileReader arquivo = new FileReader("teste.txt");
            BufferedReader entrada = new BufferedReader(arquivo);

            for (int i = 0; i < 3; i++) {
                System.out.println(entrada.readLine());
            }

            arquivo.close();
        } 
		catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }
    }
	}

