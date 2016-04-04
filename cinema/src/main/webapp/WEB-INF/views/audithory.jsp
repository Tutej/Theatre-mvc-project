<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Sala kinowa</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<p>Data: ${titlePanel.showTime} : ${titlePanel.showDate}</p>
				<h1>Tytuł: ${titlePanel.title}</h1>
				<h1>Czas trwania: ${titlePanel.duration}</h1>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${audithory}" var="seat">
				<div class="col-md-1" style="padding: 5px;">
					<div class="thumbnail">
						<c:choose>
							<c:when test='{$seat.isOccupied}"'>
							<div class="alert alert-danger">
								<p>rząd ${seat.row}</p>
								<p>miejsce ${seat.col}</p>
								<p>${seat.isOccupiedString }
							</div>
							</c:when>
							<c:otherwise>
								<div class="caption">
									<p>rząd ${seat.row}</p>
									<p>miejsce ${seat.col}</p>
									<p>${seat.isOccupiedString }
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
