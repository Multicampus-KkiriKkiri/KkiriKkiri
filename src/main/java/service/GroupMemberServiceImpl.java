package service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GroupMemberDAO;
import dto.UserDTO;

@Service
public class GroupMemberServiceImpl implements GroupMemberService {

	@Autowired
	GroupMemberDAO dao;
	
	@Override
	public int addMemberToGroup(HashMap map) {
		return dao.addMemberToGroup(map);
	}
	
	@Override
	public int updateMemberToGroup(HashMap map) {
		return dao.updateMemberToGroup(map);
	}
	
	@Override
	public int getMemberCountInGroup(int groupId) {
		// group_member 테이블의 각 group별 모임원 수 + 모임장(1명) = 각 group 총 인원
		return dao.getMemberCountInGroup(groupId) + 1;
	}

	@Override
	public List<UserDTO> getGroupMemberList(int groupId) {
		return dao.getGroupMemberList(groupId);
	}

	@Override
	public String checkMemberStatusInGroup(HashMap map) {
		return dao.checkMemberStatusInGroup(map);
	}

	@Override
	public String checkUserHistoryInGroup(HashMap map) {
		return dao.checkUserHistoryInGroup(map);
	}

	// 메인페이지 로그인 후 내 모임 정보 가져오기 위해 groupId 받아오기 
	@Override
	public List<Integer> getMyGroupIdList(int userId) {
		return dao.getMyGroupIdList(userId);
	}

	//마이페이지 - 신청대기 모임 가져오기 위해 groupId 받아오기
	@Override
	public List<Integer> getMyPendingGroupIdList(int userId) {
		return dao.getMyPendingGroupIdList(userId);
	}
	
	

}









