package tpsi0922.oficiona.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.core.GestorOficiona;

public class DoOpenMenuManutencao extends Comando<GestorOficiona> {

    public DoOpenMenuManutencao(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.DO_OPEN_MANUTENCAO);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Usuario abriu o Menu Manutenção!!");

    }
}

