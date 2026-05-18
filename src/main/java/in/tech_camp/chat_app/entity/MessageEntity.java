package in.tech_camp.chat_app.entity;

import java.sql.Time;

import lombok.Data;

@Data
public class MessageEntity {
  private Long id;
  private String content;
  private Long userid;
  private Time createdAt;
  private UserEntity user;
  private RoomEntity room;

}
