package site.whatsblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import site.whatsblog.service.StudentService;

import javax.annotation.Resource;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/25 17:51</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }
    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
