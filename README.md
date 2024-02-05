# Jedis Cache

**redis image pull**
```shell
docker pull redis:6.2
```

**mysql image pull**
```shell
docker pull mysql:8
```

**redis 실행**
```shell
docker run --rm -it -d -p 6379:6379 redis:6.2
```

**mysql 실행**
```shell
docker run -e MYSQL_ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:8
```