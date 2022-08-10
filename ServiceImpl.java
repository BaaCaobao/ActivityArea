package .service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import .entity.ActivityArea;
import .mapper.ActivityAreaMapper;
import .service.ActivityAreaService;
 /**
 * ;(activity_area)表服务实现类
 * @author : http://www.chiner.pro
 * @date : 2022-8-9
 */
@Service
public class ActivityAreaServiceImpl implements ActivityAreaService{
    @Autowired
    private ActivityAreaMapper activityAreaMapper;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param undefinedId 主键
     * @return 实例对象
     */
    public ActivityArea queryById(String undefinedId){
        return activityAreaMapper.queryById(undefinedId);
    }
    
    /** 
     * 分页查询
     *
     * @param activityArea 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    public Page<ActivityArea> paginQuery(ActivityArea activityArea, PageRequest pageRequest){
        long total = activityAreaMapper.count(activityArea);
        return new PageImpl<>(activityAreaMapper.queryAllByLimit(activityArea, pageRequest), pageRequest, total);
    }
    
    /** 
     * 新增数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    public ActivityArea insert(ActivityArea activityArea){
        activityAreaMapper.insert(activityArea);
        return activityArea;
    }
    
    /** 
     * 更新数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    public ActivityArea update(ActivityArea activityArea){
        activityAreaMapper.update(activityArea);
        return queryById(activityArea.getUndefinedId());
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param undefinedId 主键
     * @return 是否成功
     */
    public boolean deleteById(String undefinedId){
        int total = activityAreaMapper.deleteById(undefinedId);
        return total > 0;
    }
}