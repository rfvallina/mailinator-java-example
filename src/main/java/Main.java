import com.manybrain.mailinator.client.MailinatorClient;
import com.manybrain.mailinator.client.message.GetInboxRequest;
import com.manybrain.mailinator.client.message.Inbox;

public class Main {

  public static void main(String[] args) {
    MailinatorClient mailinatorClient = new MailinatorClient("apiToken");

    Inbox inbox = mailinatorClient.request(GetInboxRequest.builder()
        .domain("public")
        .inbox("fuss86")
        .build());

    System.out.println(inbox.getMsgs());
  }
}
