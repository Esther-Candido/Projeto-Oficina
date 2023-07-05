package tpsi0922.oficiona.app;
import tpsi0922.oficiona.core.GestorOficiona;
import tpsi0922.oficiona.app.main.Menu;



public class App {
    public static void main(String[] args) {
        GestorOficiona go = new GestorOficiona();

        Menu menu = new Menu(go);
        menu.open();

    }
}
