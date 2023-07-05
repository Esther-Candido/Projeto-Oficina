package tpsi0922.oficiona.app.viaturas;

import atec.poo.ui.*;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.app.viaturas.Label;


import tpsi0922.oficiona.core.GestorOficiona;


public class DoinsertViaturas extends Comando<GestorOficiona> {

    private LerString matricula;
    private LerInteiro ano;
    private LerDouble preco;
    private LerOpcao tipo;

    public DoinsertViaturas(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.INSERIR_VIATURAS);
        this.matricula = new LerString(Label.ASK_MATRICULA, Constantes.MATRICULA_REGEX);
        this.ano = new LerInteiro(Label.ASK_ANO);
        this.tipo = new LerOpcao(Label.ASK_TIPO, new String[]{"Familiares","SUV","Desportivo","Classicos"});

    }

    @Override
    public void executar() throws DialogException {
        ui.lerInput(this.matricula);
        ui.lerInput(this.ano);
        ui.lerInput(this.tipo);

        System.out.println(this.matricula.getValor());
        System.out.println(this.ano.getValor());
        System.out.println(this.tipo.getValor());
    }
}
