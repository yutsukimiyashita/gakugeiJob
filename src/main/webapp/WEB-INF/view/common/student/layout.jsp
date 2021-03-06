<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
		<title><tiles:getAsString name="title" /></title>
		<link rel="stylesheet" href="/gakugeiJob/css/bootstrap.min.css">
	</head>
	<body>
	  <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/gakugeiJob/student/home/">GakugeiJob</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="/gakugeiJob/student/home/">Home</a></li>
              <li><a href="/gakugeiJob/student/viewStudent/">MyPage</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">求人情報閲覧<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="/gakugeiJob/student/addEnterpriseOffer/">企業求人情報閲覧</a></li>
                  <li><a href="/gakugeiJob/student/addSchoolOffer/">学校求人情報閲覧</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">応募情報確認<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="/gakugeiJob/student/viewEnterpriseOffer/">企業求人情報</a></li>
                  <li><a href="/gakugeiJob/student/viewSchoolOffer/">学校求人情報</a></li>
                </ul>
              </li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">キニナル〜<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="/gakugeiJob/student/viewEnterpriseFavo/">企業求人情報</a></li>
                  <li><a href="/gakugeiJob/student/viewSchoolFavo/">学校求人情報</a></li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="/gakugeiJob/student/logout/">ログアウト</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="/gakugeiJob/student/editPass/">パスワード変更</a>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

		<div class="app">
		  <tiles:insert attribute="content" />
		  <hr>
		  <footer>
		    <p>&copy; by Group1</p>
		  </footer>
		</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/gakugeiJob/js/jquery.min.js"></script>
    <script src="/gakugeiJob/js/bootstrap.min.js"></script>
	</body>

	<script type='text/javascript'>
		$(function(){
			$('#navbar li a').each(function(){
				var $href = $(this).attr('href');
				if(location.href.match($href)) {
					var $class = $(this).parent().parent().parent().attr('class');
					if($class == "dropdown" ){
						$(this).parent().parent().parent().addClass('active');
					}
					else{
						$(this).parent().addClass('active');
					}
				}
				else {
					$('#navbar li a').removeClass('active');
				}
				if(location.href.match("/gakugeiJob/student/editStudent/") && $href=="/gakugeiJob/student/viewStudent/"){
					$(this).parent().addClass('active');
				}
			});
		});
	</script>
</html>