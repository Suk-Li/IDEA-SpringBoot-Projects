package site.whatsblog.service;

import site.whatsblog.pojo.Student;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/28 11:41</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface StudentService {
    Student queryStudentById(Integer id);
}
