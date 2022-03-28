package site.whatsblog.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import site.whatsblog.mapper.StudentMapper;
import site.whatsblog.pojo.Student;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 14:41</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        //首先从redis从查询，如果有直接使用，如果没有，去数据库查询并存放到redis缓存中
        // 提升系统性能，用户体验提升
        Integer count = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if (count == null) {
            count=studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount",count,30, TimeUnit.SECONDS);
        }
        return count;
    }
}
