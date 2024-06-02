function berechneBMI() {
    let gewicht = document.getElementById("kg").value;
    let größe = document.getElementById("cm").value;
    let bmiResult = document.getElementById("bmiResult");

    if (!gewicht || !größe || größe <= 0 || gewicht <= 0) {
        bmiResult.textContent = "Bitte gültige Werte eingeben.";
    }
    let größeInMeter = größe / 100;
    let bmi = gewicht / (größeInMeter * größeInMeter);
    bmi = bmi.toFixed(2);

    if (bmi <= 0) {
        bmiResult.textContent = "Ungültige Eingabe.";
    } else if (bmi <= 18.5) {
        bmiResult.textContent = "Ihr Body-Mass-Index ist Untergewicht und beträgt: " + bmi;
    } else if (bmi >= 18.5 && bmi <= 24.9) {
        bmiResult.textContent = "Ihr Body-Mass-Index ist Normalgewicht und beträgt: " + bmi;
    } else if (bmi >= 25 && bmi <= 29.9) {
        bmiResult.textContent = "Ihr Body-Mass-Index ist Übergewicht und beträgt: " + bmi;
    } else if (bmi >= 30) {
        bmiResult.textContent = "Ihr BMI ist über 30. Sie sollten ärztlichen Rat einholen, weil " +
            "Ihr Body-Mass-Index Übergewicht ist und beträgt: " + bmi;
    }

}
