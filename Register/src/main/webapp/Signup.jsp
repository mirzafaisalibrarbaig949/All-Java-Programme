<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>Jsp</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>

<body style="
      background-image: url('Img/img.jpg');
      background-size: cover;
      background-attachment: fixed;
    ">
    <div class="container">
        <div class="row">
            <div class="col m6 offset-l3">
                <div class="card" style="border-radius: 30px">
                    <div class="card-content">
                        <h2>Register Here !!</h2>

                        <div class="form center-align">
                            <!-- creating form -->
                            <form action="register" method="post" id="myform">
                                <input type="text" name="user_name" placeholder="Enter User Name" />
                                <input type="text" name="user_password" placeholder="Enter user Password" />
                                <input type="text" name="user_email" placeholder="Enter user email" />
                                <br />
                                <br />
                                <button type="submit" class="btn red accent-1">Submit</button>

                                <div class="loader center-align" style="margin-top: 10px">
                                    <div class="preloader-wrapper small active">
                                        <div class="spinner-layer spinner-green-only">
                                            <div class="circle-clipper left">
                                                <div class="circle"></div>
                                            </div>
                                            <div class="gap-patch">
                                                <div class="circle"></div>
                                            </div>
                                            <div class="circle-clipper right">
                                                <div class="circle"></div>
                                            </div>
                                        </div>
                                    </div>
                                        <h3>Plese Wait......</h3>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function () {
            console.log("Page is ready....");
          $("#myform").on('submit',function(event)){
        	  even.preventDefault();
        	  var f=$(this).seralize();
        	  console.log(f);
        	  
        	  $ajax({
        		  url:"register",
        		  data:f,
        		  type:'POST',
        		  success:function(data,textStatus,jqXHR){
        			  console.log(data);
        			  console.log("Successfully .............");
        			  
        		  },
        		  error:function(jqXHR,textStatus,errorThrown){
        			  console.log(data);
        			  console.log("Error .............");
        		  }
        	  })
          }
            
        })
    </script>
</body>

</html>