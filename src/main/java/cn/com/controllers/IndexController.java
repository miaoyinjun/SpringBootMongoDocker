package cn.com.controllers;

import cn.com.domain.User;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaxuan on 16/12/12.
 */
@RestController
public class IndexController {

    @Autowired
    private Datastore datastore;

    @RequestMapping(value = "/add", method = RequestMethod.POST,
                    produces = "application/json;charset=utf-8")
    public User index() {
        User user = new User();
        user.setUsername("bingwenwuhen");
        user.setMobile("1355xxxxxxx");
        user.setPassword("123456");
        datastore.save(user);
        return user;
    }
}
