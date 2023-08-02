This is a word counter code , which is simple in this game i used inputtext.split function to distribute the input string or quote in a group of words individually :

Following is the rule when we use the text.split() function , we need to keep in mind following points which are necessary although the entire code is easy to understand but this points need to be got highlighted which are , There are two ways to get solve the word coutner project first one 

1 . logic is , counting the words , or space we can say , look whenever the user enter string it will by default it will be start with an alphabet ! right it can t be start with , ' ' ( space ) right ? so the 
whenever we encounter space ' ' on that index and the index after should not be ' ' , so then we will assure that the first words is been completed and increase the count : 

2 . logic :- 

in this we use inbuilt function , with regex 


 "   \\   ": A backslash is used to escape the following character.
 "   W    ": Matches any non-word character (not a letter, digit, or underscore).
 "   +    ": Matches one or more occurrences of the preceding character or group.
 "  \\W+  ": will match one or more consecutive non-word characters, effectively splitting the input text into words.

For example, if you have the input text: "Hello, world! This is a sample text."

Using inputText.split("\\W+") will result in the following array of words: ["Hello", "world", "This", "is", "a", "sample", "text"]

Each word in the input text will be extracted based on non-word characters as separators.