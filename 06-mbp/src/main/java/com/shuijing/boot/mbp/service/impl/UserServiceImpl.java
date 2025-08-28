package com.shuijing.boot.mbp.service.impl;

import com.shuijing.boot.mbp.entity.User;
import com.shuijing.boot.mbp.mapper.UserMapper;
import com.shuijing.boot.mbp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author 刘水镜
 * @since 2025-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
