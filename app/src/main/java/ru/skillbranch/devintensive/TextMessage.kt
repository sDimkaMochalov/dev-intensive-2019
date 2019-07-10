package ru.skillbranch.devintensive


import ru.skillbranch.devintensive.extension.humanizeDiff
import java.util.*

class TextMessage (
    id: String,
    from: User?,
    chat: Chat,
    isIncomnig: Boolean = false,
    date: Date = Date(),
    var text: String?
): BaseMessage(id, from, chat, isIncomnig, date) {

    override fun formatMessage(): String  = "id:$id  ${from?.firstName} \n" +
            "${if (isIncoming) "получил" else "отправил"} сообщение \"$text\" ${date.humanizeDiff()}  "


}
