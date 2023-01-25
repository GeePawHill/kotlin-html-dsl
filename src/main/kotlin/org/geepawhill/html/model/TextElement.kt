package org.geepawhill.html.model

class TextElement(val text: String) : Element {
    override fun emit(builder: StringBuilder): String {
        builder.append(text)
        return builder.toString()
    }
}
