package in.tech_camp.chat_app.entity;

import java.util.List;

import lombok.Data;

@Data
public class RoomEntity {
  private Long id;
  private String name;
  private List<RoomUserEntity> roomUsers; //イメージ的には配列
  private List<MessageEntity> messages;
}
