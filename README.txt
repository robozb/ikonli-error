Dear Ikonli Developers,

Thank you so much for your amazing library! I am encountering the following issue when I mix Bootstrap and FontAwesome dependencies and use the Maven Assembly Plugin.

```
$ java -jar mavenproject6-1.0-SNAPSHOT-jar-with-dependencies.jar 
Picked up JAVA_TOOL_OPTIONS: -Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -Dconsole.encoding=UTF-8
Exception in thread "AWT-EventQueue-0" java.lang.UnsupportedOperationException: Cannot resolve 'fab-accessible-icon'
        at org.kordamp.ikonli.AbstractIkonResolver.resolve(AbstractIkonResolver.java:61)
        at org.kordamp.ikonli.swing.IkonResolver.resolve(IkonResolver.java:80)
        at org.kordamp.ikonli.swing.FontIcon.setIkon(FontIcon.java:96)
        at org.kordamp.ikonli.swing.FontIcon.of(FontIcon.java:158)
        at org.kordamp.ikonli.swing.FontIcon.of(FontIcon.java:145)
        at hu.wfs.mavenproject6.UtilsGUIIcon.setDeafultButtonIcon(UtilsGUIIcon.java:24)
        at hu.wfs.mavenproject6.NewJFrame.<init>(NewJFrame.java:20)
        at hu.wfs.mavenproject6.NewJFrame$1.run(NewJFrame.java:88)
        at java.desktop/java.awt.event.InvocationEvent.dispatch(InvocationEvent.java:318)
        at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:771)
        at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:722)
        at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:716)
        at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
        at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:86)
        at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:741)
        at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
        at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
        at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
        at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)

```

If I run the Maven project "normally" without the Assembly Plugin, everything works perfectly, and I can see the icon.

![](workswell.jpg)