package junseok.snr.jediscache;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class JedisDemoLauncher {

    public static void main(String[] args) {
        final JedisPool jedisPool = new JedisPool("127.0.0.1", 6379);
        try (Jedis jedis = jedisPool.getResource()) {
            jedis.set("foo", "bar");
            log.info(">>> key : foo, value : {}", jedis.get("foo"));

            final Map<String, String> hash = new HashMap<>();
            hash.put("name", "John");
            hash.put("surname", "Smith");
            hash.put("company", "Redis");
            hash.put("age", "29");
            jedis.hset("user-session:123", hash);
            log.info("=== key : user-session:123, value : {}", jedis.hgetAll("user-session:123"));
        }
    }
}
