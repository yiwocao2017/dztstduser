/**
 * @Title ISYSDictDAO.java 
 * @Package com.xnjr.moom.dao 
 * @Description 
 * @author haiqingzheng  
 * @date 2016年4月17日 上午10:16:49 
 * @version V1.0   
 */
package com.std.user.dao;

import com.std.user.dao.base.IBaseDAO;
import com.std.user.domain.SYSDict;

/** 
 * @author: haiqingzheng 
 * @since: 2016年4月17日 上午10:16:49 
 * @history:
 */
public interface ISYSDictDAO extends IBaseDAO<SYSDict> {
    String NAMESPACE = ISYSDictDAO.class.getName().concat(".");

    public int update(SYSDict data);
}
