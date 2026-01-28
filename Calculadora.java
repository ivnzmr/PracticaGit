package Calculadora;

public class Calculadora {
   
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        System.out.println("5 + 3 = " + resultado);
    }
}
