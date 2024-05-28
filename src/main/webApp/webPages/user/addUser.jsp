<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
    <link rel="stylesheet" href="../../stylesheet/style.css?ver=2">
</head>
<body>
    <div class="form-container">
        <form id="addUser" action="save" method="post">
            <h2>Add User</h2>
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>