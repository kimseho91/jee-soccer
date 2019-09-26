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
	public static PlayerDAOImpl getInstance() { return instance; }
	private PlayerDAOImpl() {}
	
	@Override
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		System.out.println("7. DAO 들어옴");
		System.out.println(String.format("param 값 : %s, %s",
				param.getPlayerId(),
				param.getSolar()));
		PlayerBean player = null;
		String sql ="SELECT * \n" + 
				"FROM PLAYER \n" + 
				"WHERE PLAYER_ID LIKE ? \n" + 
				"    AND SOLAR LIKE ?";
		try {
			PreparedStatement pstmt = DatabaseFactory
					.createDatebase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			pstmt.setString(1, param.getPlayerId());
			pstmt.setString(2, param.getSolar());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYYYY(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickname(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("8반환된 정보 값 : "+player.toString());
		return player;
	}
	
	@Override
	public List<String> selectPositions() {
		List<String> list = new ArrayList<>();
        try {
        	String sql = "SELECT DISTINCT POSITION position \n"
        			+ "FROM PLAYER";
        	String test = "SELECT PLAYER_ID playerId, SOLAR solar FROM PLAYER";

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
	@Override
	public List<PlayerBean> selectByMany(PlayerBean parma) {
		List<PlayerBean> list = new ArrayList<PlayerBean>();
		String sql = " ? ";
		try {
			PreparedStatement pstmt = DatabaseFactory
					.createDatebase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			pstmt.setString(1, parma.getPlayerId());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
