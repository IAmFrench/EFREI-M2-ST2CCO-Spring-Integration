package test;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    /* (non-Javadoc)
     * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
     */
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        return person;
    }
}
