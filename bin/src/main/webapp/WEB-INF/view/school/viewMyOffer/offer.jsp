<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="自校求人応募情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">自校求人応募情報</h2>
 	 	<c:forEach items="${studentOfferList}" var="offer">
 	 	<c:forEach items="${studentList}" var="student">
 	 	<c:if test="${offer.studentId == student.studentId}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		学生氏名: <c:out value="${student.name}" /><br><br>
 	    		性別：<c:out value="${student.sex}" /><br><br>
 	    		誕生日：<c:out value="${student.birthday}" /><br><br>
 	    		電話番号：<c:out value="${student.phoneNumber}" /><br><br>
				メールアドレス：<c:out value="${student.mailAddress}" /><br><br>
 	    		タイトル: <c:out value="${offer.title}" /><br><br>
 	    		内容: <c:out value="${offer.content}" />
 	    	</div>
 	    	</div>
		<br>
		</c:if>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>