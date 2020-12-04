package controller;
/*
 * @author p78o2
 * @date 2020/12/4
 */

import callback.R;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import domain.po.User;

import java.util.List;

public class VueController extends Controller {
    public void getAllUser(){
        int pageNum = getParaToInt("pageNum");
        int pageSize = getParaToInt("pageSize");
        Page<User> users = User.dao.paginate(pageNum,pageSize,"select * ", " from user");
        renderJson(new R(true, 200, users, ""));
    }
}
