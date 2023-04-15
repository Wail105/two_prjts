<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>/* Table styles */
	@import url('https://fonts.googleapis.com/css2?family=Satisfy&display=swap');
table {
  width: 100%;
  margin: 20px 0;
  font-size: 10px;
  border:2px solid black;
}

th,
td {
  padding: 10px;
  text-align: left;
}

th {
  background-color: gray;
  font-weight: bold;
}


/* Container styles */
.container {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
}

/* Button styles */
button {
  padding: 10px 20px;
  background-color: gray;
  color: #fff;
  border: none;
  border-radius: 3px;
  font-size: 16px;
  font-weight: bold;
  cursor: pointer;
  transition: all 0.2s ease-in-out;
  margin-right: 10px;
}


/* Table header styles */
th {
  background-color: gray;
  color: #fff;
  font-weight: bold;
}

/* Alternate row styles */
tr:nth-child(even) {
  background-color: green;
}



       
</style>
</head>
<body>
<?php 

echo '<h1>Information générales : </h1>';
echo '<table border=1> 
     <tr><th>Titre</th><td>'.$this->details['Titre'].'</td><tr>
	 <tr><th>Debut</th><td>'.$this->details['DatDebut'].'</td><tr>
	 <tr><th>Fin</th><td>'.$this->details['DateFin'].'</td><tr>
	 <tr><th>Dscription</th><td>'.$this->details['Description'].'</td><tr>
	 </table>';
if(sizeof($this->details['tasks'])){
	echo '<h1>Liste des tâches : </h1>';
	echo '<table border=1><tr><th>Numéro</th><th>Tache</th><th>Début</th><th>Fin</th></tr>';
	$i=1;
	foreach($this->details['tasks'] as $task){
		echo '<tr><td>'.$i++.'</td><td>'.$task['Nom'].'</td><td>'.$task['Debut'].'</td><td>'.$task['Fin'].'</td></tr>';
	}
	echo'</table>';
}
$image='application/views/gantt/projet'.$this->details['Id'].'.jpg';
//echo '<img src="application/views/gantt/projet'.$this->details['Id'].'.jpg">';
?>
<img src="data:image/jpeg;base64,<?php echo base64_encode(file_get_contents('application/views/gantt/projet'.$this->details['Id'].'.jpg')); ?>" alt="Gantt chart">

</body>
</html>
