package tpsi0922.oficiona.app.viaturas;

import atec.poo.ui.Comando;
import tpsi0922.oficiona.app.main.DoOpenMenuManutencao;
import tpsi0922.oficiona.app.main.DoOpenMenuViaturas;
import tpsi0922.oficiona.app.main.DoShowInfoOficina;
import tpsi0922.oficiona.core.GestorOficiona;

public class Menu extends atec.poo.ui.Menu {


    public Menu(GestorOficiona go){
        super(Label.MENU_NAME, new Comando<?>[] {
                new DoinsertViaturas(go),
                new Mostrar_Info_VIaturas(go),
                new Listar_Viaturas(go)



        });

    }
}
