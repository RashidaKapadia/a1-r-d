package ca.utoronto.utm.mcs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

public class Connect {

    public static String uriDb = "bolt://localhost:7687";
    public static String uriUser ="http://localhost:8080";
    private static Driver driver = null;

    private Connect() {
        driver = GraphDatabase.driver(uriDb, AuthTokens.basic("neo4j","1234"));
        Utils.setUp(driver);
    }


    public static Driver getDriver(){
        if (driver == null){
            new Connect();
        }
        return driver;
    }
}

