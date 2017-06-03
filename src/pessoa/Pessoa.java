
package pessoa;
import java.io.*;


public class Pessoa {
    protected String matricula, nome;
    protected int anoInicio;
    protected float valorSemestre;
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAnoInicio(int anoInicio){
        this.anoInicio = anoInicio;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoInicio(){
        return anoInicio;
    }
    
    public Pessoa(){}
    
    public Pessoa(String matricula, String nome, int anoInicio){
        this.matricula = matricula;
        this.nome = nome;
        this.anoInicio = anoInicio;
    }
    
    public Pessoa(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public Pessoa(String matricula, int anoInicio){
        this.matricula = matricula;
        this.anoInicio = anoInicio;
    }
    
    public Pessoa(String matricula){
        this.matricula = matricula;
    }
    
    public Pessoa(int anoInicio){
        this.anoInicio = anoInicio;
    }
    
    public Pessoa(int anoInicio, String matricula, String nome){
        this.anoInicio = anoInicio;
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public Pessoa(int anoInicio, String matricula){
        this.anoInicio = anoInicio;
        this.matricula = matricula;
    }
    
    public void cadastrar(String matricula, String nome, int anoInicio){
        this.matricula = matricula;
        this.nome = nome;
        this.anoInicio = anoInicio;
    }
    
    public void imprimir(){
        System.out.println("Matrícula: " + matricula + 
                           "\nNome: " + nome + 
                           "\nAno de Início: " + anoInicio);
    }
    
    public float calculaSemestre(){
        return valorSemestre;
    }

    public static void main(String[] args) {
        
    }
    
}
