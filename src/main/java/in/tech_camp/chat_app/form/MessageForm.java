package in.tech_camp.chat_app.form;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import jakarta.validation.Validation;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MessageForm {
  @NotBlank(message = "名前は空白にできません", groups = ValidationPriority1.class)
  private String content;
}
