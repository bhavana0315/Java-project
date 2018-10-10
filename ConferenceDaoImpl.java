  package com.hcl.conference
  
  @Repository
  public class ConferenceDaoImpl implements ConferenceDao {
  
  @AutoWired
  JdbcTemplate template;
  
  public List<Conference> findRooms(int noOfPeople, Date startTime, Date endTime) {
  
  try {
  String sql = "SELECT * FROM conference where people = ? AND start_time > ? AND endTime < ?"
  return template.query(sql, noOfPeople, startTime, endTime, new conferenceMapper())
  } catch (Exception ex) {
  //log the exception
  //throw a custom message back to service
  
  }
  
  }
  
  }