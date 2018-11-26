<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Stok Yönetimi Giriş</title>
<link rel="stylesheet" type="text/css" href="css/custom.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
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
					<form action="LoginController" method="POST">
						<br>
						<h2>Stok Yönetim Giriş</h2>
						<hr id="hr">
						<div class="form-group col-md-10 offset-md-1 col-sm-12 input">
							<input class="form-control" type="text" name="employee_id"
								placeholder="Personel ID " required>
						</div>
						<div class="form-group col-md-10 offset-md-1 col-sm-12 input">
							<input class="form-control" type="password" name="employee_pw"
								placeholder="Şifre" required>
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