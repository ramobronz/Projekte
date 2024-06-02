function jawakerkomplex() {
    let konig = 75
    let queen = 25
    let latsch = 15
    let diamonds = 10

    let konigeingabe = parseFloat(document.getElementById("konig").value)
    let queeneingabe = parseFloat(document.getElementById("queen").value)
    let latscheingabe = parseFloat(document.getElementById("latsch").value)
    let diamondseingabe = parseFloat(document.getElementById("diamonds").value)

    let konigCheckbox = document.getElementById("konigCheckbox");
    let queenCheckbox = document.getElementById("queenCheckbox")
    if (konigCheckbox.checked) {
        konig = 150;
    }
    if (queenCheckbox.checked){
        queen = 50
    }
    if (konigeingabe > 1) {
        alert("Fehler: Der Wert für König darf nicht größer als 1 sein.");
        return;
    }
    if (queeneingabe > 4){
        alert("Fehler: Der wert für Queen darf nicht größer als 4 sein")
    }
    if (latscheingabe > 13){
        alert("Fehler: Der wert für Lotusch darf nicht größer als 13 sein")
    }
    if (diamondseingabe > 13) {
        alert("Fehler: Der wert für Diamonds darf nicht größer als 13 sein")
    }
    // Überprüfung und Anpassung für konig und queen
    konigeingabe = konigeingabe > 1 ? 1 : konigeingabe
    queeneingabe = queeneingabe > 4 ? 4 : queeneingabe
    latscheingabe = latscheingabe > 13 ? 13 : latscheingabe
    diamondseingabe = diamondseingabe > 13 ? 13 : diamondseingabe

    let konigSum = konigeingabe ? konigeingabe * konig : 0;
    let queenSum = queeneingabe ? queeneingabe * queen : 0;
    let latschSum = latscheingabe ? latscheingabe * latsch : 0;
    let dieamondSum = diamondseingabe ? diamondseingabe * diamonds : 0;

    let rechnung = konigSum + queenSum + latschSum + dieamondSum;

    // Überprüfung, ob eine oder mehrere Eingaben fehlen
    if (!konigeingabe || !queeneingabe || !latscheingabe || !diamondseingabe) {
        summe.textContent = "Du hast -" + rechnung;
    } else {
        summe.textContent = "Du hast -" + rechnung;
    }

}


//Alter Code
//function jawakerkomplex() {
//     let konig = 75
//     let queen = 25
//     let latsch = 15
//     let dieamond = 10
//
//     let summe = document.getElementById("summe")
//
//     let konigeingabe = parseFloat(document.getElementById("konig").value)
//     konig = konigeingabe * konig;
//
//     let queeneingabe = parseFloat(document.getElementById("queen").value)
//     queen = queeneingabe * queen
//
//     let latscheingabe = parseFloat(document.getElementById("latsch").value)
//     latsch = latscheingabe * latsch;
//
//     let dieamondeingabe = parseFloat(document.getElementById("dieamond").value)
//     dieamond = dieamondeingabe * dieamond;
//     let rechnung = konig + queen + latsch + dieamond;
// //wenn eine fehlt
//     if (!konigeingabe) {
//         rechnung = !konig + queen + latsch + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!queeneingabe) {
//         rechnung = konig + latsch + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!latscheingabe) {
//         rechnung = konig + queen + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!dieamondeingabe) {
//         rechnung = konig + queen + latsch;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     // wenn zwei fehlen
//
//     if (!konigeingabe && !queeneingabe) {
//         rechnung = latsch + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!konigeingabe && !latscheingabe) {
//         rechnung = queen + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//
//     if (!latscheingabe && !dieamondeingabe) {
//         rechnung = konig + queen;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!queeneingabe && !latscheingabe) {
//         rechnung = konig + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//
//     //wenn drei fehlen
//     if (!konigeingabe && !queeneingabe && !latscheingabe) {
//         rechnung = dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!konigeingabe && !queeneingabe && !dieamondeingabe) {
//         rechnung = latsch;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!konigeingabe && !dieamondeingabe && !latscheingabe) {
//         rechnung = queen;
//         summe.textContent = "Du hast -" + rechnung
//     }
//     if (!dieamondeingabe && !latscheingabe && !queeneingabe) {
//         rechnung = konig;
//         summe.textContent = "Du hast -" + rechnung
//     } else {
//         rechnung = konig + queen + latsch + dieamond;
//         summe.textContent = "Du hast -" + rechnung
//     }
// }