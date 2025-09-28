document.getElementById("showTable").onclick = function()
{
    var n = +document.getElementById("tableNum").value;
    var f = +document.getElementById("fromNum").value;
    var t = +document.getElementById("toNum").value;
    var out = "<tr><th>Expression</th><th>Result</th></tr>";
    for (var i = f; i <= t; i++)
    {
        out += "<tr><td>" + n + " × " + i + "</td><td>" + (n * i) + "</td></tr>";
    }
    document.getElementById("output").innerHTML = out;
};