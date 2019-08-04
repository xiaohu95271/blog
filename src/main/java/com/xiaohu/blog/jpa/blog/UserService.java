
package com.xiaohu.blog.jpa.blog;

import java.util.List;

public interface UserService {
    /**
     * 获取所有
     *
     * @return
     */
    public List<User> getUserList();

    /**
     * 根据id获取
     *
     * @param id
     * @return
     */
    public User findUserById(String id);

    /**
     * 新增
     *
     * @param user
     */
    public void save(User user);

    /**
     * 修改
     *
     * @param user
     */
    public void edit(User user);

    /**
     * 删除
     *
     * @param id
     */
    public void delete(long id);


}