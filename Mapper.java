package .mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import .entity.ActivityArea;

 /**
 * ;(activity_area)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2022-8-9
 */
@Mapper
public interface ActivityAreaMapper{
    /** 
     * 通过ID查询单条数据 
     *
     * @param undefinedId 主键
     * @return 实例对象
     */
    ActivityArea queryById(String undefinedId);
    /** 
     * 分页查询指定行数据
     *
     * @param activityArea 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<ActivityArea> queryAllByLimit(ActivityArea activityArea, @Param("pageable") Pageable pageable);
    /** 
     * 统计总行数
     *
     * @param activityArea 查询条件
     * @return 总行数
     */
    long count(ActivityArea activityArea);
    /** 
     * 新增数据
     *
     * @param activityArea 实例对象
     * @return 影响行数
     */
    int insert(ActivityArea activityArea);
    /** 
     * 批量新增数据
     *
     * @param entities List<ActivityArea> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ActivityArea> entities);
    /** 
     * 批量新增或按主键更新数据
     *
     * @param entities List<ActivityArea> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ActivityArea> entities);
    /** 
     * 更新数据
     *
     * @param activityArea 实例对象
     * @return 影响行数
     */
    int update(ActivityArea activityArea);
    /** 
     * 通过主键删除数据
     *
     * @param undefinedId 主键
     * @return 影响行数
     */
    int deleteById(String undefinedId);
}