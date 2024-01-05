package service;

import java.util.Base64;
import model.Ataque;
import model.Classe;
import model.Personagem;
import model.Usuario;

public class Objetos {
    public Usuario usuario(int id, String usuario, String senha, int nivel, Classe newClasse){
        Usuario user = new Usuario();
        user.setId(id);
        user.setUsuario(usuario);
        user.setSenha(senha);
        user.setNivel(nivel);
        user.setClasse(newClasse);
        
        return user;
    }
    
    public Classe classe(String classe, Personagem personagem){
        Classe Classe = new Classe();
        Classe.setClasse(classe);
        Classe.setPersonagem(personagem);
        
        return Classe;
    }
    
    public Personagem personagem(int vida, int gasto, int defesa, int regeneracao, int dinheiro, Ataque atq1, Ataque atq2, Ataque atqEspecial, int idUsuario){
        Personagem personagem = new Personagem();
        personagem.setVida(vida);
        personagem.setGasto(gasto);
        personagem.setDefesa(defesa);
        personagem.setRegeneracao(regeneracao);
        personagem.setDinheiro(dinheiro);
        personagem.setAtaque1(atq1);
        personagem.setAtaque2(atq2);
        personagem.setAtaqueEspecial(atqEspecial);
        personagem.setIdUsuario(idUsuario);
        
        return personagem;
    }
    
    public Ataque ataque1(int dano1, int gasto1){
        Ataque ataque1 = new Ataque();
        ataque1.setDano(dano1);
        ataque1.setGasto(gasto1);
        
        return ataque1;
    }
    
    public Ataque ataque2(int dano2, int gasto2){
        Ataque ataque2 = new Ataque();
        ataque2.setDano(dano2);
        ataque2.setGasto(gasto2);
        
        return ataque2;
    }
    
    public Ataque ataqueEspecial(int dano3, int gasto3){
        Ataque ataqueEspecial = new Ataque();
        ataqueEspecial.setDano(dano3);
        ataqueEspecial.setGasto(gasto3);
        
        return ataqueEspecial;
    }
}
