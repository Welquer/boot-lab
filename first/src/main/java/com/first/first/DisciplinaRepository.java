package com.first.first;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

@RepositoryRestResource()
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Secured(value = "ROLE_ADMIN")
    @RestResource(path = "/datainicio/after/current")
    @Query("select d from Disciplina d where d.dataInicio > CURRENT_DATE")
    List<Disciplina> findByDataInicioAfterCurrent();
}
