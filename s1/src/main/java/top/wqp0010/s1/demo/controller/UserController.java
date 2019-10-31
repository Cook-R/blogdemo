package top.wqp0010.s1.demo.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.wqp0010.s1.demo.entity.UserEntity;
import top.wqp0010.s1.demo.service.IUserService;

/**
 * @author: cook
 * @date: 2019年10月31日23:22:44
 * @description:
 */
@RestController
@Slf4j
public class UserController {

  @Autowired
  IUserService userService;


  @PostMapping("/user/save")
  public String saveUser(@RequestBody UserEntity userEntity) {
    userService.save(userEntity);
    return "success insert user = " + JSON.toJSONString(userEntity);
  }

  @RequestMapping("/user/remove")
  public String removeUser(@RequestParam("id") int id) {
    userService.removeById(id);
    return "success delete userId = " + id;
  }



  @RequestMapping("/user/info")
  public UserEntity getUser(@RequestParam("id") int id) {
    UserEntity userEntity = userService.getById(id);
    return userEntity;
  }

  @RequestMapping("/user/list")
  public IPage getUserList(Page page) {
    page.setDesc("name");
    IPage iPage = userService.page(page);
    return iPage;
  }
}
