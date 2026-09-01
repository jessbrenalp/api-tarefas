package com.jessica.apitarefas.service;

import com.jessica.apitarefas.entity.Tarefa;
import com.jessica.apitarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import com.jessica.apitarefas.exception.TarefaNaoEncontradaException;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa criar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return tarefaRepository.findById(id)
                .orElseThrow(() -> new TarefaNaoEncontradaException("Tarefa não encontrada"));


    }
    public Tarefa editar(Long id, Tarefa novaTarefa) {
        novaTarefa.setId(id);
        return tarefaRepository.save(novaTarefa);
    }
    public void excluir(Long id) {
        tarefaRepository.deleteById(id);
    }
}