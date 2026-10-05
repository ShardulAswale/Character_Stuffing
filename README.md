# Character Stuffing

Java console demonstration of framing and escaping a text message.

## How it works

The sender adds `F` frame markers and prefixes internal `F` and `E` characters with escape character `E`. A receiver routine removes the framing and escape characters, then prints the reconstructed message.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/charstuff61/Charstuff61.java
java -cp out charstuff61.Charstuff61
```
Enter a message when prompted.

## Notes

Input is read as a single whitespace-delimited token. This is a local framing exercise; no network transport or encryption is implemented.
