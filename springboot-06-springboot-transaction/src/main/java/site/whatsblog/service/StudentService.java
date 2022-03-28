package site.whatsblog.service;

import site.whatsblog.pojo.Student;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/25 16:14</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface StudentService {
    /**
     * 根据学生id查询详情
     * @param id
     * @return
     */
    Student findStudentById(Integer id);

    Integer updateStudentById(Student student);
}
