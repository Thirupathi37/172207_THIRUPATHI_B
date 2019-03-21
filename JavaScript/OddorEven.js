var x=13;
document.getElementById("demo").innerHTML=findNumber(x);

function findNumber(x)
{
    if(x%2==0)
    {
        return "Even";
    }
    else{
        return "odd";
    }
}