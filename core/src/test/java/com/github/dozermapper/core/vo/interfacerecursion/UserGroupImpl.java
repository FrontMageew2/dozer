/*
 * Copyright 2005-2018 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dozermapper.core.vo.interfacerecursion;

import java.util.HashSet;
import java.util.Set;

public class UserGroupImpl implements UserGroup {

    private String name;

    private Set<User> users = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> aUsers) {
        users = aUsers;
    }

    public void addUser(User aUser) {
        users.add(aUser);
        aUser.setUserGroup(this);
    }

}
