/*
 * Copyright 2008-2009 the original author or authors.
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
package net.hasor.test.dataql.udfs;
import net.hasor.dataql.Udf;
import net.hasor.dataql.UdfSource;
import net.hasor.dataql.sdk.TypeUdfMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 赵永春 (zyc@hasor.net)
 * @version : 2019-12-12
 */
public class UserOrderUdfSource extends TypeUdfMap implements UdfSource {
    public UserOrderUdfSource() {
        super(UserOrderUdfSource.class);
    }

    @Override
    public Map<String, Udf> getUdfResource() {
        return this;
    }
    // ----------------------------------------------------------------------------------

    /** user_list */
    public static List<UserBean> userList() {
        return new ArrayList<UserBean>() {{
            add(new UserBean(1));
            add(new UserBean(2));
            add(new UserBean(3));
            add(new UserBean(4));
        }};
    }

    /** order_list */
    public static List<OrderBean> orderList(final long accountID) {
        return new ArrayList<OrderBean>() {{
            add(new OrderBean(accountID, 1));
            add(new OrderBean(accountID, 2));
            add(new OrderBean(accountID, 3));
            add(new OrderBean(accountID, 4));
        }};
    }
}