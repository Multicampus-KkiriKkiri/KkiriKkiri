package dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/*
 * @ToString(exclude ="이름")으로 제외가능?
 * 
 * @Setter는 그 의도가 분명하지 않고 객체를 언제든지 변경할 수 있는 상태가 되어서 객체의 안전성이 보장받기 힘들다.
 * @Getter는 사용하되 최대한 객체가 캡슐화하여 해당 객체가 그 기능을 제공해주는 것이 바람직.
 * @NoArgsConstructor 접근 권한을 최소화 하자
 * */
@Getter
@Setter
@Component
public class GroupDTO {
    private int groupId;
    private int groupLeaderId;
    private String groupName;
    private String groupDetail;
    private String groupImage;
    private String groupType;
    private String groupRegion;
    private int groupInterest;
    private String groupSignUpType;
    private int groupMaximum;
    private String groupSignUpQuestion;
}
