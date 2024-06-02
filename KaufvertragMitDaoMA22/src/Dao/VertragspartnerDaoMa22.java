package Dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VertragspartnerDaoMa22 {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDaoMA22/src/Data/Kaufvertrag.db3";

    public VertragspartnerDaoMa22() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }


    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try {

            //verbindung zu Datenbank
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL Abfrage erstellen
            String sql = "SELECT * From vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);

            // SQL ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            // Zeiger (Partner) innerhalb der Ergebnistabelle auf den ersten Datensatz positionieren
            resultSet.next();

            // Resultset auswerten
            String nr = resultSet.getString("AusweisNr");
            String vorname = resultSet.getString("Vorname");
            String nachname = resultSet.getString("Nachname");
            String strasse = resultSet.getString("Strasse");
            String hausNr = resultSet.getString("HausNr");
            String plz = resultSet.getString("Plz");
            String ort = resultSet.getString("Ort");

            //Vertragspartner erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(nr);
            Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
            vertragspartner.setAdresse(adresse);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartner;
    }


    public List<Vertragspartner> readall() {
        List<Vertragspartner> vertragspartnerListe = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            String sql = "SELECT * FROM Vertragspartner";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String nr = resultSet.getString("AusweisNr");
                String vorname = resultSet.getString("Vorname");
                String nachname = resultSet.getString("Nachname");
                String strasse = resultSet.getString("Strasse");
                String hausNr = resultSet.getString("HausNr");
                String plz = resultSet.getString("Plz");
                String ort = resultSet.getString("Ort");

                Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);
                vertragspartner.setAusweisNr(nr);
                Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
                vertragspartner.setAdresse(adresse);

                vertragspartnerListe.add(vertragspartner);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartnerListe;
    }

    public void delete(String ausweisNr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // Verbindung zu Datenbank herstelen.
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen.
            String sql = "DELETE FROM Vertragspartner WHERE ausweisNR = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            //SQL-Abfrage ausführen.
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void update(Vertragspartner vertragspartner) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //Verbindung zu Datenbank herstellen
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL Abfrage erstellen
            String sql = "UPDATE vertragspartner SET vorname = ?, nachname = ?, strasse = ?,hausNr= ?, plz = ?, ort = ? WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getVorname());
            preparedStatement.setString(2, vertragspartner.getNachname());
            preparedStatement.setString(3, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(4, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(5, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(6, vertragspartner.getAdresse().getOrt());
            preparedStatement.setString(7, vertragspartner.getAusweisNr());

            //SQL Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * fügt einen neuen Vertragspartner  hinzu
     *
     * @param vertragspartner hinzufügenden Vertragspartner
     * @return vertragspartner Der Vertragspartner, der hinzugefügt wurde
     */
    public Vertragspartner create(Vertragspartner vertragspartner) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //Verbindung zu Datenbank herstellen
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL Abfrage erstellen
            String sql = "INSERT INTO vertragspartner (ausweisNr, vorname, nachname, strasse, hausNr, plz, ort) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getAusweisNr());
            preparedStatement.setString(2, vertragspartner.getVorname());
            preparedStatement.setString(3, vertragspartner.getNachname());
            preparedStatement.setString(4, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(5, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(6, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(7, vertragspartner.getAdresse().getOrt());
            //SQL Abfrage ausführen
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartner;
    }
}