package de.jonafaust.test;

import de.jonafaust.jdaboot.annotation.EventHandler;
import de.jonafaust.jdaboot.annotation.SetTranslator;
import de.jonafaust.jdaboot.variables.Translator;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.interactions.DiscordLocale;

public class TestEvent {

    @SetTranslator
    public static Translator translator;

    @EventHandler
    public void onReady(GuildMemberJoinEvent event) {
        System.out.println(translator.getTranslatedString(DiscordLocale.GERMAN, "test"));
    }

}
