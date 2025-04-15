package ChainofResponsibility;
public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        try {
            if ("account_ban".equals(issue) || "data_loss".equals(issue)) {
                System.out.println("[SeniorSupport] Handled " + issue);
            } else {
                escalate(issue);  // Эскалация запроса
            }
        } catch (Exception e) {
            System.out.println("[SeniorSupport] " + e.getMessage());
        }
    }
}
