public class Motociclo extends Viatura{

    private int cilindrada;

    public Motociclo(int id, String matricula, String marca, String modelo, int cilindrada){
        super(id, matricula, marca, modelo);
        this.cilindrada = cilindrada;

    }
}
