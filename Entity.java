package .entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


 /**
 *
 * @author : http://www.chiner.pro
 * @date : 2022-8-9
 */
@ApiModel(value = "",description = "")
@Data
public class ActivityArea implements Serializable,Cloneable{
    /** 链接 */
    @ApiModelProperty(name = "链接",notes = "")
    private String link ;

    /** 链接 */
    public String getLink(){
        return this.link;
    }
    /** 链接 */
    public void setLink(String link){
        this.link=link;
    }
}
