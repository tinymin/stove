package service;

import dao.StoreDao;
import domain.StoreInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: tinymin
 * Date: 16. 3. 29.
 * Time: 오후 4:25
 * To change this template use File | Settings | File Templates.
 */
public class StoreService
{
    private static Logger logger = Logger.getLogger(StoreService.class);

    @Autowired
    private StoreDao storeDao;

//    public StoreService(StoreDao storeDao)
//    {
//        this.storeDao = storeDao;
//    }

    public Collection<StoreInfo> selectAllStore()
    {
        return storeDao.selectAll();
    }
}
