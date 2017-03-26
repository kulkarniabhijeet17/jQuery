<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jQuery Grid</title>
		<script src="js/jquery-1.10.0.js" type="text/javascript"></script>
		<!-- <script src="js/grid.locale-fr.js"  type="text/javascript"></script> -->
		<script src="js/grid.locale-en.js" type="text/javascript"></script>
		<script src="js/jquery.jqGrid.js" type="text/javascript"></script>
		<script src="js/jQueryGrid.js" type="text/javascript"></script>

		<!-- <link href="css/jquery-ui-1.8.6.custom.css" rel="stylesheet" type="text/css" /> -->
		<link href="css/ui.jqgrid.css" rel="stylesheet" type="text/css" />
		<!-- <link href="css/ui.multiselect.css" rel="stylesheet" type="text/css" /> -->
		<link href="css/jquery-ui.css" rel="stylesheet" type="text/css" />
		<!-- <link href="css/jquery.ui.theme.css" rel="stylesheet" type="text/css" /> -->
	</head>
	<body onload="fillGridOnEvent();">
		<form>
			<div id="jQGrid" align="left"></div>
		</form>
	</body>
</html>