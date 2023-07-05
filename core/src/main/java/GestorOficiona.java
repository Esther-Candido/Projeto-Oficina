package tpsi0922.oficiona.core;

public class GestorOficiona {
    private Oficina oficina;

    public GestorOficiona() {
        this.oficina = new Oficina("Oficina dos TPSI0922");
    }
    public String show_info(){
        return this.oficina.toString();
    }
}
