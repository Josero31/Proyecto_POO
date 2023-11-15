import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionUsuarios {

    private static final String CSV_FILE = "usuarios.csv";
    private List<usuario> usuarios;

    public GestionUsuarios() {
        usuarios = new ArrayList<>();
        cargarUsuarios();
    }

    private void cargarUsuarios() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    usuarios.add(new usuario(data[0], data[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarCredenciales(String username, String password) {
        for (usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(username) && usuario.getContraseña().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
