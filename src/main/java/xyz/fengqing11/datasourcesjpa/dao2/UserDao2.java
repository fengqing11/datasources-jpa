package xyz.fengqing11.datasourcesjpa.dao2;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fengqing11.datasourcesjpa.pojo.User;

public interface UserDao2 extends JpaRepository<User, Integer> {
}
