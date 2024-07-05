package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.DistrictDTO;
import dto.GroupDTO;
import dto.RegionDTO;
import dto.UserDTO;

@Repository
public class GroupDAO {
	
	@Autowired
	SqlSession session;

	public GroupDTO getGroupDetail(int groupId) {
		return session.selectOne("getGroupDetail", groupId);
	}

	public ArrayList<UserDTO> getGroupMemberList(int groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addMemberToGroup(int userId, int groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int removeMemberFromGroup(int userId, int groupId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addGroupToWishlist(int userId, int groupId) {
		// TODO Auto-generated method stub
		return 0;
	}
	//지역 불러오기, 광역시
	public List<RegionDTO> getAllRegions() {
		return session.selectList("getAllRegions");
	 }
	//지역 불러오기 ,구
	public List<DistrictDTO> getDistrictsByRegionId(int regionId) {
		return session.selectList("getDistrictsByRegionId", regionId);
	}
	
	public int saveGroup(GroupDTO groupDTO) {
		session.insert("group-mapping.saveGroup", groupDTO);
		return groupDTO.getGroupId(); // 등록된 그룹의 ID 반환
		}
	
    public GroupDTO findGroupById(int groupId) {
        return session.selectOne("group-mapping.findGroupById", groupId);
    }
    
    //메인페이지 로그인 후 내 모임 정보 가져오기 - 지역정보
    public List<String> getRegionName(int regionId){
    	return session.selectList("getRegionName", regionId);
    }
    
    public List<String> getDistrictName(int districtId){
    	return session.selectList("getDistrictName", districtId);
    }
    
    //메인페이지 관심사별 그룹 내용 가져오기
    public ArrayList<HashMap<String, Object>> getGroupDetailsByInterestId(int interestId){
    	List<Object> resultList = session.selectList("getGroupDetailsByInterestId", interestId);
    	ArrayList<HashMap<String, Object>> groupDetailsByInterest = new ArrayList<>();
    	
    	for (Object result : resultList) {
    		if(result instanceof HashMap) {
    			groupDetailsByInterest.add((HashMap<String, Object>) result);
    		}
    	}
    	return groupDetailsByInterest;
    }
    
    //메인페이지 로그인전 신상 그룹 가져오기
    public List<GroupDTO> getNewestGroupDetails(){
    	return session.selectList("getNewestGroupDetails");
    }

}









