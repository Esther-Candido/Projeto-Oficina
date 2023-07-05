package tpsi0922.oficiona.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.core.GestorOficiona;

public class Mostrar_Info_VIaturas extends Comando<GestorOficiona> {


    public Mostrar_Info_VIaturas(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.MOSTRAR_INFO_VIATURA);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Info VIatura ->");
    }
}
