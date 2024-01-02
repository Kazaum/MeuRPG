package service;

import dao.ConsultaUsuario;

public class ValidaUsuario {
    //Aqui irei validar todas as informações que referem-se ao usuario.
    public boolean validaNome(String usuario){
        ConsultaUsuario newConsulta = new ConsultaUsuario();
        String consulta = "usuario";
        String[] retorno = newConsulta.consultaString(consulta);
        boolean encontrado = false;
        for (int i = 0; i < retorno.length; i++) {
            System.out.println(retorno[i]);
            System.out.println(usuario);
            if (retorno[i].equalsIgnoreCase(usuario)) {
                encontrado = true;
                break; // Se encontrar o valor, não precisa continuar o loop
            }
        }
        if (encontrado == true) {
            System.out.println("O valor " + usuario + " está na array ids.");
        } else {
            System.out.println("O valor " + usuario + " não está na array ids.");
        }
        return encontrado;
    }
    
    public boolean validaId (int id){
        ConsultaUsuario newConsulta = new ConsultaUsuario();
        String consulta = "id";
        int[] retorno = newConsulta.consultaInt(consulta);
        boolean encontrado = false;
        for (int i = 0; i < retorno.length; i++) {
            if (retorno[i] == id) {
                encontrado = true;
                break; // Se encontrar o valor, não precisa continuar o loop
            }
        }
        if (encontrado == true) {
            System.out.println("O valor " + id + " está na array ids.");
        } else {
            System.out.println("O valor " + id + " não está na array ids.");
        }
        return encontrado;
    }
}
