package fullstack.ufsc;

/**
 *
 * @author Andre
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String cidade;
    private String estado;

    public PessoaJuridica (String cnpj, String nome, String cidade, String estado) {
            super(nome);
            this.cnpj = cnpj;
            this.cidade = cidade;
            this.estado = estado;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
        
        
        
        
    @Override
    public String toString(){
        return "PessoaJuridica: [cnpj=" + cnpj + ", cidade=" + cidade + ", estado=" + estado + ", nome=" + this.getNome() + "]";
    }
    
    @Override
    public String getElementoInfo() {
        return this.toString();
    }
    
    }
