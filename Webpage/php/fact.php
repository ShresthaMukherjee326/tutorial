<?php
$f=1;
$var=$_GET["1stno"];
for($i=1;$i<=$var;$i++)
{
    $f=$f*$i;
}
echo "factorial".$f;
?>