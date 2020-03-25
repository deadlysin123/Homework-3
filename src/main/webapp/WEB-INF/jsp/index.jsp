<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sport Goods</title>
    <style>
        table {
            font-family: "Times New Roman", sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 5px solid black;
            text-align: left;
            padding: 8px;
            background: white;
            text-decoration-color: red;
        }

    </style>
</head>
<body>

<h2>Sport's Equipment</h2>
<table>
    <tr>
        <th style="background: aqua">Description</th>
        <th style="background: aqua">Price</th>
        <th style="background: aqua">Color</th>
    </tr>
    <c:forEach var = "list" items = "${list}">
        <tr>
            <td>${list.description}</td>
            <td>${list.price}</td>
            <td>${list.color}</td>
        </tr>
    </c:forEach>
</table>

<hr/>

</body>
</html>

