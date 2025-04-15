package ChainofResponsibility;
public class Main {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior);
        junior.setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};

        for (String issue : issues) {
            faq.handle(issue);
        }
        //add bonus
        //.d.d
    }
}
