function taschenrechner() {
    var zahl1 = parseFloat(document.getElementById("zahl1").value);
    var zahl2 = parseFloat(document.getElementById("zahl2").value);
    var operator = document.getElementById("operator").value;
    var ergebnisElement = document.getElementById("ergebnis");

    if (isNaN(zahl1) || isNaN(zahl2)) {
        ergebnisElement.textContent = "Ungültige Eingabe";
        return;
    }
    switch (operator) {
        case "+":
            ergebnisElement.textContent = "Ergebnis: " + (zahl1 + zahl2);
            break;
        case "-":
            ergebnisElement.textContent = "Ergebnis: " + (zahl1 - zahl2);
            break;
        case "*":
            ergebnisElement.textContent = "Ergebnis: " + (zahl1 * zahl2);
            break;
        case "/":
            if (zahl2 !== 0) {
                ergebnisElement.textContent = "Ergebnis: " + (zahl1 / zahl2);
            } else {
                ergebnisElement.textContent = "Division durch Null ist nicht erlaubt";
            }
            break;
        default:
            ergebnisElement.textContent = "Ungültiger Operator";
    }
}