package cn.com.controllers;

import cn.com.domain.User;
import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/", method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    public List<User> home() {
        System.out.println("22");
//        return datastore.createQuery(User.class).asList();
        List<User> list = new ArrayList<>();
        list.add(new User());
        return list;
    }

    @ExceptionHandler
    public String getErrorResult(HttpServletRequest request, Exception ex) {
       return ex.getMessage()+ex.getClass();
    }

}
