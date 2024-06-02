
// Write Javascript code!
function convertCurrency() {
  const amount = parseFloat(document.getElementById('amount').value);
  const fromCurrency = document.getElementById('fromCurrency').value;
  const toCurrency = document.getElementById('toCurrency').value;

const x = {
  USD: {

  }
}
  // Festgelegte Wechselkurse (Beispiel)
  const exchangeRates = {
    USD: {
      EUR: 0.85,
      GBP: 0.72,
    },
    EUR: {
      USD: 1.18,
      GBP: 0.84,
    },
    GBP: {
      USD: 1.39,
      EUR: 1.19,
    },
  };

  if (!amount) {
    document.getElementById('result').textContent =
      'Bitte einen Betrag eingeben.';
  } else if (
    exchangeRates[fromCurrency] &&
    exchangeRates[fromCurrency][toCurrency]
  ) {
    const rate = exchangeRates[fromCurrency][toCurrency];
    const convertedAmount = amount * rate;
    document.getElementById(
      'result'
    ).textContent = `${amount} ${fromCurrency} entsprechen ${convertedAmount.toFixed(
      2
    )} ${toCurrency}`;
  } else {
    document.getElementById('result').textContent =
      'Fehler: Wechselkurs nicht gefunden.';
  }
}

// Funktion zum Zurücksetzen der Eingabefelder
function resetForm() {
  document.getElementById('amount').value = '';
  document.getElementById('fromCurrency').selectedIndex = 0;
  document.getElementById('toCurrency').selectedIndex = 0;
  document.getElementById('result').textContent = '';
}

// Aufruf der Funktion, um die Eingabefelder zurückzusetzen
resetForm();
