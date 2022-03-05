package classes;

import interfases.Autenticavel;

public class Autenticador {
    private String [] autorizados = {"ABC1234", "12345678901-12345", "DEF5678", "12345678901-521"};

    public boolean autenticar(Autenticavel autenticavel) {
        String token = autenticavel.obeterCredenciais();

        return estaAutorizado(token);
    }

    private boolean estaAutorizado(String token) {
        boolean achou = false;

        for (int i = 0; i < autorizados.length && !achou; i++) {
            //1ª vez - ABC1234
            //i = 0
            //autorizados[0] = ABC1234
            //token = ABC1234
            achou = autorizados[i].equals(token);//true
        }
        return achou;
    
}
}