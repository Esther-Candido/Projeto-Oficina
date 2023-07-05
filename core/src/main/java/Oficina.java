package tpsi0922.oficiona.core;

public class Oficina {
    private String nome;
    private int num_viaturas;

    //construtor
    public Oficina(String nome) {
        this.nome = nome;
        this.num_viaturas = 0;
    }

    @Override
    public String toString() {
        return String.format("Oficina: %s (%d numero de viaturas",this.nome, this.num_viaturas);
    }
}
