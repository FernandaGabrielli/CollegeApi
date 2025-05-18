package com.universidade.repository;

import com.universidade.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;


@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, UUID> {
    List<PessoaEntity> findByNameAndYearGreaterThan(String name, int year);
}
