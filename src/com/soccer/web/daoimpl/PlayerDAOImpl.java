package com.soccer.web.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.dao.PlayerDAO;
import com.soccer.web.domanis.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImpl implements PlayerDAO{
	private static PlayerDAOImpl instance = new PlayerDAOImpl();
	public static PlayerDAOImpl getInstance() {
		return instance;
	}
	private PlayerDAOImpl() {}
	
	@Override
	public List<String> selectPositions() {
		List<String> list = new ArrayList<>();
        try {
        	String sql = "SELECT DISTINCT POSITION position \n"
        			+ "FROM PLAYER";
                ResultSet rs= DatabaseFactory.
                		createDatebase(Constants.VENDOR).
                		getConnection().
                		prepareStatement(sql).
                		executeQuery();
                while(rs.next()) {
                	list.add(rs.getString("position"));
                }
                System.out.println("포지션: " + list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
	}
	
	@Override
	public List<PlayerBean> selectTeamidPosition(PlayerBean param) {
		
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		try {
			String sql = "SELECT PLAYER_NAME playerName\n" +
                    " FROM PLAYER\n"
                    + "WHERE TEAM_ID LIKE '"+ param.getTeamId()+"'"
                    + "AND POSITION LIKE '"+ param.getPosition()+"'";
			ResultSet rs = DatabaseFactory.
					createDatebase(Constants.VENDOR).
					getConnection().
					prepareStatement(sql).
					executeQuery();
                while(rs.next()) {
                	PlayerBean temp = new PlayerBean();
                	temp.setPlayerName(rs.getString(1));
                    list.add(temp);
                }
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("리턴전 리스트 : "+list);
		return list;
	}

	@Override
	public List<PlayerBean> selectTeamidHeightName(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		String name = "";
		try {
			String sql = "SELECT PLAYER_NAME playerName\r\n" + 
            		"FROM PLAYER\r\n" + 
            		"WHERE TEAM_ID LIKE '"+param.getTeamId()+"'\n" + 
            		"    AND HEIGHT >= "+param.getHeight()+"\n" + 
            		"    AND PLAYER_NAME LIKE '"+param.getPlayerName()+"%'";
			ResultSet rs = DatabaseFactory.
					createDatebase(Constants.VENDOR).
					getConnection().
					prepareStatement(sql).
					executeQuery();
                while(rs.next()) {
                	PlayerBean temp = new PlayerBean();
                	temp.setPlayerName(rs.getString(1));
                    list.add(temp);
                    name = temp.getPlayerName();
                }
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("리턴 전 list : "+name);
		
		return list;
	}
	
}
