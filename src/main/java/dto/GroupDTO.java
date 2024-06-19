package dto;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class GroupDTO {
	
	int groupId;
	int groupLeaderId;
	String groupName;
	String groupDetail;
	String groupImage;
	String groupType;
	String groupRegion;
	int groupInterest;
	String groupSignUpType;
	int groupMaximum;

}
