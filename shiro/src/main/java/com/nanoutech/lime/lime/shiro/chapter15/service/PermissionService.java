package com.nanoutech.lime.lime.shiro.chapter15.service;

import com.nanoutech.lime.lime.shiro.chapter15.entity.Permission;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
