<?php

class db_connector {
  
  private $host,$user,$password,$dbname;
    
  public function __construct($host,$user,$password,$dbname){
    $this->host = $host;
    $this->user = $user;
    $this->password = $password;
    $this->dbname = $dbname;
  }
  
  public function is_connection(){
    if( mysqli_connect($this->host,$this->user,$this->password,$this->dbname) ){
      return true;
    } else {
      return mysqli_connect_error();
    }
  }
  
  public function is_user(){
    mysqli_connect($this->host,$this->user,$this->password,$this->dbname) or die("Error ".mysqli_connect_error());
    //
  }
  
  
  public function get_userprofile(){
    //
  }

  
}

?>