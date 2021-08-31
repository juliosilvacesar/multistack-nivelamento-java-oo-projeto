package br.com.treinaweb.semana2.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.semana2.models.Diarista;

public class DiaristaRepository implements IRepository<Diarista, Long> {

    private List<Diarista> diaristas;

    private Long idAtual;

    public DiaristaRepository() {
        diaristas = new ArrayList<>();
        idAtual = 1L;
    }

    @Override
    public List<Diarista> buscarTodos() {
        return diaristas;
    }

    @Override
    public Diarista cadastrar(Diarista model) {
        model.setId(idAtual);

        diaristas.add(model);
        idAtual++;

        return model;
    }

    @Override
    public Diarista buscarPorId(Long id) {
        for (Diarista diarista : diaristas) {
            if (diarista.getId().equals(id)) {
                return diarista;
            }
        }

        return null;
    }

    @Override
    public boolean excluirPorId(Long id) {
        var diaristaEncontrada = buscarPorId(id);

        if (diaristaEncontrada != null) {
            diaristas.remove(diaristaEncontrada);
            return true;
        }

        return false;
    }

}
