<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<spring:message code = "welcome.message"/> ${name}. You are now authenticated.<a href="/list-todos">Click here</a> to start maintaining your todo's.
</div>

<%@ include file="common/footer.jspf"%>