# Blue Glass Clock — Android Studio project

This is a starter Android Studio project for a resizable Home-screen clock widget.
It uses the comic wallpaper you supplied and a translucent blue clock with a glow.

## Build an APK
1. Install Android Studio on your computer.
2. Open this folder (`BlueGlassClock`) in Android Studio.
3. Let Gradle sync. If prompted, install Android SDK Platform 35 and a compatible JDK.
4. Choose **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
5. Android Studio will show the APK location (usually `app/build/outputs/apk/debug/app-debug.apk`).

## Add the widget to your Galaxy A57
1. Install the APK on your phone.
2. Long-press an empty area on the Home screen.
3. Tap **Widgets → Blue Glass Clock**.
4. Drag the widget onto the Home screen and resize it.

## Important limitation
This project creates a Home-screen widget. Standard third-party Android widgets cannot replace Samsung's secure lock-screen clock on current Android versions. Also, Android's RemoteViews widget system does not expose a true live frosted-glass blur shader; this starter uses translucent blue text and a blue glow to approximate the look. `TextClock` supplies the live time.

The widget updates its displayed time using Android's TextClock view. You can customize the time font, size, tint, and wallpaper in `app/src/main/res/layout/widget_blue_clock.xml`.
