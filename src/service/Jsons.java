package service;

import model.Ataque;
import model.Classe;
import model.Personagem;
import model.Usuario;
import org.json.JSONObject;

public class Jsons {
    public JSONObject jsonUsuario(Usuario user, Classe newClass, Personagem personagem, Ataque atq1, Ataque atq2, Ataque atqEspecial){
        //Criando JSONs
            JSONObject jsonUsuario = new JSONObject();
            JSONObject jsonClass = new JSONObject();
            JSONObject jsonPersonagem = new JSONObject();
            JSONObject jsonAtaque1 = new JSONObject();
            JSONObject jsonAtaque2 = new JSONObject();
            JSONObject jsonAtaqueEspecial = new JSONObject();

            //Definindo json usuario
            jsonUsuario.put("id", user.getId());
            jsonUsuario.put("usuario", user.getUsuario());
            jsonUsuario.put("senha", user.getSenha());
            jsonUsuario.put("nivel", user.getNivel());
            jsonUsuario.put("classe", jsonClass);

            //Definindo json classe
            jsonClass.put("classe", newClass.getClasse());
            jsonClass.put("atributos", jsonPersonagem);

            //Definindo json personagem
            jsonPersonagem.put("idUsuario", user.getId());
            jsonPersonagem.put("vida", personagem.getVida());
            jsonPersonagem.put("mana/estamina", personagem.getGasto());
            jsonPersonagem.put("defesa", personagem.getDefesa());
            jsonPersonagem.put("regeneracao", personagem.getRegeneracao());
            jsonPersonagem.put("ataque1", jsonAtaque1);
            jsonPersonagem.put("ataque2", jsonAtaque2);
            jsonPersonagem.put("ataque_especial", jsonAtaqueEspecial);    

            //Definindo json ataques 1, 2 e especial
            jsonAtaque1.put("dano", atq1.getDano());
            jsonAtaque1.put("gasto", atq1.getGasto());
            jsonAtaque2.put("dano", atq2.getDano());
            jsonAtaque2.put("gasto", atq2.getGasto());
            jsonAtaqueEspecial.put("dano", atqEspecial.getDano());
            jsonAtaqueEspecial.put("gasto", atqEspecial.getGasto());
            return jsonUsuario;
    }
}
