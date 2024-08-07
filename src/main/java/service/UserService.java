package service;


import java.util.List;

import dto.UserDTO;
import dto.UserInterestDTO;

public interface UserService {
	
  // 한 회원 정보 조회
	UserDTO getUserInfo(int userId);
  	
	// userId로 모임 채팅 사용자 별명, 프로필 사진 조회
	UserDTO getChatUserInfoById(int userId);
	
  // 로그인
	UserDTO logInUser(String userEmail, String userPw);
	
	// 로그아웃
	void logOutUser(String userId);
	
	// 회원가입
	boolean signUp(UserDTO dto);
	
	// 회원탈퇴
	void withdrawUser(String userEmail, String userPw);
	
	// 회원정보 수정
	void updateUserInfo(int userId, UserDTO dto);
	
	//해당 email 회원정보 조회
	UserDTO findByUserEmail(String userEmail);
	
	//회원가입 - 내정보설정 모달 회원id 가져오기
	UserDTO getUserId(int userId);
	
	//회원가입 - 내정보설정 모달 별명 가져오기 (별명 중복확인 위함)
	UserDTO getUserNickname(String userNickname);
	
	//마이페이지 - 별명 수정 - 모든 별명 가져오기
	List<String> getAllUserNicknames();
	
	//회원가입 - 내정보설정 모달 회원정보 업데이트
	int signUpProfileUpdate(UserDTO dto);
	
	//회원가입 모달에서 내정보설정 모달로 넘어갈 때 같은 회원인지 이메일로 확인
	String getUserId(String userEmail);
	
	//회원가입 - 내정보설정 모달 회원 관심사 데이터 입력
	int setMyInterest(UserInterestDTO dto);

	//내 정보 수정 - 기존 비밀번호 일치 확인
	String getUserPwById(int userId);

	//내 정보 수정 - 새로운 비밀번호 업데이트
	int modifyUserPw(UserDTO dto);
	
	//회원 탈퇴
	int deleteAccount(int userId);
	
	//마이 페이지 - 내 관심사 수정 전 기존 관심사 삭제
	int deleteUserInterestId(int userId);
}







