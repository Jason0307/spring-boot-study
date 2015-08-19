package org.zhubao.boot.repository;

import org.springframework.data.jpa.repository.Query;
import org.zhubao.boot.model.User;
import org.zhubao.boot.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User, Integer> {

    /**
     * find by userId
     * @param userId
     * @return
     */
    @Query("SELECT u FROM User u INNER JOIN FETCH u.tags WHERE u.id = ?1")
    public User findByUserId(int userId);
    /**
     * find user by name
     * @param username
     * @return
     */
    public User findByUsername(String username);
    
    /**
     * find user by emailAddress
     * @param emailAddress
     * @return
     */
    public User findOneByEmailAddress(String emailAddress);
}
