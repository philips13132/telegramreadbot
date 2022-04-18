import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BOT extends TelegramLongPollingBot {

    private final String userName = "@BOOKSHELF_test_bot";
    private final String token = "5338164176:AAG1hme14u6qBPdP8S8E7cl4XhPsg8qN1IE";

    @Override
    public String getBotUsername() {
        return userName;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            String text = update.getMessage().getText();
            System.out.println(text);
        }
    }
}
