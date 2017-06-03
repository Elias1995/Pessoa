
package pessoa;
import java.io.*;
import javax.swing.JOptionPane;

public class Funcionario extends Pessoa implements Interface{
    private float salario;
    private String funcao;
    Endereco enderecoResidencial = new Endereco();
    Endereco localTrabalho = new Endereco();
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public Funcionario(){}
    
    public Funcionario(float salario, String funcao, String matricula, String nome, int anoInicio){
        super(matricula, nome, anoInicio);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario, String funcao, String matricula, String nome){
        super(matricula, nome);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario, String funcao, String matricula, int anoInicio){
        super(matricula, anoInicio);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario, String funcao, String matricula){
        super(matricula);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario, String funcao, int anoInicio){
        super(anoInicio);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario, String matricula){
        super(matricula);
        this.salario = salario;
    }
    
    public Funcionario(float salario, String funcao, int anoInicio, String matricula){
        super(anoInicio, matricula);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public Funcionario(float salario){
        this.salario = salario;
    }
    
    public Funcionario(String funcao){
        this.funcao = funcao;
    }
    
    public void cadastrar(float salario, String funcao, String matricula, String nome, int anoInicio){
        super.cadastrar(matricula, nome, anoInicio);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: " + salario +
                           "\nFunção: " + funcao + 
                           "\nSemestralidade: " + valorSemestre);
        enderecoResidencial.imprimir();
        localTrabalho.imprimir();
    }
    
    public float calculaSemestre(){
        valorSemestre = salario*6;
        return valorSemestre;
    }
    
    public void armazenar(){
          try{
       DataOutputStream dos = new DataOutputStream (new FileOutputStream (new File (matricula + ".dat")));
       dos.writeUTF(nome);
       dos.writeUTF(matricula);
       dos.writeFloat(salario);
       dos.writeUTF(funcao);
       dos.writeInt(anoInicio);
       dos.writeUTF(enderecoResidencial.logradouro);
       dos.writeUTF(enderecoResidencial.tipoLogradouro);
       dos.writeUTF(enderecoResidencial.complemento);
       dos.writeUTF(enderecoResidencial.bairro);
       dos.writeUTF(enderecoResidencial.cidade);
       dos.writeUTF(enderecoResidencial.estado);
       dos.writeInt(enderecoResidencial.CEP);
       dos.writeUTF(localTrabalho.logradouro);
       dos.writeUTF(localTrabalho.tipoLogradouro);
       dos.writeUTF(localTrabalho.complemento);
       dos.writeUTF(localTrabalho.bairro);
       dos.writeUTF(localTrabalho.cidade);
       dos.writeUTF(localTrabalho.estado);
       dos.writeInt(localTrabalho.CEP);
       dos.close();
       
          }catch(IOException Erro){
            JOptionPane.showMessageDialog(null, "Erro, cadastro não realizado");
        }
    }
    
    public void recuperar(String matricula){
       try{
           DataInputStream dis = new DataInputStream(new FileInputStream(new File(matricula + ".dat")));
        TelaFuncionario.jTextField1.setText(dis.readUTF());
        TelaFuncionario.jTextField2.setText(dis.readUTF());
        TelaFuncionario.jTextField3.setText(String.valueOf(dis.readFloat()));
        TelaFuncionario.jTextField4.setText(dis.readUTF());
        TelaFuncionario.jTextField5.setText(String.valueOf(dis.readInt()));
        TelaFuncionario.jTextField7.setText(dis.readUTF());
        TelaFuncionario.jTextField8.setText(dis.readUTF());
        TelaFuncionario.jTextField9.setText(dis.readUTF());
        TelaFuncionario.jTextField10.setText(dis.readUTF());
        TelaFuncionario.jTextField11.setText(dis.readUTF());
        TelaFuncionario.jTextField12.setText(dis.readUTF());
        TelaFuncionario.jTextField19.setText(String.valueOf(dis.readInt()));
        TelaFuncionario.jTextField13.setText(dis.readUTF());
        TelaFuncionario.jTextField14.setText(dis.readUTF());
        TelaFuncionario.jTextField15.setText(dis.readUTF());
        TelaFuncionario.jTextField16.setText(dis.readUTF());
        TelaFuncionario.jTextField17.setText(dis.readUTF());
        TelaFuncionario.jTextField18.setText(dis.readUTF());
        TelaFuncionario.jTextField20.setText(String.valueOf(dis.readInt()));
        
        
        }catch(IOException Erro){  
            JOptionPane.showMessageDialog(null, "Erro ao recuperar o arquivo");
            
        }
    
    
    }
}
