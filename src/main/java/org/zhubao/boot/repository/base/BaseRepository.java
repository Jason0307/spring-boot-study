package org.zhubao.boot.repository.base;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface BaseRepository<T, K extends Serializable> extends CrudRepository<T, K> {

}
