package .service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import .entity.ActivityArea;
//8.11 9.43

 /**
 * ;(activity_area)表服务接口
 * @author : http://www.chiner.pro
 * @date : 2022-8-9
 */
public interface ActivityAreaService{
    /** 
     * 通过ID查询单条数据 
     *
     * @param undefinedId 主键
     * @return 实例对象
     */
    ActivityArea queryById(String undefinedId);
    /** 
     * 分页查询
     *
     * @param activityArea 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<ActivityArea> paginQuery(ActivityArea activityArea, PageRequest pageRequest);
    /** 
     * 新增数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    ActivityArea insert(ActivityArea activityArea);
    /** 
     * 更新数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    ActivityArea update(ActivityArea activityArea);
    /** 
     * 通过主键删除数据
     *
     * @param undefinedId 主键
     * @return 是否成功
     */
    boolean deleteById(String undefinedId);
}
