package dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
public class EventDTO {

	private int eventId;
	private int groupId;
	private String eventName;
	private String eventDetail;
	private String eventImage;
	private String eventType;
	private String eventDate;
	private String eventLocation;
	private int eventMaximum;
	private int currentMemberCnt;
	private String groupName;

	// eventDate 타입 변환(String -> LocalDateTime) 메서드
	public LocalDateTime getEventDateAsLocalDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return LocalDateTime.parse(eventDate, formatter);
	}

}
