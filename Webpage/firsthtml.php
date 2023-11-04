<?php
$value1=$_GET["1stno"];
$value2=$_GET["2ndno"];
if($value1>$value2)
{
    echo "1st number is maximum".$value1;
}
else
{
    echo "2nd no is maximum".$value2;
}
?>