# BISMILLAH - 17

<!-- TOC -->

* [BISMILLAH](#bismillah)
* [introduction](#introduction)
* [running](#running)
* [references](#references)

<!-- TOC -->

# introduction

- TechSupport is a program intended to provide AI base for users of City I-VAST services.
  The system is supposed to mimic the responses a Home I-VAST might give. Users can communicate
  with the Home I-VAST.
- They can describe their needs and get advice instantly!
- The purpose of this project is to demonstrate and study as <b>ArrayList, HashMap, HashSet, and Random.</b>
- The idea of the project is based on AI program Eliza in which the program holds a dialog with the user.

## tech_notes


### note2
- In ``public class SupportSystem.start()`` I can use two input types but
there are some limitations for String type

* 1- input is HashSet<String> type:
```
HashSet<String> input
if (input.contains("bye")) 
```
* 2- input is String type:
```
String input
if (input.startsWith("bye"))  //startsWith(String prefix)
```


```

```

# running

- To start this program, I have created a ``SupportSystem object`` and executed the ``start  method``. Then start describing my problem by typing in the terminal window.

# references

- Objects First with Java - Chap 5 - pg155 - 163 (son)   ![#FF0000](https://placehold.co/15x15/FF0000/FF0000.png)
- Icons ekleme https://www.jetbrains.com/help/idea/customize-actions-menus-and-toolbars.html#customize-main-toolbar 
