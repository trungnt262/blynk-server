package cc.blynk.server.core.protocol.model.messages.appllication;

import cc.blynk.server.core.protocol.model.messages.StringMessage;

import static cc.blynk.server.core.protocol.enums.Command.DELETE_WIDGET;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class DeleteWidget extends StringMessage {

    public DeleteWidget(int messageId, String body) {
        super(messageId, DELETE_WIDGET, body.length(), body);
    }

    @Override
    public String toString() {
        return "DeleteWidget{" + super.toString() + "}";
    }
}
