
package pessoa;
import java.io.*;
import javax.swing.JOptionPane;

public class Professor extends Pessoa implements Interface{
    private float salario;
    private int codigoCurso;
    Endereco enderecoResidencial = new Endereco();
    Endereco localTrabalho = new Endereco();
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void setCodigoCurso(int codigoCurso){
        this.codigoCurso = codigoCurso;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public int getCogidoCurso(){
        return codigoCurso;
    }
    
    public Professor(){}
    
    public Professor(float salario, int codigoCurso, String matricula, String nome, int anoInicio){
        super(matricula, nome, anoInicio);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario, int codigoCurso, String matricula, String nome){
        super(matricula, nome);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario, int codigoCurso, String matricula, int anoInicio){
        super(matricula, anoInicio);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario, int codigoCurso, String matricula){
        super(matricula);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario, int codigoCurso, int anoInicio){
        super(anoInicio);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario, String matricula){
        super(matricula);
        this.salario = salario;
    }
    
    public Professor(float salario, int codigoCurso){
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public Professor(float salario){
        this.salario = salario;
    }
    
    public Professor(int codigoCurso){
        this.codigoCurso = codigoCurso;
    }
    
    public void cadastrar(float salario, int codigoCurso, String matricula, String nome, int anoInicio){
        super.cadastrar(matricula, nome, anoInicio);
        this.salario = salario;
        this.codigoCurso = codigoCurso;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: " + salario +
                           "\nCódigo do Curso: " + codigoCurso +
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
       dos.writeInt(codigoCurso);
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
           
        TelaProfessor.jTextField1.setText(dis.readUTF());
        TelaProfessor.jTextField2.setText(dis.readUTF());
        TelaProfessor.jTextField3.setText(String.valueOf(dis.readFloat()));
        TelaProfessor.jTextField4.setText(String.valueOf(dis.readInt()));
        TelaProfessor.jTextField5.setText(String.valueOf(dis.readInt()));
        TelaProfessor.jTextField7.setText(dis.readUTF());
        TelaProfessor.jTextField8.setText(dis.readUTF());
        TelaProfessor.jTextField9.setText(dis.readUTF());
        TelaProfessor.jTextField10.setText(dis.readUTF());
        TelaProfessor.jTextField11.setText(dis.readUTF());
        TelaProfessor.jTextField12.setText(dis.readUTF());
        TelaProfessor.jTextField19.setText(String.valueOf(dis.readInt()));
        TelaProfessor.jTextField13.setText(dis.readUTF());
        TelaProfessor.jTextField14.setText(dis.readUTF());
        TelaProfessor.jTextField15.setText(dis.readUTF());
        TelaProfessor.jTextField16.setText(dis.readUTF());
        TelaProfessor.jTextField17.setText(dis.readUTF());
        TelaProfessor.jTextField18.setText(dis.readUTF());
        TelaProfessor.jTextField20.setText(String.valueOf(dis.readInt()));
        
        
        }catch(IOException Erro){  
            JOptionPane.showMessageDialog(null, "Erro ao recuperar o arquivo");
            
        }
    
    
    }
}
