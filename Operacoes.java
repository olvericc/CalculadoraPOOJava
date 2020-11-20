package ATIVIDADES_PONTUADAS.AtividadePOO_Calculadora;

public class Operacoes extends Calculo implements ICalculadora{
    public double resultado;
    
    public Operacoes(){
        resultado = 0;
    }
    
    @Override
    public double Somar(double numero1, double numero2) {
        return resultado = numero1 + numero2;
    }
    
    @Override
    public double Subtrair(double numero1, double numero2) {
        return resultado = numero1 - numero2;
    }

    @Override
    public double Multiplicar(double numero1, double numero2) {
        return resultado = numero1 * numero2;
    }

    @Override
    public double Dividir(double numero1, double numero2) {
        return resultado = numero1 / numero2;
    }
    
}
