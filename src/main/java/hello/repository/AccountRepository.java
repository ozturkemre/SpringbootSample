package hello.repository;

import org.springframework.data.repository.CrudRepository;

import hello.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountRepository extends CrudRepository<Account, Integer> {

}

