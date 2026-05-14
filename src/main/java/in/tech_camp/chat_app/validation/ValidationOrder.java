package in.tech_camp.chat_app.validation;

import jakarta.validation.GroupSequence;
import jakarta.validation.groups.Default;

@GroupSequence({Default.class, ValidationPriority1.class, ValidationPriority2.class})
public interface ValidationOrder {
  
}
