package dao;

import java.util.ArrayList;
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

}
