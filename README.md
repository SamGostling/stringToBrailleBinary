# stringToBrailleBinary
Takes a string of upper or lower case letters and converts it to braille in a binary format

Each letter is represented by 6 bits, these can be concatenated together to make words/sentences

000000 is used for spaces and 000001 is used in front of letters to signify that it is upper case

For Example:

- 100000 -> 'a'

- 110000 -> 'b'

- 000000 -> ' '

- 000001100000 -> 'A'

- 000001110010100010111000111000101010000000000001010111101010111010111000100110 -> 'Hello World'
