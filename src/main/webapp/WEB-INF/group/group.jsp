
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/tld/capmkt.tld" prefix="capmkt"%>
<%@ page session="false" errorPage="error.jsp"%>

<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<c:url var="addAction" value="/group/add"></c:url>
<form:form action="${addAction}" method="post" commandName="group">
	
	<div class="container-fluid" id="container">
		<div class="form-group">
			<spring:message code="label.menu.groups.search.groupname" />
			<input class="form-control" id="grpname" placeholder="group name">
		</div>
		<div class="form-group">
			<spring:message code="label.menu.groups.search.groupdesc" />
			<input class="form-control" id="grpdesc"
				placeholder="group description">
		</div>
		<div class="form-group">
			<spring:message code="label.menu.groups.search.groupcreateddt" />
			<input class="form-control" id="grpcreationdt"
				placeholder="creation date">
		</div>
	</div>
</form:form>
<br>
<div class="panel panel-default" id="panel_groupTable">
	<div class="panel-heading">
		<h4 class="panel-title">
			<a data-toggle="collapse" data-target="#groups"
				href="#groups" class="collapsed"><spring:message code="label.group.list"></spring:message> </a>
		</h4>
	</div>
	<div id="groups" class="panel-collapse collapse">
		<c:if test="${!empty listGroups}">
			<table class="table table-striped table-bordered" id="groupTable">
			<thead>
				<tr>
					<th width="120">Group Name</th>
					<th width="120">Group Description</th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listGroups}" var="group">
					<tr>
						<td class="contextMenu"><a href="<c:url value='/group/${group.groupId}/detail' />" >${group.groupName}</a></td>
						<td>${group.groupdesc}</td>
						<td><a href="<c:url value='/group/createeditgroup/${group.groupId}' />" >Edit</a></td>
						<td><a href="<c:url value='/group/remove/${group.groupId}' />" >Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
			</table>
		</c:if>
		<c:if test="${empty listGroups}">
			<capmkt:nodatafound/>
		</c:if>
	</div>
</div>

<!-- Context Menu Start-->
	<ul id="contextMenu" class="dropdown-menu" role="menu" style="display:none" >
	    <li><a tabindex="-1" href= "<c:url value='/group/55/detail' />">Action</a></li>
	    <li><a tabindex="-1" href="#">Another action</a></li>
	    <li><a tabindex="-1" href="#">Something else here</a></li>
	    <li class="divider"></li>
	    <li><a tabindex="-1" href="#">Separated link</a></li>
	</ul>
<!-- Context Menu End  -->