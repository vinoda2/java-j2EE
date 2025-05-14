<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Ticket</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        form {
            width: 300px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        label {
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            margin: 5px 0 15px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <h2 style="text-align:center;">Book Your Ticket</h2>

    <form action="save" method="post">
        <label for="ticketId">Ticket ID:</label>
        <input type="number" id="ticketId" name="ticketId" required>

        <label for="pickUp">Pick Up Location:</label>
        <input type="text" id="pickUp" name="pickUp" required>

        <label for="drop">Drop Location:</label>
        <input type="text" id="drop" name="drop" required>

        <label for="noOfPassenger">Number of Passengers:</label>
        <input type="number" id="noOfPassenger" name="noOfPassenger" required>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
