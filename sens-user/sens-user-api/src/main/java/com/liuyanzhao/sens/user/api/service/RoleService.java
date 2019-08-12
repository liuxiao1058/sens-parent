package com.liuyanzhao.sens.user.api.service;

import com.liuyanzhao.sens.user.api.entity.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 角色接口
 * @author 言曌
 * @date 2019-08-12 12:53
 */
@FeignClient(name = "sens-user-core")
public interface RoleService {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    @GetMapping("/role/findByDefaultRole")
    List<Role> findByDefaultRole(Boolean defaultRole);
}