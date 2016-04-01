package dao;

import domain.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tinymin
 * Date: 16. 3. 29.
 * Time: 오후 4:25
 * To change this template use File | Settings | File Templates.
 */
public class StoreDao
{
//    private static Logger logger = Logger.getLogger(StoreDao.class);

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StoreDao(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<StoreInfo> selectAll()
    {
        // ORM 공부후 ORM으로 변경 필요
        List<StoreInfo> results = jdbcTemplate.query(
            "select si.NAME as STORE_NAME" +
                    ", si.FLOOR as STORE_FLOOR" +
                    ", si.TEL as STORE_TEL" +
                    ", di.NAME as DEP_NAME" +
                    ", di.BRANCH as DEP_BRANCH" +
                    ", di.BUSINESS_HOUR as DEP_BUSINESSHOUR" +
                    ", di.ADDRESS as DEP_ADDR" +
                    ", di.URL as DEP_URL" +
                    " from STORE_INFO si" +
                    ", DEPSTORE_INFO di" +
                    " where si.DEP_ID = di.DEP_ID;"
            , new RowMapper<StoreInfo>()
            {
                @Override
                public StoreInfo mapRow(ResultSet resultSet, int i) throws SQLException
                {
                    StoreInfo storeInfo = new StoreInfo(
                             resultSet.getString("STORE_NAME")
                            ,resultSet.getString("STORE_FLOOR")
                            ,resultSet.getString("STORE_TEL")
                            ,resultSet.getString("DEP_NAME")
                            ,resultSet.getString("DEP_BRANCH")
                            ,resultSet.getString("DEP_BUSINESSHOUR")
                            ,resultSet.getString("DEP_ADDR")
                            ,resultSet.getString("DEP_URL")
                    );

                    return storeInfo;
                }
            }
        );

        return results.isEmpty() ? null : results;
    }

    public List<StoreInfo> select(List<String> storeList)
    {
        StringBuilder searchStores = new StringBuilder();

        for (String item : storeList)
        {
            if (0 < searchStores.length())
                searchStores.append(", ");

            searchStores.append("'" + item.trim() + "'");
        }

        String qry = "SELECT si.NAME" +
                     "     , si.FLOOR" +
                     "     , si.TEL" +
                     "     , di.NAME as DEP_NAME" +
                     "     , di.BRANCH" +
                     "     , di.BUSINESS_HOUR" +
                     "     , di.ADDRESS" +
                     "     , di.URL" +
                     "  FROM STORE_INFO si, DEPSTORE_INFO di" +
                     " WHERE si.DEP_ID = di.DEP_ID" +
                     "   AND si.NAME IN (" + searchStores + ")" +
                     "   AND di.DEP_ID IN (SELECT di.DEP_ID" +
                     "                       FROM STORE_INFO si, DEPSTORE_INFO di" +
                     "                      WHERE si.DEP_ID = di.DEP_ID" +
                     "                        AND si.NAME IN (" + searchStores + ")" +
                     "                      GROUP BY di.NAME, di.BRANCH" +
                     "                     HAVING count(si.NAME) = " + storeList.size() + ")";

        List<StoreInfo> results = jdbcTemplate.query(
              qry
            , new RowMapper<StoreInfo>() {
                @Override
                public StoreInfo mapRow(ResultSet resultSet, int i) throws SQLException
                {
                    StoreInfo storeInfo = new StoreInfo(
                              resultSet.getString("NAME")
                            , resultSet.getString("FLOOR")
                            , resultSet.getString("TEL")
                            , resultSet.getString("DEP_NAME")
                            , resultSet.getString("BRANCH")
                            , resultSet.getString("BUSINESS_HOUR")
                            , resultSet.getString("ADDRESS")
                            , resultSet.getString("URL")
                    );

                    return storeInfo;
                }
            }
        );

        return results.isEmpty() ? null : results;
    }
}
