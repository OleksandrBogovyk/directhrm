<?php
session_start();

require_once('db_config.php');
require_once('db_connector.php');

include('templates/header.php');

// Debug options //
//ini_set('display_errors', '1');
//error_reporting(E_ALL);


// 
if(!isset($_POST['login']) && !isset($_POST['password'])){
    $login = htmlspecialchars($_POST['login']);
    $password = htmlspecialchars($_POST['password']);
  
  $obj_db = new db_connector(DB_HOST,DB_USER,DB_PASS,DB_NAME);
      if($obj_db->is_connection() == true) {
          $error_message = '';
          
    // CHECK USER IN DB => ...
    //$sql = "SELECT * FROM ".$SETTINGS["USERS"]." WHERE `email` = '".mysql_real_escape_string($_POST['email'])."' AND `password` = '".mysql_real_escape_string($_POST['password'])."'";
    //	$sql_result = mysql_query ($sql, $connection ) or die ('request "Could not execute SQL query" '.$sql);
    //	$user = mysql_fetch_assoc($sql_result);
    //	if(!empty($user)){
            
    //header("Location: http://127.0.0.1/webaccess/auth.php");  
        //} else {
          //echo "Error connect to DB";
          //header("Location: http://127.0.0.1/webaccess/auth.php"); #.$_SERVER['PHP_SELF']
          //header('Location: '.$_SERVER['PHP_SELF'].'');
       // }
          
          
      } else {
          $error_message = '<div class="alert alert-warning" role="alert">';
          $error_message .= 'Ошибка соединения с базой данных.';
          $error_message .= '</div>';
            }
  } else {
        $error_message = '<div class="alert alert-warning" role="alert">';
        $error_message .= 'Введите данные для авторизации.';
        $error_message .= '</div>';
  }
        
    // THEN SECURE YOUR SESSION //
    
    // $user_ip = md5($_SERVER['REMOTE_ADDR'].'salt');
    // $user_agent = md5($_SERVER['HTTP_USER_AGENT'].'salt');
    
    // then redirect with SESSION DATA => index.php


?>
    
    <div class="container">
        <div class="row">
            <!-- <?php //echo $login.'<br>'.$password; ?> -->
            <div class="col-md-offset-4 col-md-4">
                <div class="panel panel-default login-panel">
                  <?php echo $error_message; ?>
                        <div class="panel-heading"><span class="glyphicon glyphicon-eye-close"></span> Авторизация</div>
                    <div class="panel-body">
                        <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
                            <div class="form-group">
                                <label class="label-text">Имя пользователя</label>
                                <input type="text" class="form-control" name="login" id="login" placeholder="" pattern="^[A-Za-zА-Яа-яЁё\.\0-9]+$" title="Аа-Яя {0-9}" maxlenght="15" required="required">
                            </div>
                            <div class="form-group">
                                <label class="label-text">Пароль</label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="" required="required">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"> Запомнить меня
                                </label>
                            </div>
                            <button type="submit" name="submit" class="btn btn-primary"><em>Войти</em></button>
                            <button type="reset" class="btn btn-link">Очистить</button>
                        </form>
                    </div>
                </div>
                <hr>
                <center>Copyright(c) 2014-2015 <em><a href="https://github.com/orgs/Softuse/" target="_blank">Softuse HRMS</a></em> Dashboard<br>Версия 1.09.1</center>
            </div>
        </div>
    </div>

<?php include('templates/footer.php'); ?>
