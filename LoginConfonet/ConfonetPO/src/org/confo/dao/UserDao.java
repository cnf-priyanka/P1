package org.confo.dao;

import org.confo.Model.*;
public interface UserDao {
void register (User user);
User validateUser(Login login);
}
