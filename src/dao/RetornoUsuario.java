package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class RetornoUsuario {
    public JSONObject retorno(){
        try {
            //Ler o conteúdo do arquivo JSON
            String conteudo = new String(Files.readAllBytes(Paths.get("usuarios.json")));
            //Criar um objeto JSON a partir do conteúdo do arquivo
            JSONObject jsonObject = new JSONObject(conteudo);
            return jsonObject;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao JSON usuario.");
        }
        return null;
    }
}
