package com.mmall.proxy;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mmall.service.impl.UserServiceImpl;

/**
 * @author xyy
 * @create 2017-09-11 9:30
 **/
public class IUserServiceProxy implements IUserService {


    private UserServiceImpl userService;




    public IUserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }


    @Override
    public ServerResponse<User> login(String username, String password) {
        return null;
    }

    @Override
    public ServerResponse<String> register(User user) {
        return null;
    }

    @Override
    public ServerResponse<String> checkValid(String str, String type) {
        return null;
    }

    @Override
    public ServerResponse<String> selectQuestion(String username) {
        before();
        userService.selectQuestion("rosen");
        after();
        return null;
    }

    @Override
    public ServerResponse<String> checkAnswer(String username, String question, String answer) {
        return null;
    }

    @Override
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken) {
        return null;
    }

    @Override
    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user) {
        return null;
    }

    @Override
    public ServerResponse<User> updateInformation(User user) {
        return null;
    }

    @Override
    public ServerResponse<User> getInformation(Integer userId) {
        return null;
    }

    @Override
    public ServerResponse checkAdminRole(User user) {
        return null;
    }



    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
