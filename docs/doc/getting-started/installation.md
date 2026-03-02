# How to Install

Currently, only the **Bukkit** implementation is available.

To install YMLVersion in your project:

1. Go to the Bukkit API folder in the repository:  
   <a href="https://github.com/Yager400/YMLVersion/tree/main/API/bukkit">https://github.com/Yager400/YMLVersion/tree/main/API/bukkit</a>  
2. Download or copy the provided Java file.
3. Paste it into your plugin project (for example, inside your `utils` or `api` package).

After adding the file to your project, you can immediately start integrating it into your plugin’s configuration management system.

---

# What Needs to Be Changed

Before using the API, you **must update the package name**.

The default package included in the repository is intended only for testing purposes. To properly integrate it into your plugin:

- Change the package declaration at the top of the Java file.
- Move the file into your plugin’s package structure (e.g., `com.yourname.yourplugin.api`).

This ensures:
- Proper project organization
- No package conflicts
- Compatibility with your existing plugin structure

Once the package name is updated, the API is ready to use inside your plugin.