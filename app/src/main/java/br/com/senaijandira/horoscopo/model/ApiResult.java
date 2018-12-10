package br.com.senaijandira.horoscopo.model;

/**
 * Created by 17259209 on 03/12/2018.
 */

public class ApiResult {

    private boolean sucesso;
    private String msg;

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
