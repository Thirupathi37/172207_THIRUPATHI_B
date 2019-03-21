var str="thirupathi";
document.getElementById("demo").innerHTML=alphabetOrder(str);
function alphabetOrder(str)
{
    return str
          .split("")
          .sort()
          .join("");
        
}