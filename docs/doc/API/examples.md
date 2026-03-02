# Example

Here is an example of how to use YMLVersion in your plugin after installation.  
Make sure to update the version of your YML file accordingly.

```java
public void onEnable() {
    try {
        YMLVersion.builder()
            .version("1.1")
            .plugin(this)
            .resource("configuration.yml")
            .versionKey("config-version")
            .build();
        
        YMLVersion.builder()
            .version("1.3")
            .plugin(this)
            .resource("messages.yml")
            .versionKey("messages-version")
            .build();
    } catch (Exception e) {
        // If a required variable is missing, an exception will be thrown
    }
}
```
# Example YML File in the Resources Folder

This is an example of the *configuration.yml* file we updated in the example above:
```yml
config-version: '1.0' # This should match the version used in the YMLVersion builder

configuration-params:

    test: "hello" # Even if the version changes and the server admin modifies this value,
                  # the YML file will be updated without resetting this parameter

    # Comments are preserved by the API, so this note will remain :)
```