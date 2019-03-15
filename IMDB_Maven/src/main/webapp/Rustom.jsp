<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
 <style>
  div.stars {
  width: 300px;
  display: inline-block;

}
 input.star { display: none; }
 
label.star {

  float: right;
  padding: 10px;
  font-size: 36px;
  color: #444;
  transition: all .2s;
}

input.star:checked ~ label.star:before {
  content: '\f005';
  color: #FD4;
  transition: all .25s;
}

input.star-5:checked ~ label.star:before {
  color: #FE7;
  text-shadow: 0 0 20px #952;
}

 input.star-1:checked ~ label.star:before { color: #F62; } 

/* label.star:hover { transform: rotate(-15deg) scale(1.3); }
 */
label.star:before {
  content: '\f006';
  font-family: FontAwesome;
} 

</style>
<body>
<div class="container">
  <div class="jumbotron">
     <div class = "page-header"><h2>WELCOME</h2></div>
       <div class="row">
             <div class="col-sm-6" style="background-color:lavender;">

            <iframe width="727" height="409" src="https://www.youtube.com/embed/L83qMnbJ198" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
             </div>

 <div class="col-sm-6" style="background-color:lavender;"><h3><b> Movie:Azaan</b></h3>
       <pre><h5><b><p class="text-primary">DERECTOR:</b></p></h5>Prashant Chadha
             <h5><b><p class="text-primary">HERO:</b></p></h5> Sachiin J Joshi
            <h5><b> <p class="text-primary">HEROINE:</b></p></h5>Candice Boucher
             <h5><b> <p class="text-primary">MUSIC DERECTOR:</b></p></h5>Salim–Sulaiman(Indian Composer)
         </pre>
 </div>
 <div>
    <div class="stars">
     
 <form action="RatingServletPath" method="post" name="rating">

    <input class="star star-5" id="star-5" type="radio" name="star"/>

    <label class="star star-5" for="star-5"></label>

    <input class="star star-4" id="star-4" type="radio" name="star"/>

    <label class="star star-4" for="star-4"></label>

    <input class="star star-3" id="star-3" type="radio" name="star"/>

    <label class="star star-3" for="star-3"></label>

    <input class="star star-2" id="star-2" type="radio" name="star"/>

    <label class="star star-2" for="star-2"></label>

    <input class="star star-1" id="star-1" type="radio" name="star"/>

    <label class="star star-1" for="star-1"></label>

  </form>
  </div>
  </div>
  </div>
  </div>
 </div>

 
 
  <p><i><b><u>COMMENT BELOW::</u></b></i></p>
  
  
<div class="container">
  <div class="jumbotron">
     <form action="ValidationPath"  method="post">
       <div class="form-group">
        
        
         <!--   <h3>Comments :</h3>
			    <textarea rows="4" cols="50" name="comment"></textarea>  -->
			    
			    <label for="comment" class="required"><h3>Write  Comment Here</h3></label>
 
 <input type="button"  value="Click Here For Comment" data-toggle="modal" data-target="#myModal">

  
 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
           <div class="form-group">
  <p>Please Login First</p>
<form action="ValidationPath" method="post">
    <label for="email" class="required">Email address:</label>
    <input type="email" class="form-control"  placeholder="Enter your mail here" name="email"  class="required">
    
   <label for="pwd" class="required">Password:</label>
    <input type="password" class="form-control"  placeholder="Enter your password here"  name="password"  class="required">
    <input type ="submit" value="submit">
 </form>
    
 
        </div>
        
          
      
      </div>
 
 
</body>
</html>