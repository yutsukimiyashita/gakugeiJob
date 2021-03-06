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
            <a class="navbar-brand" href="/gakugeiJob/school/home/">GakugeiJob</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav" id="nav">
              <li><a href="/gakugeiJob/school/home/">Home</a></li>
              <li><a href="/gakugeiJob/school/viewSchool/">Mypage</a></li>
              <li><a href="/gakugeiJob/school/addOffer/">求人登録</a></li>
              <li><a href="/gakugeiJob/school/viewMyOffer/">自校求人閲覧</a></li>
              <li class=><a href="/gakugeiJob/school/viewOtherOffer/">他校求人閲覧機能</a></li>
             </ul>

            <ul class="nav navbar-nav navbar-right">
              <li><a href="/gakugeiJob/school/logout/">ログアウト</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="/gakugeiJob/school/editPass/">パスワード変更</a></li>
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
					$(this).parent().addClass('active');
				}
				else {
					$('#navbar li a').removeClass('active');
				}
				if(location.href.match("/gakugeiJob/school/editSchool/") && $href=="/gakugeiJob/school/viewSchool/"){
					$(this).parent().addClass('active');
				}
				if(location.href.match("/gakugeiJob/school/editOffer/") && $href=="/gakugeiJob/school/viewMyOffer/"){
					$(this).parent().addClass('active');
				}
			});
		});
	</script>
</html>