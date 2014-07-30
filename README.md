Ostfalia Thesis
===============
In diesem Repository ist eine LaTeX-Vorlage für eine wissenschaftliche Arbeit an der Ostfalia verfügbar. Dies kann eine einfache Hausarbeit, eine Bachelor- oder Masterarbeit sein. Wenn das Deckblatt verändert wird, ist diese Vorlage sicher auch für andere Universitäten und (Fach-)Hoschulen verwendbar.

Das [Beispieldokument](../master/Beispieldokument.pdf) ist direkt zur Ansicht in diesem Repository eingefügt.

An dieser Stelle vielen Dank für die Mithilfe von Bastian Schulten.

Verwendung
----------
Ich möchte hier kein LaTeX-Tutorial verfassen, sondern nur auf die Ideen in dieser Vorlage eingehen.

### Deckblatt
Um auf dem Deckblatt den Platzhaltertext auszutauschen müssen in der Datei [commands.tex](https://github.com/dennisstritzke/ostfalia-thesis/blob/master/Meta/commands.tex) die Entsprechenden Texte ersetzt werden.

### Kapitel
Die Kapitel werden in dem Ordner [Kapitel](https://github.com/dennisstritzke/ostfalia-thesis/tree/master/Kapitel) als Unterorder und in der Datei [Hauptdokument.tex](https://github.com/dennisstritzke/ostfalia-thesis/blob/master/Hauptdokument.tex) als <i>\input</i> hinzugefügt. Dabei ist die Idee, dass jedes Kapitel seinen eigenen Ordner hat. In diesem sind dann auch alle, zu diesem Kapitel relevanten, Dateien vorhanden.

### Todo-Notizen
Es wurde das Package todonotes eingefügt. Mit diesem können Hinweise für fehlende Grafiken und Hinweise als "Post It"s in den Text eingefügt werden. Auch wurde auf der ersten Seite ein Inhaltsverzeichnis der Todos eingefügt.
Im [Hauptdokument.tex](https://github.com/dennisstritzke/ostfalia-thesis/blob/master/Hauptdokument.tex) wurde eine Variable <i>draft</i> eingefügt. Wenn diese auf <i>true (\drafttrue)</i> gesetzt ist, sind die Notizen im Text vorhanden. Wenn die Varibale nicht existiert oder auf <i>false (\draftfalse)</i> gesetzt ist, werden diese nicht angezeigt.

Verbesserungen und Fehler
-------------------------
Falls bei der Verwendung Fehler auffallen, bitte ich daraum, dass diese im [Issue-Tracker](https://github.com/dennisstritzke/ostfalia-thesis/issues "GitHub Issue Tracker") einzutragen. Auch sind dort Verbesserungswünsche gerne gesehen. Wenn ihr selbst etwas verbessert habt, bitte ich einen Pull Request zu stellen. Danke!

### Viel Erfolg beim Nutzen dieser Vorlage!
