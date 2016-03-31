package controller;

/**
 * Created with IntelliJ IDEA.
 * User: tinymin
 * Date: 16. 3. 29.
 * Time: 오후 4:22
 * To change this template use File | Settings | File Templates.
 */

import domain.StoreInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StoreService;

import java.util.Collection;

@Controller
public class StoreController
{
    private static Logger logger = Logger.getLogger(StoreController.class);

    @Autowired
    private StoreService storeService;

@RequestMapping("/storesInfo")
@ResponseBody
public Collection<StoreInfo> storesInfo()
{
    return storeService.selectAllStore();
}
}
