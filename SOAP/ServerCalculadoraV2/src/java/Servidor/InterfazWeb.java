package Servidor;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InterfazWeb {
    public static void abrirInterfazWeb() {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost:3306/ServerCalculadoraV2/index.html"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}