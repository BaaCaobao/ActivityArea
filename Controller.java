package .controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import .entity.ActivityArea;
import .service.ActivityAreaService;

 /**
 * ;(activity_area)表控制层
 * @author : http://www.chiner.pro
 * @date : 2022-8-9
 */
@Api(tags = "对象功能接口")
@RestController
@RequestMapping("/activityArea")
public class ActivityAreaController{
    @Autowired
    private ActivityAreaService activityAreaService;
    
    /** 
     * 通过ID查询单条数据 
     *
     * @param undefinedId 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{undefinedid}")
    public ResponseEntity<ActivityArea> queryById(String undefinedId){
        return ResponseEntity.ok(activityAreaService.queryById(undefinedId));
    }
    
    /** 
     * 分页查询
     *
     * @param activityArea 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<Page<ActivityArea>> paginQuery(ActivityArea activityArea, PageRequest pageRequest){
        return ResponseEntity.ok(activityAreaService.paginQuery(activityArea, pageRequest));
    }
    
    /** 
     * 新增数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<ActivityArea> add(ActivityArea activityArea){
        return ResponseEntity.ok(activityAreaService.insert(activityArea));
    }
    
    /** 
     * 更新数据
     *
     * @param activityArea 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<ActivityArea> edit(ActivityArea activityArea){
        return ResponseEntity.ok(activityAreaService.update(activityArea));
    }
    
    /** 
     * 通过主键删除数据
     *
     * @param undefinedId 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String undefinedId){
        return ResponseEntity.ok(activityAreaService.deleteById(undefinedId));
    }
}