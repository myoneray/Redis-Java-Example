package testB;
import redis.clients.jedis.Jedis;

public class RedisJava {
    public static void main(String[] args) {
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        // 查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

        // 返回当前数据库的 key 的数量
        System.out.println(jedis.dbSize());
        // // 删除所有数据库的所有key
        System.out.println(jedis.flushAll());
        // // 删除当前数据库的所有key
        // System.out.println(jedis.flushDB());
        // 返回最近一次 Redis 成功将数据保存到磁盘上的时间，以 UNIX 时间戳格式表示
        System.out.println(jedis.lastsave());
        // 仅当 newkey 不存在时，将 key 改名为 newkey 。
        // jedis.rename("", "");

    }
}