package chat;

public class ChatMessage {
    private String chatRoomId;
    private String message;
    private String type;
    private String userId;
    private String chatTime;
    private String profileImage;
    private String chatUserNickname;
    
	public String getChatRoomId() {
		return chatRoomId;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getType() {
		return type;
	}
	
	public String getUserId() {
        return userId;
    }
	
	public String getChatTime() {
        return chatTime;
    }
	
	public String getProfileImage() {
        return profileImage;
    }
	
	public String getChatUserNickname() {
        return chatUserNickname;
    }
     
}