<?php

class db_connector {
  
  private $err_status;
  private $host,$user,$password,$dbname,$port;
  
    
  public function __construct($host,$user,$password,$dbname){
    $this->host = $host;
    $this->user = $user;
    $this->password = $password;
    $this->dbname = $dbname;
  }
  
  public function check_connection(){
    if(!mysqli_connect($host,$user,$password,$dbname)){
      $err_status = mysqli_connect_error();
      return false;
    } else {
      return true;
    }
  }
  
  public function get_userinfo(){
    if($this->check_connection() != false){
      // create user_panel_data.
    } else {
      header('Location: /404');
    }
    
  }
  
  public function get_usertimetable(){
    
  }

  
}

?>