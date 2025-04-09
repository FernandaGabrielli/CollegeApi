package com.universidade.controller;

import com.universidade.dto.PessoaDto;
import com.universidade.entity.PessoaEntity;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.universidade.repository.PessoaRepository;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public ResponseEntity<PessoaEntity> addPessoa (@RequestBody PessoaDto pessoaDto) {
        PessoaEntity pessoa = new PessoaEntity();
        BeanUtils.copyProperties(pessoaDto, pessoa);

        PessoaEntity savePessoa = this.pessoaRepository.save(pessoa);

        return ResponseEntity.status(HttpStatus.CREATED).body(savePessoa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> returnPessoa (@PathVariable UUID id) {
        Optional<PessoaEntity> foundPessoa = this.pessoaRepository.findById(id);

        return foundPessoa.<ResponseEntity<Object>>map(pessoaEntity -> ResponseEntity.status(HttpStatus.OK).body(pessoaEntity))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada! "));
    }
}