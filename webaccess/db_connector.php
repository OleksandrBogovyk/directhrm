<?php

class db_connector {
  
  private $host,$user,$password,$dbname;
  private $db_error_message;
  
  public function __construct($host,$user,$password,$dbname){
    $this->host = $host;
    $this->user = $user;
    $this->password = $password;
    $this->dbname = $dbname;
  }
  
  public function is_connection(){
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
      $row_count = mysqli_num_rows($sql);
      if ($row_count != 0) {
        return true;
      } else {
        return false;
      }
  }
  
  public function get_userprofile(){
    //
  }

  
}

?>