<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>SignUp</title>
<style>
     .jumbotron{
         background-color: #428bca;
     }
</style>
</head>
<body>
<div class="container">
<div class="jumbotron">
    <div class="row">
		<div class="span12">
			<form class="form-horizontal" action="SignUpServletPath" method="post">
			  <fieldset>
			    <div id="legend">
			      <legend >Please Register First</legend>
			      
			    </div>
			    <div class="control-group">
			      <!-- firstname -->
			          <label for="email" class="required">Email address:</label>
                       <input type="email" class="form-control"  placeholder="Enter your mail here" name="email"  class="required">
			    </div>
			     
			    
			    <div class="control-group">
			      <!-- createPassword-->
			      <label class="control-label" for="createpassword">Create Password</label>
			      <div class="controls">
			        <input type="password" id="createpassword" name="password" placeholder="Create Password" class="input-xlarge">
			      </div>
			    </div>
			    
			  
			   
			   
			    <br>
			    <div class="control-group">
			      <!-- Button -->
			      <div class="controls">
			        <button class="btn btn-success">SignUp</button>
			      </div>
			       </div>
			    </div>
			  </fieldset>
			</form>
		</div>
	</div>
</div>
</div>

</body>
</html>