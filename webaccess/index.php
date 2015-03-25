<?php
session_start();

ini_set('display_errors', '0');
error_reporting(E_ALL);

if(isset($_SESSION['user_ip']) && isset($_SESSION['user_agent'])) {
  // show this page
  } else {
  //redirect to login.php
  }

// --- LOGOUT SCHEME ---
//  if(isset($_GET['ac']) && $_GET['ac'] == 'logout'){
//	$_SESSION['user_info'],$_SESSION['user_ip'],$_SESSION['user_agent'] = null;
//	unset($_SESSION['user_info']... etc);
//	}
  
// Include HTML headers
include('templates/header.php');
include('templates/menu.php')
?>

  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h2 class="page-header"><em>Dashboard</em></h2>
      </div>
    </div>
    
    <div class="row">
      <div class="col-md-2">
        
      </div>
      <div class="col-md-4">
            
      </div>
      <div class="col-md-6">
          
      </div>
    </div>
  </div>

<?php

// Include HTML footer
include('templates/footer.php');
?> 
