package in.tech_camp.chat_app.form;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.BindingResult;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import in.tech_camp.chat_app.validation.ValidationPriority2;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserForm {
  @NotBlank(message = "ユーザー名は必須項目です。", groups = ValidationPriority1.class)
  private String name;

  @NotBlank(message = "メールアドレスは必須項目です。", groups = ValidationPriority1.class)
  @Email(message = "有効なメールアドレスを入力してください。", groups = ValidationPriority2.class)
  private String email;

  @NotBlank(message = "パスワードは必須項目です。", groups = ValidationPriority1.class)
  @Length(min = 6, max = 120, message = "パスワードは6文字以上で入力してください。", groups = ValidationPriority2.class)
  private String password;

  private String passwordConfirmation; //パスワード確認用

  public void validatePasswordConfirmation(BindingResult result) {
    if (!password.equals(passwordConfirmation)) {
      result.rejectValue("passwordConfirmation", "error.user","Password confirmation doesn't match.");
    }
  }

  /*private String name;

  @NotBlank(message = "メールアドレスは必須項目です。", groups = ValidationPriority1.class)
  @Email(message = "有効なメールアドレスを入力してください。", groups = ValidationPriority2.class)
  private String email;

  @NotBlank(message = "パスワードは必須項目です。", groups = ValidationPriority1.class)
  private String password;
  
  @NotBlank(message = "パスワード確認は必須項目です。", groups = ValidationPriority2.class)
  private String passwordConfirmation; //パスワード確認用*/
}
