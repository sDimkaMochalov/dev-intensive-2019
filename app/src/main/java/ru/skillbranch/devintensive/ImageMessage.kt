package ru.skillbranch.devintensive

import ru.skillbranch.devintensive.extension.humanizeDiff
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncomnig: Boolean = false,
    date: Date = Date(),
    var image: String?
): BaseMessage(id, from, chat, isIncomnig, date) {

    override fun formatMessage(): String  = "id:$id  ${from?.firstName} \n" +
            "${if (isIncoming) "получил" else "отправил"} изображение \"$image\" ${date.humanizeDiff()}  "
}
