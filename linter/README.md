# Linter App

This linter app is a does a simple check to see if semicolons are present in JavaScript files. The checks are not exhaustive and some proper JavaScript will be marked as an error i.e. 'use strict' etc.

These are the only current rules for the linter:
- The linter will not show an error if the line is empty.
- The linter will not show an error if the line starts with `//`
- The linter will not show an error if the line ends with an opening curly brace `{`
- The linter will not show an error if the line ends with a closing curly brace `}`
- The linter will not show an error if the line contains `if` or `else`
- All other lines that do not end in a semicolon will cause an error.

**Command line argument instructions:**

- `./gradlew run --args "/absolutePath/to/your/file.js"`
- Alternatively the full path to your file can be provided as a command line argument within Intellij IDEA.
- Note: in both cases, if the path given is relative, the app will look from the `/app` folder as the root.