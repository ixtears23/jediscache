package junseok.snr.jediscache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

    @Bean
    public JedisPool createJedisPool() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setJmxEnabled(false); // JMX 등록 비활성화
        return new JedisPool(poolConfig, "127.0.0.1", 6379);
    }
}
