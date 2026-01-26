package base;

class Derivada extends Base1 {  
    int y;  

    Derivada(){ 
        System.out.println("Construtor Derivada");
       // Ele não chama o construtor de Base explicitamente 
    }

    Derivada(int x, int y) {  
        super(x);   // chama o construtor da classe Base
        this.y = y;  // super();, ele imprime Construtor Base, Construtor Derivada
        //chama Base(int x) → define o valor de x. define y
    }  

    void exibir() {  
        System.out.println("x = "+ x +", y = "+y);  //Mostra os valores armazenados.
    }  
}