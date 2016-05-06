<%@page import="ecom.model.product.features.Speaker"%>
<%@page import="ecom.model.product.features._LaptopFeatures"%>
<%@page import="ecom.common.FrequentUse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ecom.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta http-equiv="Expires" content="Mon, 26 Jul 1997 05:00:00 GMT">
<meta http-equiv="Pragma" content="no-cache"> -->
<title>Speaker Edit Page</title>
<script type="text/javascript" src="<%=FrequentUse.jQuery %>"></script>
<script type="text/javascript" src="js_Seller/CommonForEditPages.js"></script>
<script type="text/javascript" src="js_Seller/EditProductFeatures.js"></script>
<script type="text/javascript" src="js_Seller/Product_Add.js"></script>
<link type="text/css" href="css/bootstrap.css" rel="stylesheet">

<style type="text/css">

.row{
    margin-left:0px !important;
    margin-right:0px !important;
    margin-bottom: 16px;
}
label{
font-weight: normal !important; 
color:#337AB7;
}
hr {
 
    border-top: 1px solid #eee;
    margin-top:4px;
    margin-bottom: 4px;
}
.key_feature{
padding: 0px;
margin: 0px;
}
.key_feature li{
    font-size: 11px;
    color: #777;
    margin-left: 14px;

}
</style>

</head>
<body>

<%
	Speaker speaker = (Speaker) request.getAttribute("speaker");
%>

<%@ include file="../BasicFeatures.jsp" %>

<section id="2">	
	
	<div id="invisible" style="display:none;">
		<div id="advanceFeatures" style="width:100%;">
			<form method="post" enctype="multipart/form-data" id="form19"> 
				<input type="hidden" name="productId" value="<%=productId%>" />
				<input type="hidden" name="sellerId" value="<%=sellerId%>" />
				<h3>Advance Features</h3>
					<div class="row">					
						<div class="col-md-3 col-sm-6 col-xs-12">
						<label>Sub-Woofer </label>
							</div>
							<% if (speaker == null) { %>
							<div class="col-md-3 col-sm-6 col-xs-12">
							<input type="text" name="subWoofer" class="form-control" required placeholder="1" /></div>
							<% } else { %>
							<div class="col-md-3 col-sm-6 col-xs-12">
							<input type="text" name="subWoofer" class="form-control" required value="<%=speaker.getSubWoofer() %>" />
							</div>
							<% } %>

						<div class="col-md-3 col-sm-6 col-xs-12">
						<label> Power Output </label>
						</div>
							<% if (speaker == null) { %>
							<div class="col-md-3 col-sm-6 col-xs-12">
							<input type="text" name="powerOutput" class="form-control" required placeholder="60W" />
							</div>
							<% } else { %>
							<div class="col-md-3 col-sm-6 col-xs-12">
							<input type="text" name="powerOutput" class="form-control" required value="<%=speaker.getPowerOutput() %>" />
							</div>
							<% } %>							
					      </div>
					
					
						
						
					<div class="row">
						<div class="col-md-3 col-sm-6 col-xs-12"> 
						<label>	Demo </label>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12"> 
							<input type="text" class="form-control" name="salePrice" readonly="readonly" required value="" />
							</div>					
					
					
						<div class="col-md-3 col-sm-6 col-xs-12"> 
						<label>	Demo</label>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12"> 
							<input type="text" class="form-control" name="salePrice" readonly="readonly" required value="" />
							</div>
				
						</div>		
						<div class="row">
						<div class="col-md-3 col-sm-6 col-xs-12"> 
						<label>	Demo</label>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12"> 
							<input type="text" class="form-control" name="salePrice" readonly="readonly" required value="" />
							</div>					
					
					
						<div class="col-md-3 col-sm-6 col-xs-12"> 
						<label>	Demo </label>
						</div>
						<div class="col-md-3 col-sm-6 col-xs-12"> 
							<input type="text" class="form-control" name="salePrice" readonly="readonly" required value="" />
							</div>
				
						</div>				
					
						<div class="row">
						<div class="col-md-12 col-sm-6 col-xs-12">
							<input type="submit" value="Submit" style=" padding: 7px 14px;background:linear-gradient(#54b4eb, #2fa4e7 60%, #1d9ce5);border: 1px solid #0098fe;color:#ffffff; float: right;" />
							</div>
							</div>
					
			</form>
	
        
		</div>
	</div>	

</section>

</body>
</html>