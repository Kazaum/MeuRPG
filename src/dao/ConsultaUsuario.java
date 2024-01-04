package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Ataque;
import model.Classe;
import model.Personagem;
import model.Usuario;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import service.Objetos;

public class ConsultaUsuario {
    //Aqui vou retornar os valores do json
    public Usuario consultaDados(int i){
        
        Objetos objetos = new Objetos();
        RetornoUsuario retorno = new RetornoUsuario();
        JSONObject json = retorno.retorno();
        JSONArray dadosArray = json.getJSONArray("dados");
        JSONObject usuarioJson = dadosArray.getJSONObject(i).getJSONObject("usuario");
        JSONObject classeJson = usuarioJson.getJSONObject("classe");
        JSONObject atributosJson = classeJson.getJSONObject("atributos");
        JSONObject atqJson1 = atributosJson.getJSONObject("ataque1");
        JSONObject atqJson2 = atributosJson.getJSONObject("ataque2");
        JSONObject atqJson3 = atributosJson.getJSONObject("ataque_especial");
        
        int dano1 = atqJson1.getInt("dano");
        int gasto1 = atqJson1.getInt("gasto");
        int dano2 = atqJson2.getInt("dano");
        int gasto2 = atqJson2.getInt("gasto");
        int dano3 = atqJson3.getInt("dano");
        int gasto3 = atqJson3.getInt("gasto");
        
        int gasto = atributosJson.getInt("mana/estamina");
        int regeneracao = atributosJson.getInt("regeneracao");
        int dinheiro = atributosJson.getInt("dinheiro");
        int idUsuario = atributosJson.getInt("idUsuario");
        int vida = atributosJson.getInt("vida");
        int defesa = atributosJson.getInt("defesa");
        
        int id = usuarioJson.getInt("id");
        String usuario = usuarioJson.getString("usuario");
        String senha = usuarioJson.getString("senha");
        int nivel = usuarioJson.getInt("nivel");
        
        String classe = classeJson.getString("classe");
        
        Ataque atq1 = objetos.ataque1(dano1, gasto1);
        Ataque atq2 = objetos.ataque1(dano2, gasto2);
        Ataque atqEspecial = objetos.ataque1(dano3, gasto3);
        
        Personagem personagem = objetos.personagem(vida, gasto, defesa, regeneracao, dinheiro, atq1, atq2, atqEspecial, idUsuario);
        
        Classe newClasse = objetos.classe(classe, personagem);
        
        Usuario user = objetos.usuario(id, usuario, senha, nivel, newClasse);
        
        return user;
    }
    
    public String[] consultaString(String consulta){
        RetornoUsuario retorno = new RetornoUsuario();
        JSONObject json = retorno.retorno();
        JSONArray dadosArray = json.getJSONArray("dados");
        String[] meusDados = null;
        List<String> listaDados;
        listaDados = new ArrayList<>();
        try{
            for(int i = 0; i < dadosArray.length(); i++){
                JSONObject obj = dadosArray.getJSONObject(i);
                if (dadosArray.length() > 0) {
                    //Acessando o objeto no array "dados"
                    JSONObject objeto = dadosArray.getJSONObject(i);
                    //Acessando a propriedade dentro do objeto "usuario"
                    String retornoConsulta = objeto.getJSONObject("usuario").getString(consulta); 
                    listaDados.add(retornoConsulta);
                    meusDados = listaDados.toArray(new String[0]);
                } else {
                    System.out.println("Não há dados disponíveis.");
                }
            }
            return meusDados;
        }catch(JSONException e){
        System.out.println("Deu errado");
        }
    return null;
    }
    
    public int[] consultaInt(String consulta){
        RetornoUsuario retorno = new RetornoUsuario();
        JSONObject json = retorno.retorno();
        JSONArray dadosArray = json.getJSONArray("dados");
        List<Integer> listaDados;
        listaDados = new ArrayList<>();
        int[] meusDados = new int[100000];
        try{
            for(int i = 0; i < dadosArray.length(); i++){
                JSONObject obj = dadosArray.getJSONObject(i);
                if (dadosArray.length() > 0) {
                    //Acessando o objeto no array "dados"
                    JSONObject objeto = dadosArray.getJSONObject(i);
                    //Acessando a propriedade dentro do objeto "usuario"
                    int retornoConsulta = objeto.getJSONObject("usuario").getInt(consulta);
                    listaDados.add(retornoConsulta);
                    meusDados[i] = listaDados.get(i);
                } else {
                    System.out.println("Não há dados disponíveis.");
                }
            }
            return meusDados;
        }catch(JSONException e){
        System.out.println("Deu errado");
        }
    return null;
    }
}
