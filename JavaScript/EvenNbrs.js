var arr=[1,2,3,4,5,6,8,10,11];
//var arr1;
document.getElementById("demo").innerHTML=onlyEven(arr);
function onlyEven(arr)
{
     result = arr.filter(arr => arr % 2 == 0);
    return result;
}