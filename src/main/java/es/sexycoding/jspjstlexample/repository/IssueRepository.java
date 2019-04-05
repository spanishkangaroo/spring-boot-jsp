package es.sexycoding.jspjstlexample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.sexycoding.jspjstlexample.entity.Issue;

public interface IssueRepository extends CrudRepository<Issue, Long> {

	List<Issue> findByName(String name);
}
