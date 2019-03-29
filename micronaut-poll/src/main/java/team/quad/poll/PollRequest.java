package team.quad.poll;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class PollRequest {

  private String category;

  public PollRequest() {
    this("");
  }

  public PollRequest(String category) {
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
