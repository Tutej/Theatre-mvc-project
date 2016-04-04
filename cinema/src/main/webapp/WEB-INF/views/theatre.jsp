<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Kino</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<p>Ale kino</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row">
			<c:forEach items="${theatre}" var="audithorium">
				<div class="col-md-4" style="padding: 5px;">
					<div class="thumbnail">
								<div class="caption">
									<p>Tytuł: ${audithorium.movie.title}</p>
									<p>Godzina: ${audithorium.movie.showTime}</p>
									<p>Data: ${audithorium.movie.showDate}</p>
									<p>Liczba wolnych miejsc: ${audithorium.numberOfEmptySeats}</p>
									<p>Liczba miejsc: ${audithorium.numberOfSeats}</p>
									
								</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
