<?php

class db_connector {
  
  protected static $DB_HOST = 'localhost';
  define('DB_USER','root');
  define('DB_PASS','*****');
  define('DB_NAME','hrms');
  
  private $host,$user,$password,$dbname;
  private $db_error_message;
  
  public function __construct($host,$user,$password,$dbname){
    $this->host = $host;
    $this->user = $user;
    $this->password = $password;
    $this->dbname = $dbname;
  }
  
  public function is_connectied(){
    if(mysqli_connect($this->host,$this->user,$this->password,$this->dbname)){
      return true;
    mysqli_close();
    } else {
      $this->db_error_message = mysqli_connect_error();
      return $this->db_error_message;
    mysqli_close();
    }
  }
 
  public function is_logintrue($login, $password){
    $mysqli = new mysqli($this->host,$this->user,$this->password,$this->dbname);
    $sql = $mysqli->query('select login, password from '.$this->dbname.'.webaccess where login = '.$login.' and password = '.$password.';');
      $row_count = $sql->num_rows;
      if ($row_count != 0) {
        return true;
      $sql->close();
      } else {
        return false;
      }
      $sql->close();
    $mysqli->close();  
  }
  
  public function get_userprofile(){
    //
  }

  
}

?>
