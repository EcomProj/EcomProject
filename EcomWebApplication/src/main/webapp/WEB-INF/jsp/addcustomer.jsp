<!DOCTYPE html>
<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 340px;
}
</style>
<body>

<h3>Add Customer</h3>

<div>
<!-- <li><a href="/welcome"><img src="/images/homeicon.jpg" height="50" width="50"></a></li> -->
<!--   <form action="/"> -->
    <label for="fname">Customer no.</label>
    <input type="text" id="fname" name="firstname" placeholder="Enter your customer number....">

    <label for="lname">Customer Name</label>
    <input type="text" id="lname" name="lastname" placeholder="Your last name..">

  <!--  <label for="country">Country</label>
    <select id="country" name="country">
      <option value="australia">Australia</option>
      <option value="canada">Canada</option>
      <option value="usa">USA</option>
    </select>-->
   <label for="lname">Address</label>
    <input type="text" id="addr" name="addr" placeholder="Your last address..">
    
    <input type="submit" value="Submit">
    
    <center><span id=""></span></center>
<!--   </form> -->
</div>



    <!-- App include -->
<script src="ecome_js/util_js/ecom_util.js"></script>
<script src="ecome_js/custom_js/addcustomer.js"></script>
</body>
</html>