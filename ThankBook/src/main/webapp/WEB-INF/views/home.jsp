<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="/resources/iindex.css">
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>
        <div id="app">
            {{ message }}
        </div>
        <script src="/resources/index.js"></script>
</body>
</html>
