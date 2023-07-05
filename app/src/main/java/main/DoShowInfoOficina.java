package tpsi0922.oficiona.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.core.GestorOficiona;

public class DoShowInfoOficina extends Comando<GestorOficiona> {

    public DoShowInfoOficina(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.DO_SHOW_INFO_OFICINA);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Executou Info Oficina");
    }
}
