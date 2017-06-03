
package pessoa;

public class Endereco {
    String tipoLogradouro, logradouro, complemento, bairro, cidade, estado;
    int CEP;
    
    public void setTipoLogradouro(String tipoLogradouro){
        this.tipoLogradouro = tipoLogradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setCEP(int CEP){
        this.CEP = CEP;
    }
    
    public String getTipoLogradouro(){
        return this.tipoLogradouro;
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public String getComplemento(){
        return this.complemento;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public int getCEP(){
        return this.CEP;
    }
    
    public Endereco(){}
    
    public Endereco(String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade,
                    String estado, int CEP){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }
    
     public Endereco(String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade,
                    String estado){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
     }
     
     public Endereco(String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
     }
     
     public Endereco(String tipoLogradouro, String logradouro, String complemento, String bairro){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
     }
     
     public Endereco(String tipoLogradouro, String logradouro, String complemento){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
     }
     
     public Endereco(String tipoLogradouro, String logradouro){
       this.tipoLogradouro = tipoLogradouro;
       this.logradouro = logradouro;
     }
     
     public Endereco(String tipoLogradouro){
         this.tipoLogradouro = tipoLogradouro;
     }
     
     public Endereco(int CEP){
         this.CEP = CEP;
     }
     
     public void cadastrar(String tipoLogradouro, String logradouro, String complemento, String bairro, String cidade,
                    String estado, int CEP){
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }
     
     public void imprimir(){
         System.out.println("Tipo Logradouro: " + tipoLogradouro +
                            "\nLogradouro: " + logradouro +
                            "\nComplemento: " + complemento +
                            "\nBairro: " + bairro +
                            "\nCidade: " + cidade +
                            "\nEstado: " + estado +
                            "\nCEP: " + CEP);
     }
}
