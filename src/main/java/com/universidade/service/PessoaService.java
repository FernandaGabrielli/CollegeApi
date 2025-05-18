package com.universidade.service;

import com.universidade.dto.PessoaDto;
import com.universidade.entity.PessoaEntity;
import com.universidade.exception.PessoaNotFoundException;
import com.universidade.repository.PessoaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PessoaService {

    private static final Logger logger = LoggerFactory.getLogger(PessoaService.class);
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaEntity addPessoa(PessoaDto dto) {
        PessoaEntity entity = new PessoaEntity();
        BeanUtils.copyProperties(dto, entity);
        logger.info("Pessoa criada: {}", dto);
        return pessoaRepository.save(entity);
    }

    public PessoaEntity getPessoaById(UUID id) {
        return pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException("Pessoa com ID " + id + " não encontrada."));
    }

    public PessoaEntity atualizarPessoa(UUID id, PessoaDto dto) {
        PessoaEntity existente = getPessoaById(id);
        BeanUtils.copyProperties(dto, existente, "id");
        logger.info("Pessoa atualizada: {}", existente);
        return pessoaRepository.save(existente);
    }

    public void deletarPessoa(UUID id) {
        PessoaEntity existente = getPessoaById(id);
        pessoaRepository.delete(existente);
        logger.info("Pessoa deletada com ID: {}", id);
    }

    public List<PessoaEntity> buscarPorNomeEIdade(String nome, int idadeMinima) {
        logger.info("Buscando pessoas com nome {} e idade > {}", nome, idadeMinima);
        return pessoaRepository.findByNameAndYearGreaterThan(nome, idadeMinima);
    }
}
