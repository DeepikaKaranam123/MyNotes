<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook:Index</title>
<%@include file="all_Component/allCss.jsp" %>
<style type="text/css">
.back-img{
background:url("img/Books.png");
height:100vh;
width:100%;
background-repeat:no-repeat;
background-size:cover;
}
.crd-ho:hover{
background-color:#fcf7f7;
}

</style>
</head>
<body style="background-color:#f7f7f7;">
 <%@include file="all_Component/navbar.jsp" %>
 <div class="container-fluid back-img">
 <h2 class="text-center text-danger" >Ebook Management System</h2>
 </div>

 
<!-- Start Recent Book -->
<div class="container" >
	<h3 class="text-center">Recent Book</h3>
		<div class="row">
		<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/java.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>Java Programming</b></p>
			<p>BalaGuru Swami</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2"> <i class="fa-solid fa-cart-shopping"></i> Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">299</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/C.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>C Programming</b></p>
			<p>Narayan Murthy</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">400</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/story.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>Arabian Nights</b></p>
			<p>JK Rowling</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">150</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/thriller.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>The Half Death</b></p>
			<p>Christopher</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">500</a>
			
			</div>	
		</div>
	</div>
	</div>
	
	
	</div>
	<br><br>
	<div class="text-center mt-1">
	<a href="" class="btn btn-danger btn-sm text-white"> View All</a>
	</div>
</div>

<!-- End Recent Book -->

<hr>

<!-- Start New Book -->
<div class="container" >
	<h3 class="text-center">New Book</h3>
		<div class="row">
		<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/Python.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>Python</b></p>
			<p>Guido Van Rossum</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">350</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/SF2.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>The Calculating Stars</b></p>
			<p>Johns</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">100</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/SF.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>The Astral Surge</b></p>
			<p>Nirmal</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">600</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/sql.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>The SQL</b></p>
			<p>Ryan Turner</p>
			<p>Categories: New</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">350</a>
			
			</div>	
		</div>
	</div>
	</div>
	
	
	</div>
	<br><br>
	<div class="text-center mt-1">
	<a href="" class="btn btn-danger btn-sm text-white"> View All</a>
	</div>
</div>

<!-- End New Book -->

<hr>
<!-- Start Old Book -->
<div class="container" >
	<h3 class="text-center">Old Book</h3>
		<div class="row">
		<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/myth.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>The Mortal Vishnu</b></p>
			<p>Antar Anthreya</p>
			<p>Categories: old</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">200</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/kalam.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>Life of Kalam</b></p>
			<p>Arun Tiwari</p>
			<p>Categories: old</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">300</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/hp.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>Harry Potter</b></p>
			<p>JK Rowling</p>
			<p>Categories: old</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">900</a>
			
			</div>	
		</div>
	</div>
	</div>
	<div class="col-md-3">
		<div class="card crd-ho">
		<div class="card-body text-center">
			<img alt="" src="book/ww.jpg" style:"width:150px;height:200px"
			class="img-thumblin">
			<br><br>
			<p><b>World War 2</b></p>
			<p>Hitler</p>
			<p>Categories: old</p>
			<div class="row">
			<a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
			<a href="" class="btn btn-success btn-sm ml-1">View Details</a>
			<a href="" class="btn btn-danger btn-sm ml-1">700</a>
			
			</div>	
		</div>
	</div>
	</div>
	
	
	</div>
	<br><br>
	<div class="text-center mt-1">
	<a href="" class="btn btn-danger btn-sm text-white"> View All</a>
	</div>
</div>

<!-- End Old Book -->

</body>
</html>