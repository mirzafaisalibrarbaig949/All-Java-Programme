<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>Jsp</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>

<body
	style="background-image: url('/../Img/img.jpg'); background-size: cover; background-attachment: fixed;">
	<div class="container">
		<div class="row">
			<div class="col m10 offset-l1">
				<div class="card" style="border-radius: 30px">
					<div class="card-content">
						<h2  class="center-align">${Header}</h2>
						<p  class="center-align">${Instruction}</p>

						<div class="form center-align">
							<!-- creating form -->
							<form action="processform" method="post" id="myform">
								<input type="text" name="user_name"
									placeholder="Enter User Name" /> <input type="password"
									name="user_password" placeholder="Enter user Password" /> <input
									type="email" name="user_email" placeholder="Enter user email" />
								<br /> <br />
								<button type="submit" class="btn red accent-1">Submit</button>


							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>