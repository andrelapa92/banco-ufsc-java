package fullstack.ufsc;

/**
 *
 * @author Andre
 */

public abstract class Pessoa implements ElementosDoBanco {
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
    return nome;
  }
    
}
