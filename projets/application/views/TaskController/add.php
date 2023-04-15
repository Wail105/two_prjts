<html>
	<head>
	<style>
			body {
				background-color: white;
			}
			form {
				background-color: gray;
				border: 1px solid black;
				padding: 20px;
				margin: 20px auto;
				max-width: 500px;
			}
			form label {
				display: block;
				margin-bottom: 5px;
				font-weight: bold;
			}
			form input[type="text"],
			form input[type="date"],
			form textarea {
				width: 100%;
				padding: 8px;
				border: 1px solid #ccc;
				border-radius: 4px;
				box-sizing: border-box;
				margin-bottom: 10px;
				font-size: 16px;
			}
			form button[type="submit"],
			form button[type="reset"] {
				background-color: green;
				color: #fff;
				border: none;
				padding: 10px 20px;
				margin-top: 10px;
				font-size: 16px;
				border-radius: 2px;
			}

        

        h1 {
            text-align:center;
        }

		</style>
	</head>
	<body>
		<center><h1>Ajout d'une tache</h1></center>
		<form action="TaskController/add" method="post" >
		<input type="hidden" name="projetID" value=" <?php echo $this->projetId; ?>">
		<label> Nom</label>
		<input type="text" name="nom"><br>
		<label> Date Début </label>
		<input type="text" name="debut"><br>
		<label> Date Fin </label>
		<input type="text" name="fin"><br>
		
		<button type="submit" >Envoyer</button>
		<button type="reset" >Effacer</button>
		</form>
	</body>

</html>