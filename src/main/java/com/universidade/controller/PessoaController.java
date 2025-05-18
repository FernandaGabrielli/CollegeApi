package com.universidade.controller;

import com.universidade.dto.PessoaDto;
import com.universidade.entity.PessoaEntity;
import com.universidade.service.PessoaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<PessoaEntity> addPessoa(@RequestBody PessoaDto dto) {
        return ResponseEntity.status(201).body(pessoaService.addPessoa(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaEntity> returnPessoa(@PathVariable UUID id) {
        return ResponseEntity.ok(pessoaService.getPessoaById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PessoaEntity> atualizarPessoa(@PathVariable UUID id, @RequestBody PessoaDto dto) {
        return ResponseEntity.ok(pessoaService.atualizarPessoa(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable UUID id) {
        pessoaService.deletarPessoa(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<PessoaEntity>> buscarPorNomeEIdade(
            @RequestParam String nome,
            @RequestParam int idadeMinima
    ) {
        return ResponseEntity.ok(pessoaService.buscarPorNomeEIdade(nome, idadeMinima));
    }
}
