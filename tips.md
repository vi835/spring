###### 两个数组比较相等

```
  return Arrays.equals(tArr,sArr);
```

###### 二维数组

```
int[m][n]
arr.length = n
arr[0].length = m
```

######  map的遍历

```
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    value = entry.getValue();
    if (value > half) {
        return entry.getKey();
    }
}
```

###### 二维数组

```
int[][] arr={{1,1},{3,4},{-1,0}};
System.out.println(arr.length);// 3
```

##### Spring

###### 优势

1. 方便解耦 简化开发
2. AOP编程的支持
3. 声明式事务的支持
4. 方便程序的测试
5. 方便集成各种优秀的框架
6. 降低JavaEE API的使用难度
7. Spring源码是经典学习的范例

###### Spring程序开发步骤

1. 导入Spring开发的基本坐标    导入坐标
2. 编写Dao接口和实现类    创建Bean
3. 创建Spring核心配置文件    创建applicationContext.xml配置文件
4. 在Spring配置文件中配置UserDaoImpl     在配置文件中进行配置
5. 使用Spring的API获得Bean实例    创建ApplicationContext对象getBean

###### Bean标签基本配置

用于配置对象交由 `Spring`来创建

<u>默认是调用Bean对象的无参构造方法创建的</u>

默认情况下它调用的是类中的`无参构造函数` 如果没有无参构造函数则不能创建成功

基本属性

- `id` Bean实例在Spring容器中的唯一标识
- `class` Bean的全限定名称

Bean标签范围配置

`scope` 指对象的作用范围 取值如下

|    取值范围    | 说明                                                         |
| :------------: | :----------------------------------------------------------- |
|   singleton    | 默认值 单例的                                                |
|   prototype    | 多例的                                                       |
|    request     | WEB项目中 Spring创建一个Bean的对象 将对象存入到request中     |
|    session     | WEB项目中 Spring创建一个Bean的对象 将对象存入到session域中   |
| global session | WEB项目中 应用在protlet环境 如果没有protlet环境 那么global session 相当于session |

###### 当scope的取值为singleton时

Bean的实例化个数：1个

Bean的实例化时机：当spring核心文件被加载时 实例化配置的Bean实例

Bean的生命周期

- 对象创建 当应用加载 创建容器时 对象就被创建了
- 对象运行 只要容器在 对象一直活着
- 对象销毁 当应用卸载时 销毁容器时 对象就被销毁了

##### 当scope的取值为prototype时

Bean的实例化个数：多个

Bean的实例化时机：当调用getBean()方法时 创建新的对象实例

Bean的生命周期

- 对象创建 当使用对象时 创建新的对象实例
- 对象运行 只要对象在使用中 就一直活着
- 对象销毁 当对象长时间不用时 被java的垃圾回收器回收了

###### Bean实例化三种方式

- 无参构造方法实例化
- 工厂静态方法实例化
- 工厂实例方法实例化

###### Bean的依赖注入的数据类型

- 普通数据类型
- 引用数据类型
- 集合数据类型

###### List Map Properties的注入

```
     <bean id="userDao" class="com.itheima.dao.impl.UserDaoImpl" init-method="init" destroy-method="destroy">
        <property name="userName" value="lisi"></property>
        <property name="age" value="10"></property>

        <property name="strList">
            <list>
                <value>aaa</value>
                <value>bbb</value>
                <value>ccc</value>
            </list>
        </property>

        <property name="userMap">
            <map>
                <entry key="user1" value-ref="user1"></entry>
                <entry key="user2" value-ref="user2"></entry>
            </map>
        </property>

        <property name="properties">
            <props>
                <prop key="rick">hello</prop>
                <prop key="summer">beautiful</prop>
            </props>
        </property>
    </bean>

    <bean id="user1" class="com.itheima.domain.User">
        <property name="name" value="tom"></property>
        <property name="address" value="suzhou"></property>
    </bean>

    <bean id="user2" class="com.itheima.domain.User">
        <property name="name" value="rick"></property>
        <property name="address" value="yangzhou"></property>
    </bean>
```

