package site.whatsblog.service;

import site.whatsblog.pojo.Student;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 14:39</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface StudentService {
    Student queryStudentById(Integer id);

    Integer queryAllStudentCount();
}
