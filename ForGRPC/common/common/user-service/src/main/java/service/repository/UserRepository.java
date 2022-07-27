package service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import service.entity.User;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.userName LIKE %?1%")
    public List<User> search(String keyword);
}
