<?php

$conn=mysqli_connect("localhost", "root", "mysql", "student");

if (mysqli_connect_errno())
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }


