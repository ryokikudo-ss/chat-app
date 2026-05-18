package in.tech_camp.chat_app.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class MessageEntity {
  private Long id;
  private String content;
  private Long userid;
  private Timestamp createdAt;
  private UserEntity user;
  private RoomEntity room;

}
