<?php
$value1=$_GET["1stno"];
$value2=$_GET["2ndno"];
$value3=$_GET["3rdno"];
if($value1>$value2)
{
    if($value1>$value3)
    {
        echo "1st number is maximum".$value1;
    }
    else
    {
        echo "3rd number is maximum".$value3;
    }
}
else{
    if($value2>$value3)
    {
        echo "2nd number is maximum".$value2;
    }
    else
    {
        echo "3rd number is maximum".$value3;
    }
}
?>
