package fullstack.ufsc;

/**
 *
 * @author Andre
 */
public class Movimento {
    private String tipo;
    private float valor;

    public Movimento (String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
    return "Movimento [tipo=" + tipo + ", valor=" + valor + "]";
    }
    
    
}
