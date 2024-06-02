package Dao;

import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WareDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDaoMA22/src/Data/Kaufvertrag.db3";

    public WareDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    public Ware read(int WarenNr) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM waren WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, WarenNr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int nr = resultSet.getInt("WarenNr");
            String bezeichnung = resultSet.getString("Bezeichnung");
            String beshreibung = resultSet.getString("Beschreibung");
            double preis = resultSet.getDouble("Preis");
            String besonderheiten = resultSet.getString("Besonderheiten");
            String maengel = resultSet.getString("Maengel");
            ware = new Ware(bezeichnung, preis);
            ware.setWareNr(nr);
            ware.setBeschreibung(beshreibung);

            if (beshreibung != null) {
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b : besonderheitenArray) {
                    ware.getBesonderheiten().add(b.trim());
                }
            }
            if (maengel != null) {
                String[] mangelArray = maengel.split(";");
                for (String m : mangelArray) {
                    ware.getBesonderheiten().add(m.trim());
                }
            }
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
        return ware;
    }

    public static class WareDaoMitArray {
        private final String CLASSNAME = "org.sqlite.JDBC";
        private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDaoMA22/src/Data/Kaufvertrag.db3";

        public WareDaoMitArray() throws ClassNotFoundException {
            Class.forName(CLASSNAME);
        }

        public List<Ware> read() {
            List<Ware> wareList = new ArrayList<>();
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                connection = DriverManager.getConnection(CONNECTIONSTRING);
                String sql = "SELECT * FROM waren ";
                preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int nr = resultSet.getInt("WarenNr");
                    String bezeichnung = resultSet.getString("Bezeichnung");
                    String beschreibung = resultSet.getString("Beschreibung");
                    double preis = resultSet.getDouble("Preis");
                    String besonderheiten = resultSet.getString("Besonderheiten");
                    String maengel = resultSet.getString("Maengel");
                    Ware ware = new Ware(bezeichnung, preis);
                    ware.setBeschreibung(beschreibung);
                    ware.addBesonderheiten(besonderheiten);
                    ware.addMaengel(maengel);
                    ware.setWareNr(nr);
                    wareList.add(ware);
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
            return wareList;
        }
    }

    public void delete(int nr) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Verbindung zu Datenbank herstelen.
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL-Abfrage erstellen.
            String sql = "DELETE FROM Waren WHERE ausweisNR = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nr);

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

    public void update(Ware ware) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE waren SET bezeichnung = ?, beschreibung = ?, preis = ? besonderheiten = ?, maengel = ? WHERE";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getBezeichnung());
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            //Besonderheitenliste in einen String umwandelt mit einem ";" als Trenner.
            String besonderheiten = "";
            for (String b : ware.getBesonderheiten()) {
                if (besonderheiten.isEmpty()) {
                    besonderheiten = b;
                } else {
                    besonderheiten += "; " + b;
                }
            }
            /*
            String besonderheiten = mapListToString(ware.getBesonderheitenList());
             */
            preparedStatement.setString(4, besonderheiten);
            //Mängelliste in einen String umwandeln mit einem ";" als Trenner.
            String meangel = "";
            for (String m : ware.getMaengeel()) {
                if (meangel.isEmpty()) {
                    besonderheiten = m;
                } else {
                    besonderheiten += "; " + m;
                }
            }
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