//RoomとUserの中間テーブル
package in.tech_camp.chat_app.entity;

import lombok.Data;

@Data
public class RoomUserEntity {
  private Long id;
  private UserEntity user; //UserEntityを参照する UserEntityからのデータが全て入っている useridになってしまうと、特定かつ範囲広く
  private RoomEntity room; //RoomEntityを参照する RoomEntityからのデータが全て入っている
}
