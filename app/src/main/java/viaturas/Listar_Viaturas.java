package tpsi0922.oficiona.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.core.GestorOficiona;

import javax.swing.*;

public class Listar_Viaturas extends Comando<GestorOficiona> {


    public Listar_Viaturas(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.LISTAR_VIATURAS);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Viatura -> ");
    }
}
