# BrainBox UI Kit 🚀

Модульная UI-библиотека дизайн-системы для Android-приложения **BrainBox**, написанная на Jetpack Compose. Она содержит переиспользуемые компоненты, тему, типографику и ресурсы.

---

## 🛠 Содержимое библиотеки

Библиотека построена на базе Jetpack Compose и Material 3 и включает в себя:
* **Theme & Typography**: Фирменная цветовая палитра, кастомные шрифты (`Poppins`, `Urbanist`) и стили текста (`Theme.kt`, `Color.kt`, `Type.kt`).
* **Components (`components/`)**:
  * `Buttons.kt` — кастомные кнопки (основные, вторичные, с поддержкой форм и стилей).
  * `TextFields.kt` — поля ввода данных.
  * `TextLink.kt` — текстовые ссылки.
  * `Navigator.kt` — элементы навигации (слайдер для onBoarding).
* **Resources (`res/drawable/`)**: Набор векторных иконок (`ic_email`, `ic_lock`, `ic_eye_off`, стрелочки, линии и т.д.).

---

## 📦 Установка и подключение (.aar)

Поскольку библиотека поставляется как локальный `.aar`-модуль:

1. Скопируйте файл `uikit-release.aar` (или аналог) в папку `app/libs/` вашего основного проекта.
2. Подключите его в файле `app/build.gradle.kts`:
   ```kotlin
   dependencies {
       implementation(files("libs/uikit-release.aar"))
   }
