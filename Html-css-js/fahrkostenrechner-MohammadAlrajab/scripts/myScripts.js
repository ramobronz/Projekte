function fahrtkostenberechnung() {
    let fahrtstrecke = parseFloat(document.getElementById("fahrtstrecke").value);
    let mietdauer = parseFloat(document.getElementById("mietdauer").value);
    let kilometerkosten, stundenkosten;

    if (document.getElementById("segelboot").checked) {
        kilometerkosten = 0.35;
        stundenkosten = 6.00;
    } else {
        kilometerkosten = 0.50;
        stundenkosten = 8.50;
    }
    let erebnis = document.getElementById("ergebnis")
    if (isNaN(kilometerkosten) || isNaN(mietdauer)) {
        erebnis.textContent = "fühlen Sie bitte alles aus"
    } else {
        let fahrtkosten = (fahrtstrecke * kilometerkosten) + (mietdauer * stundenkosten);
        erebnis.textContent = "Voraussichtliche Fahrtkosten: " + fahrtkosten.toFixed(2) + "Euro"
    }
}