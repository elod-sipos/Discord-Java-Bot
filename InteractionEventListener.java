package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        System.out.println("interaction");
        switch (event.getName()) {
            case "greet":
                event.reply("hewwo :3").queue();
                break;
            case "godspeed":
                event.reply("bye 3:").queue();
                break;
        }
    }
}
