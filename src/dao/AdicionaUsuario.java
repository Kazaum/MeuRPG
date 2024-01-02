package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdicionaUsuario {
    public void newUsuario(JSONObject jsonUsuario) throws IOException{
        try{
            //Ler arquivo usuarios.json existente
            RetornoUsuario retorno = new RetornoUsuario();
            JSONObject json = retorno.retorno();
            JSONObject novosDados = new JSONObject();
                
            //Criar novos dados para adicionar ao arquivo
            novosDados.put("usuario", jsonUsuario);
            if(json.has("dados")){
                //Se houver um campo "dados", mesclar os novos dados com os existentes
                JSONArray dadosExistente = json.getJSONArray("dados");
                dadosExistente.put(novosDados);
            }else{
                //Se não houver campo "dados", crie um novo campo para os novos dados
                JSONArray novosDadosArray = new JSONArray();
                novosDadosArray.put(novosDados);
                json.put("dados", novosDadosArray);
            }
            //Escrever o JSON atualizado de volta para o arquivo
            Files.write(Paths.get("usuarios.json"), json.toString().getBytes());
            JOptionPane.showMessageDialog(null, "Novo usuário criado com sucesso!");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao adicionar o usuario'");
        }
    }
}
