<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="自社求人応募情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">自社求人応募情報</h2>
 	 	<c:forEach items="${studentOfferList}" var="offer">
 	 	<c:forEach items="${studentList}" var="student">
 	 	<c:if test="${offer.studentId == student.studentId}">
 	 	<div class="panel panel-primary">
 	    	<div class="panel-heading">
 	    		学生氏名: <c:out value="${student.name}" /><br>
			<c:choose>
			<c:when test="${student.sex == 0}" >
						性別：　男性<br>
			</c:when>
			<c:when test="${student.sex == 1}" >
						性別：　女性<br>
			</c:when>
			<c:otherwise>
			            性別：　<br>
			</c:otherwise>
			</c:choose> 
						誕生日      ：　<c:out value="${birthday}" /><br>
						住所        : <c:out value="${student.address}" /><br>
						電話番号     : <c:out value="${student.phoneNumber}" /><br>
						メールアドレス：　<c:out value="${student.mailAddress}" />
						</div>
						<div class="panel-body">
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