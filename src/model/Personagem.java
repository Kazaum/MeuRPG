package model;

public class Personagem {
    private int idUsuario;
    private int vida;
    private int gasto;
    private int defesa;
    private int regeneracao;
    private Ataque ataque1;
    private Ataque ataque2;
    private Ataque ataqueEspecial;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getRegeneracao() {
        return regeneracao;
    }

    public void setRegeneracao(int regeneracao) {
        this.regeneracao = regeneracao;
    }

    public Ataque getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(Ataque ataque1) {
        this.ataque1 = ataque1;
    }

    public Ataque getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(Ataque ataque2) {
        this.ataque2 = ataque2;
    }

    public Ataque getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(Ataque ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }
}
