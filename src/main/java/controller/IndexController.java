package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: tinymin
 * Date: 16. 3. 29.
 * Time: 오후 1:39
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class IndexController
{
    @RequestMapping("index")
    public String index()
    {
        return "/index";
    }
}
