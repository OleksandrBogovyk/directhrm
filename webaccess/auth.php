<?php
ini_set('display_errors', '0');
error_reporting(E_ALL);

?>


<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">

<?php

// --- Check login credentials ---

//  $error = '';
//	if(isset($_POST['is_login'])){
//		$sql = "SELECT * FROM ".$SETTINGS["USERS"]." WHERE `email` = '".mysql_real_escape_string($_POST['email'])."' AND `password` = '".mysql_real_escape_string($_POST['password'])."'";
//		$sql_result = mysql_query ($sql, $connection ) or die ('request "Could not execute SQL query" '.$sql);
//		$user = mysql_fetch_assoc($sql_result);
//		if(!empty($user)){
//			$_SESSION['user_info'] = $user;
//			$query = " UPDATE ".$SETTINGS["USERS"]." SET last_login = NOW() WHERE id=".$user['id'];
//			mysql_query ($query, $connection ) or die ('request "Could not execute SQL query" '.$query);
//		}
//		else{
//			$error = 'Wrong email or password.';
//		}
//	}

// THEN SECURE YOUR SESSION //

// $user_ip = md5($_SERVER['REMOTE_ADDR'].'salt');
// $user_agent = md5($_SERVER['HTTP_USER_AGENT'].'salt');

// then redirect with SESSION DATA => index.php

?>