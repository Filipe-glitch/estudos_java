package base;

public class Base1 {
	int x;  

    Base1(){ 
        System.out.println("Construtor Base"); 
        //construtor sem parâmetros
    } 

    Base1(int x) {  
        this.x = x;  
        //construtor que define x como parâmetro
    }  
}  