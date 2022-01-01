package co.com.sofka.bibliotecawebflux.repository;

import co.com.sofka.bibliotecawebflux.collections.Recurso;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositorioRecurso extends ReactiveMongoRepository<Recurso, String> {
}
