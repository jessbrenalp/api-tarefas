package com.jessica.apitarefas.controller;

import com.jessica.apitarefas.entity.Tarefa;
import com.jessica.apitarefas.service.TarefaService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }
    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }
    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }
    @PutMapping("/{id}")
    public Tarefa editar(@PathVariable Long id,@Valid @RequestBody Tarefa tarefa) {
        return tarefaService.editar(id, tarefa);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        tarefaService.excluir(id);
    }
}