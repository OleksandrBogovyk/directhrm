<?php
  session_start();
  
  ini_set('display_errors', '0');
  error_reporting(E_ALL);
  
  ?>
  
  <?php if(isset($_SESSION['user_ip']) && isset($_SESSION['user_agent'])) : ?>
  
  <?php
  // Include HTML headers
  include('templates/header.php');
  include('templates/menu.php');
  ?>

  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h2 class="page-header"><span class="glyphicon glyphicon-scale"></span> <em>Dashboard<em></h2>
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
  
  // Logout via GET
  if(isset($_GET['do']) && $_GET['do'] == 'logout'){
    $_SESSION['user_ip'] = null;
    $_SESSION['user_agent'] = null;
      unset($_SESSION['user_ip']);
      unset($_SESSION['user_agent']);
      
      header('Location: auth.php');
      }
      
  ?>
  
  <?php else: ?>
  
  <?php
  // REDIRECT TO login.php
  header('Location: auth.php');
  
  endif;
  ?>
