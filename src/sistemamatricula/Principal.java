package sistemamatricula;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		//// Criando dois alunos manualmente
		Aluno mario = new Aluno(); 
		mario.cpf="111.111.111-1"; 
		mario.nome="Super Mario"; 
		mario.matricula=1001; 
		
		Aluno luigi = new Aluno(); 
		luigi.cpf="222.222.222-2"; 
		luigi.nome="Super Luigi"; 
		luigi.matricula=1002; 
		
		// Exibindo as infos usando o método info()
		mario.info(); // classe Aluno.java
		luigi.info();  
		
		// SE SURGIR OUTRO ALUNO, USE ARRAYLIST
        Aluno toad = new Aluno();
        toad.nome = "Toad";
        toad.cpf = "111.222.555-44";
        toad.matricula = 15550;
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(toad);
        
        // MAIS ANTIGO, USANDO UM LOOP.
        Aluno maisAntigo = alunos.get(0); 
         // maisantigo guarda temporariamnete quem é o mais antigo até agora
         // alunos.get(0) pega o primeiro aluno da lista
        for (Aluno a : alunos) {
           if (a.matricula < maisAntigo.matricula) { 
              maisAntigo = a;
               }
           }   
        System.out.println("\n--- MAIS ANTIGO (USANDO LISTA) ---");
        maisAntigo.info();
               
               //CRIAR NOVA TURMA
               Turma turma = new Turma();
               turma.nome = "Turma de Programação";
               turma.prof = new Professor();
               turma.prof.nome = "Leo";
               
               turma.alunos = new ArrayList<>();
               turma.alunos.add(mario);
               turma.alunos.add(luigi);
               turma.alunos.add(toad);
               System.out.println("\n--- TURMA CRIADA ---");
               System.out.println("Turma: " + turma.nome);
               System.out.println("Professor: " + turma.prof.nome);
               System.out.println("Quantidade de alunos: " + turma.alunos.size());
               
               
               //REDUZIR O NÚMERO DE LINHAS: LINHA 7 ATÉ 11 do Principal.java
               Aluno toadette = new Aluno("Toadette", 5662, "155.55.44");
               Aluno Bowser = new Aluno ("Bowser"); 
               alunos.add(toadette);
               alunos.add(Bowser);
               alunos.add(new Aluno("Koopa", 1002, "555.444.444.54")); //outra forma  
            }
         }
