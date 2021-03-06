package com.wgcloud.mapper;

import com.wgcloud.entity.DbTable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName:DbTableMapper.java
 * @version v2.1
 * @author: http://www.wgstart.com
 * @date: 2019年11月16日
 * @Description: DbTableDao.java
 * @Copyright: 2019-2020 wgcloud. All rights reserved.
 *
 */
@Repository
public interface DbTableMapper {

    public List<DbTable> selectAllByParams(Map<String, Object> map) throws Exception;
    
	public List<DbTable> selectByParams(Map<String, Object> params) throws Exception;
	
    public DbTable selectById(String id) throws Exception;
    
    public void save(DbTable DbTable) throws Exception;

    public int deleteById(String[] id) throws Exception;

    public int countByParams(Map<String, Object> params) throws Exception;

    public Long sumByParams(Map<String, Object> params) throws Exception;
    
    public void updateById(DbTable DbTable) throws Exception;
}
