package com.springbootredis.repository;


import com.springbootredis.bean.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * DemoInfo持久化类
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long> {

}
