
public class Ligeiro extends Viatura{

    private TipoViatura tipo;

    public Ligeiro(int id, String matricula, String marca, String modelo, TipoVIatura tipo){
        super(id, matricula, marca, modelo);
        this.tipo = tipo;
    }


}
