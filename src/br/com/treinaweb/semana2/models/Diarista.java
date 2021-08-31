package br.com.treinaweb.semana2.models;

public class Diarista extends Pessoa {

    public Diarista() {}

    public Diarista(String nome, String telefone, String cpf, String endereco) {
        super(null, nome, telefone, cpf, endereco);
    }

    public Diarista(Long id, String nome, String telefone, String cpf, String endereco) {
        super(id, nome, telefone, cpf, endereco);
    }

}
