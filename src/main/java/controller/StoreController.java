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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StoreService;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchGet()
    {
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchPost(
            @RequestParam(value = "searchVal") String searchVal
            , Model model)
    {
        List<String> searchStores = Arrays.asList(searchVal.split(","));

        Collection<StoreInfo> searchResponse = storeService.select(searchStores);

        model.addAttribute("searchResponse", searchResponse );

        return "search";
    }
}
