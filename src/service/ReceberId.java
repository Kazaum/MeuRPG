package service;

import dao.RetornoUsuario;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReceberId {
    //Aqui eu irei receber a quantidade de resultados do JSON usuarios com o length e esse será o ID do próximo usuario em registro
    public int idUsuario(){
        try{
            RetornoUsuario retorno = new RetornoUsuario();
            JSONObject jsonObject = retorno.retorno();
            //Usar o objeto JSON
            JSONArray dadosArray = jsonObject.getJSONArray("dados");
            int id = dadosArray.length();
            
            return id;
        }catch (JSONException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar um ID para esse novo usuário.");
        }
        return 0;
    }
}
