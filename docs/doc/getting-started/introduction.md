# What is YMLVersion?

**YMLVersion** is a versatile API for Minecraft plugins designed to simplify configuration file management for both developers and server administrators.

When developing Minecraft server plugins, configuration files are typically stored in `.yml` (YAML) format. As plugins evolve and new versions are released, configuration files often need to be updated with new options, settings, or structural changes. Managing these updates manually can be frustrating and error-prone.

YMLVersion provides a clean and automated solution to this problem by allowing developers to update YAML configuration files without overwriting or deleting user-defined settings.

---

# What Can This API Do?

YMLVersion allows you to update YAML files while preserving existing content.

Normally, when a new plugin version introduces changes to the configuration file, server administrators must:
- Delete the old configuration file
- Restart the server to regenerate it
- Manually copy old settings into the new file

This process is inconvenient and increases the risk of configuration errors.

With YMLVersion, this is no longer necessary. The API automatically:
- Detects version changes in the configuration file
- Updates only the required keys
- Preserves all existing user-defined values
- Adds new configuration options safely

This ensures a smooth upgrade experience for both developers and end users.

---

# How Does It Work?

The API is designed to be simple and developer-friendly.

To use YMLVersion, the developer provides:
- The current configuration version
- The version key path inside the YAML file
- The resource file name
- Additional optional parameters if needed

Once configured, the API works as follows:

1. It reads the target YAML file.
2. It stores all existing keys and their values in memory.
3. It regenerates the configuration file using the updated resource template.
4. It restores the old values into the new file structure.
5. It updates the version field accordingly.

This process ensures that:
- New keys are added.
- Removed keys are cleaned up (if necessary).
- Existing settings remain untouched.

---

# Why Use YMLVersion?

- Prevents accidental loss of configuration data
- Simplifies plugin updates
- Improves user experience
- Reduces support requests related to broken configs
- Keeps configuration files clean and up to date

YMLVersion is ideal for developers who want to provide seamless configuration updates without forcing users to manually manage YAML files after every plugin release.