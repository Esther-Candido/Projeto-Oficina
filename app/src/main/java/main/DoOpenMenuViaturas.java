package tpsi0922.oficiona.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi0922.oficiona.app.viaturas.Menu;
import tpsi0922.oficiona.core.GestorOficiona;

public class DoOpenMenuViaturas extends Comando<GestorOficiona> {

    public DoOpenMenuViaturas(GestorOficiona gestorOficiona) {
        super(gestorOficiona, Label.DO_OPEN_VIATURA);
    }

    @Override
    public void executar() throws DialogException {
        Menu menu = new Menu (this.getReceptor());
        menu.open();
    }
}
