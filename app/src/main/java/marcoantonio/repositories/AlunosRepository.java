package marcoantonio.repositories;

import org.springframework.data.repository.CrudRepository;

import marcoantonio.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> { 
    
} 