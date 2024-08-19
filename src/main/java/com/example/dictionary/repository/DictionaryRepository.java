package com.example.dictionary.repository;

import com.example.dictionary.model.Dictionary;
import org.springframework.stereotype.Repository;
import util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Repository
public class DictionaryRepository {
        private final static String FIND_BY_WORD = "select * from dictionary where english = ?;";


        public Dictionary findByWord(String word) {
               Dictionary dictionary = null;
                try (Connection connection = Database.getConnection();
                PreparedStatement statement = connection.prepareStatement(FIND_BY_WORD)){
                statement.setString(1,word);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String english = resultSet.getString("english");
                    String vietnamese = resultSet.getString("vietnamese");
                    dictionary = new Dictionary(id,english,vietnamese);
                }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            return dictionary;
        }

}
