package config;

import com.jfinal.config.Routes;
import controller.HelloController;
import controller.VueController;

/*
 * @author p78o2
 * @date 2020/11/6
 */
//路由拆分类
public class BlankRoutes extends Routes {
    @Override
    public void config() {
        //        添加controller
        add("/blank/hello", HelloController.class);
//        前端模板使用
        add("/vue", VueController.class);
    }
}
