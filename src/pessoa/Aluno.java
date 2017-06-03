
package pessoa;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa implements Interface{
    private float CR, mensalidade;
    private int codigoCurso;
    Endereco enderecoResidencial = new Endereco();
    Endereco enderecoCobranca = new Endereco();
    
    public void setCR(float CR){
        this.CR = CR;
    }
    
    public void setMensalidade(float mensalidade){
        this.mensalidade = mensalidade;
    }
    
    public void setCodigoCurso(int codigoCurso){
        this.codigoCurso = codigoCurso;
    }
    
    public float getCR(){
        return CR;
    }
    
    public float getMensalidade(){
        return mensalidade;
    }
    
    public int getCodigoCurso(){
        return codigoCurso;
    }
    
    public Aluno(){}
    
    public Aluno(float CR, float mensalidade, int codigoCurso, String matricula, String nome, int anoInicio){
        super(matricula, nome, anoInicio);
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;
    }
    
    public Aluno(float CR, float mensalidade, int codigoCurso, String matricula, String nome){
        super(matricula, nome);
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;
    }
    
    public Aluno(float CR, float mensalidade, int codigoCurso, String matricula){
        super(matricula);
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;
    }
    
    public Aluno(float CR, float mensalidade, int codigoCurso, int anoInicio){
        super(anoInicio);
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;
    }
    
    public Aluno(float CR, float mensalidade, int codigoCurso){
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;   
    }
    
    public Aluno(float CR, float mensalidade){
        this.CR = CR;
        this.mensalidade = mensalidade;
    }
    
    public Aluno(float CR, int codigoCurso){
        this.CR = CR;
        this.codigoCurso = codigoCurso;
    }
    
    public Aluno(float CR){
        this.CR = CR;
    }
    
    public Aluno(int codigoCurso){
        this.codigoCurso = codigoCurso;
    }
    
    public void cadastrar(float CR, float mensalidade, int codigoCurso, String matricula, String nome, int anoInicio){
        super.cadastrar(matricula, nome, anoInicio);
        this.CR = CR;
        this.mensalidade = mensalidade;
        this.codigoCurso = codigoCurso;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("CR: " + CR +
                           "\nMensalidade: " + mensalidade + 
                           "\nCódigo do Curso: " + codigoCurso +
                           "\nSemestralidade: " + valorSemestre);
        enderecoResidencial.imprimir();
        enderecoCobranca.imprimir();
    }
    
    public float calculaSemestre(){
        valorSemestre = mensalidade*6;
        return valorSemestre;
    }
    
    public void armazenar(){
        try{
       DataOutputStream dos = new DataOutputStream (new FileOutputStream (new File (matricula + ".dat")));
       dos.writeUTF(nome);
       dos.writeUTF(matricula);
       dos.writeFloat(CR);
       dos.writeFloat(mensalidade);
       dos.writeInt(codigoCurso);
       dos.writeInt(anoInicio);
       dos.writeUTF(enderecoResidencial.logradouro);
       dos.writeUTF(enderecoResidencial.tipoLogradouro);
       dos.writeUTF(enderecoResidencial.complemento);
       dos.writeUTF(enderecoResidencial.bairro);
       dos.writeUTF(enderecoResidencial.cidade);
       dos.writeUTF(enderecoResidencial.estado);
       dos.writeInt(enderecoResidencial.CEP);
       dos.writeUTF(enderecoCobranca.logradouro);
       dos.writeUTF(enderecoCobranca.tipoLogradouro);
       dos.writeUTF(enderecoCobranca.complemento);
       dos.writeUTF(enderecoCobranca.bairro);
       dos.writeUTF(enderecoCobranca.cidade);
       dos.writeUTF(enderecoCobranca.estado);
       dos.writeInt(enderecoCobranca.CEP);
       dos.close();
    }
        catch(IOException Erro){
            JOptionPane.showMessageDialog(null, "Erro, cadastro não realizado");
        }
    }
    
    public void recuperar(String matricula){
       try{
           DataInputStream dis = new DataInputStream(new FileInputStream(new File(matricula + ".dat")));
           
           TelaAluno.jTextField1.setText(dis.readUTF());
           TelaAluno.jTextField2.setText(dis.readUTF());
           TelaAluno.jTextField3.setText(String.valueOf(dis.readFloat()));
           TelaAluno.jTextField4.setText(String.valueOf(dis.readFloat()));
           TelaAluno.jTextField5.setText(String.valueOf(dis.readInt()));
           TelaAluno.jTextField6.setText(String.valueOf(dis.readInt()));
           TelaAluno.jTextField8.setText(dis.readUTF());
           TelaAluno.jTextField9.setText(dis.readUTF());
           TelaAluno.jTextField10.setText(dis.readUTF());
           TelaAluno.jTextField11.setText(dis.readUTF());
           TelaAluno.jTextField12.setText(dis.readUTF());
           TelaAluno.jTextField13.setText(dis.readUTF());
           TelaAluno.jTextField20.setText(String.valueOf(dis.readInt()));
           TelaAluno.jTextField14.setText(dis.readUTF());
           TelaAluno.jTextField15.setText(dis.readUTF());
           TelaAluno.jTextField16.setText(dis.readUTF());
           TelaAluno.jTextField17.setText(dis.readUTF());
           TelaAluno.jTextField18.setText(dis.readUTF());
           TelaAluno.jTextField19.setText(dis.readUTF());
           TelaAluno.jTextField21.setText(String.valueOf(dis.readInt()));
        
        }catch(IOException Erro){  
    
            JOptionPane.showMessageDialog(null, "Erro ao recuperar o arquivo");
            
        }
    
    
    }
}
