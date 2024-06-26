<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>일정 참여 취소</title>
<script src="/jquery-3.7.1.min.js"></script>
<script src="/js/groupevent/groupEventAttendCancel.js"></script>
<script>
	var userId = ${userId};
	var groupId = ${groupId};
	var eventId = ${eventId};
</script>
<link rel="stylesheet" type="text/css" href="/css/groupevent/groupEventAttendCancel.css">
</head>
<body>
	<main>
		<section id="eventAttendCancelPageSection">
				<div>
					<h2>일정 참여 취소 전 꼭 확인해주세요!</h2>
				</div>
	            <div id="eventAttendCancelGuideDiv">
	                <ul>
						<li>모임 시작 전 부득이하게 참여가 어려워진 경우, 반드시 모임장에게 미리 알려주시기 바랍니다.</li>
						<li>무단으로 불참하거나, 일정 진행일에 임박하여 취소하는 경우 모임 이용에 대하여 제재를 받을 수 있습니다.</li>
					</ul>
	            </div>
				<div>
					<label for="checkbox">
                    	<input type="checkbox" id="checkbox"> 위 안내사항을 모두 확인했습니다.
                	</label>
				</div>
	            <div id="eventAttendCancelbtnsDiv">
	                <div>
	                	<button id="eventAttendBtn">일정 참여</button>
	                </div>
	                <div>
	                	<button id="eventAttendCancelBtn">참여 취소</button>
	                </div>
	            </div>
		</section>
	</main>
</body>
</html>