package xyz.fengqing11.datasourcesjpa.dao1;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fengqing11.datasourcesjpa.pojo.User;

public interface UserDao1 extends JpaRepository<User, Integer> {
}
