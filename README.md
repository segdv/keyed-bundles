<div align="center">
    <h1>Keyed Bundles</h1>
    <p>
        <a href="https://modrinth.com/mod/keyed-bundles">
            <img src="./src/main/resources/assets/keyed-bundles/icon.png" align="center" alt="Logo" />
        </a>
    </p>
    <p>Cycle through the items inside a bundle with keyboard keys.</p>
    <p>
        <a href="https://modrinth.com/mod/keyed-bundles">
            <img alt="Modrinth Downloads" src="https://img.shields.io/modrinth/dt/keyed-bundles?logo=modrinth&logoColor=%2300AF5C&label=Downloads&color=%2300AF5C&link=https%3A%2F%2Fmodrinth.com%2Fmod%2Fkeyed-bundles" />
        </a>
        <a href="https://modrinth.com/mod/keyed-bundles">
            <img alt="Modrinth Followers" src="https://img.shields.io/modrinth/followers/keyed-bundles?style=flat&logo=modrinth&label=Followers&logoColor=%2300AF5C&color=%2300AF5C&link=https%3A%2F%2Fmodrinth.com%2Fmod%2Fkeyed-bundles" />
        </a>
    </p>
</div>

---

![Bundle with items](https://cdn.modrinth.com/data/sVd6h1iX/images/ad70330865c5d604271561477e71f54f07921d26.png)

## Features
This mod adds two keybinds that cycle to the next or previous item inside a bundle while you hover over it in an inventory, perfect for when your mouse wheel stops working. They are bound to the left and right arrows keys by default and can be rebound in the controls menu.

![The two keybinds that this mod adds to the menu.](https://cdn.modrinth.com/data/sVd6h1iX/images/2459b4cf33ee9a76300d5d40ce6b86a6583319a3.png)

Personally, I’d recommend using the A and D keys for this.

## Building

This project uses [Stonecutter](https://stonecutter.kikugie.dev/) to build for multiple Minecraft versions.

```bash
./gradlew :1.21.2:build :1.21.9:build :26.1:build :26.2:build
```

Artifacts are written to `versions/<version>/build/libs/`.
