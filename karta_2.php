
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
<?php
$dbconn = pg_connect("host=localhost port=5432 dbname=23778244_0000001 user=23778244_0000001 password=marcin901");
$idPytania=$_POST['id_pytania'];$zmienna=$_POST['odp'];$q = "SELECT content, odpowiedz_1 FROM question WHERE id ='$idPytania'";$result = pg_query($dbconn, $q);$odpowiedz = pg_fetch_result($result, 0, 1); 
$pytanie = pg_fetch_result($result, 0, 0); 
echo $odpowiedz;

if($odpowiedz == $zmienna)
{
	echo '<center><font size = "6"><font color = "green">POPRAWNA ODPOWIEDŹ NA PYTANIE:</br></font></font>';
	echo $pytanie.'</center>';
	
}else{
	echo '<center><font size = "6"><font color = "red">NIEPOPRAWNA ODPOWIEDŹ NA PYTANIE:</font></font></center>';
	echo $pytanie.'</center>';
	}
?>
</body>
</html>





