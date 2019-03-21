var x=5;
document.getElementById("demo").innerHTML=factorial(x);
function factorial(x)
{
    if(x<1)
    {
        return 1;
    }
    else
    return y=x*factorial(x-1);
}