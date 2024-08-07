<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>${ groupDTO.groupName }</title>
<script src="/jquery-3.7.1.min.js"></script>
<script src="/js/groupdetail/groupJoin.js"></script>
<script src="/js/groupdetail/groupDetail.js"></script>
<script>
	var groupId = ${groupDTO.groupId};
	var userId = ${userId};
	var profileImage = "${profileImage}";
	var groupSignUpType = "${groupDTO.groupSignUpType}";
	var groupMemberCnt = ${groupMemberCnt};
	var groupMaximumMemberCnt = ${groupDTO.groupMaximum};
</script>
<link rel="stylesheet" type="text/css" href="/css/groupdetail/groupDetail.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
	<!-- header -->
	<c:choose>
	    <c:when test="${userId == 0}">
	        <jsp:include page="../mainpage/mainHeader.jsp" />
	    </c:when>
	    <c:otherwise>
	        <jsp:include page="../mainpage/mainHeaderLogin.jsp" />
	    </c:otherwise>
	</c:choose>
	
	<!-- main -->
	<main id="groupDetailMain">
		<section id="groupHeaderSection">
			<div id="groupImgDiv">
				<img id="groupImg" src="${groupDTO.groupImage}" alt="${groupDTO.groupName}">
			</div>
			<div id="groupDetailDiv">
				<div>${groupDTO.groupName}</div>
				<div>${category}</div>
				<div>${regionMap.groupRegion} - ${regionMap.groupDistrict}</div>
				<div>${groupMemberCnt}/${groupDTO.groupMaximum}</div>
				<div>${groupDTO.groupType}</div>
				<div>${groupDTO.groupSignUpType}</div>
			</div>
		</section>
		<section id="groupNavSection">
			<nav class="groupDetailNav" id="groupTapNav">
				<button class="tapBtn" value="info" >모임 상세</button>
				<button class="tapBtn" value="event">모임 일정</button>
				<button class="tapBtn" value="photo">모임 사진</button>
				<button class="tapBtn" value="chat" id="chatBtn">모임 채팅</button>
			</nav>
			<nav class="groupDetailNav" id="groupOptionNav">
				<button id="groupShareBtn">공유</button>
				<button id="groupWishBtn" value=""></button>
				<button id="groupOptionBtn" value=""></button>
			</nav>
		</section>
		<section id="groupTapPageSection">
			<%@ include file="../groupdetail/groupDetailInfo.jsp" %>
		</section>
	</main>
	
	<!-- footer -->
	<footer id="groupDetailFooter">
		<jsp:include page="../mainpage/mainFooter.jsp" />
	</footer>
</body>
</html>