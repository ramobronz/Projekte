function berechnung() {
    let summe = 0;
    let notenanzahl = 0;
    let vorname = document.getElementById("vorname").value
    let nachname = document.getElementById("nachname").value
    for (let i = 1; i <= 4; i++) {
        let rechnung = document.getElementById("note" + i)
        let note = parseFloat(rechnung.value)
        if (note > 6) {
            return;
        }
        if (!isNaN(note)) {
            summe += note
            notenanzahl++
        }
    }
    let ergebnis = document.getElementById("ergebnis")
    if (notenanzahl > 0) {
        let durchschnitt = summe / notenanzahl
        ergebnis.textContent = vorname + " " + nachname + " Ihre Durchschnitt Beträgt: " + durchschnitt.toFixed(2)
    } else {
        ergebnis.textContent = "Keine Angaben"
    }
    event.preventDefault();
}