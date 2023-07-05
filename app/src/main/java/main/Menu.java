package tpsi0922.oficiona.app.main;

import atec.poo.ui.Comando;

import tpsi0922.oficiona.core.GestorOficiona;

public class Menu extends atec.poo.ui.Menu {
    public Menu(GestorOficiona go) {
        super(Label.MENU_NAME, new Comando <?>[]{

                new DoShowInfoOficina(go),
                new DoOpenMenuManutencao(go),
                new DoOpenMenuViaturas(go)


        });
    }
}
