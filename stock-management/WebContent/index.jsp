<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Stok Yönetimi Giriş</title>
<link rel="stylesheet" type="text/css" href="css/custom.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="UTF-8">
</head>
<body>
	<div class="col-md-12">
		<div class="row">
			<div class="col-md-4 col-sm-2 left">
				<!--Left Side-->
			</div>
			<div class="col-md-4 col-sm-8">
				<div class="col-md-12 col-sm-12 login">
					<form action="LoginController" method="post">
						<br>
						<h2>Can Burak</h2>
						<hr id="hr">
						<div class="form-group col-md-10 offset-md-1 col-sm-12 input">
							<input class="form-control" type="text" name="employee_id"
								placeholder="ID Giriniz">
						</div>
						<div class="form-group col-md-10 offset-md-1 col-sm-12 input">
							<input class="form-control" type="password" name="employee_pw"
								placeholder="Şifre Giriniz">
						</div>
						<div class="col-md-12 submit">
							<input class="btn btn-dark" type="submit" name="login"
								value="Giriş!">
						</div>
					</form>
				</div>
			</div>
			<div class="col-md-4 col-sm-2 right">
				<!---Right Side-->
			</div>
		</div>
	</div>
</body>
</html>