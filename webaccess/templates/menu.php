<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
        <span class="sr-only">Toggle</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<?php echo $_SERVER['PHP_SELF']; ?>">
          <img class="img-circle" alt="Softuse HRMS" src="img/menu-img.png" height="42" width="42">
      </a>
    </div>
    
    <div class="collapse navbar-collapse" id="navbar-collapse">
        <ul class="nav navbar-nav navbar-right">
          
          <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="">
            </div>
            <button type="submit" class="btn btn-primary"><em>Поиск</em></button>
          </form>
              
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-info-sign"></span> <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="#">Action</a></li>
              <li class="divider"></li>
              <li><a href="#">One more separated link</a></li>
            </ul>
          </li>
              
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-user"></span> <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="#">Вы вошли как: <em>Администратор</em></a></li>
              <li class="divider"></li>
              <li><a href="#">Выйти</a></li>
            </ul>
          </li>
          
        </ul>
        
    </div>
  </div>
</nav>
