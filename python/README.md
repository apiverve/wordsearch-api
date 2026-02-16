Word Search Generator API
============

Word Search Generator creates customizable word search puzzles with configurable grid size, word placement, and difficulty levels.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Python API Wrapper for the [Word Search Generator API](https://apiverve.com/marketplace/wordsearch?utm_source=pypi&utm_medium=readme)

---

## Installation

Using `pip`:

```bash
pip install apiverve-wordsearchgenerator
```

Using `pip3`:

```bash
pip3 install apiverve-wordsearchgenerator
```

---

## Configuration

Before using the wordsearch API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient

# Initialize the client with your APIVerve API key
api = WordsearchAPIClient("[YOUR_API_KEY]")

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

try:
    # Make the API call
    result = api.execute(query)

    # Print the result
    print(result)
except Exception as e:
    print(f"Error: {e}")
```

---

## Usage

The Word Search Generator API documentation is found here: [https://docs.apiverve.com/ref/wordsearch](https://docs.apiverve.com/ref/wordsearch?utm_source=pypi&utm_medium=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```python
# Import the client module
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient

# Initialize the client with your APIVerve API key
api = WordsearchAPIClient("[YOUR_API_KEY]")
```

---

## Perform Request

Using the API client, you can perform requests to the API.

###### Define Query

```python
query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}
```

###### Simple Request

```python
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "grid": [
      [
        "D",
        "C",
        "B",
        "U",
        "L",
        "G",
        "D",
        "O",
        "Y",
        "B",
        "H",
        "S",
        "H",
        "E",
        "J"
      ],
      [
        "C",
        "Z",
        "D",
        "Z",
        "M",
        "B",
        "N",
        "A",
        "Q",
        "B",
        "L",
        "M",
        "G",
        "O",
        "V"
      ],
      [
        "W",
        "Y",
        "V",
        "U",
        "R",
        "G",
        "V",
        "S",
        "F",
        "U",
        "W",
        "O",
        "S",
        "D",
        "Y"
      ],
      [
        "W",
        "H",
        "V",
        "O",
        "X",
        "Z",
        "V",
        "F",
        "E",
        "L",
        "Z",
        "Z",
        "U",
        "P",
        "M"
      ],
      [
        "D",
        "M",
        "W",
        "P",
        "L",
        "W",
        "U",
        "P",
        "P",
        "W",
        "K",
        "A",
        "E",
        "D",
        "R"
      ],
      [
        "I",
        "D",
        "O",
        "V",
        "P",
        "S",
        "E",
        "A",
        "R",
        "C",
        "H",
        "Z",
        "U",
        "S",
        "J"
      ],
      [
        "I",
        "S",
        "R",
        "L",
        "C",
        "N",
        "C",
        "W",
        "Q",
        "U",
        "G",
        "F",
        "Y",
        "Y",
        "I"
      ],
      [
        "D",
        "P",
        "D",
        "T",
        "J",
        "E",
        "X",
        "U",
        "E",
        "B",
        "E",
        "K",
        "D",
        "B",
        "R"
      ],
      [
        "S",
        "B",
        "K",
        "D",
        "N",
        "D",
        "E",
        "G",
        "J",
        "I",
        "B",
        "Z",
        "N",
        "P",
        "B"
      ],
      [
        "E",
        "Z",
        "M",
        "K",
        "V",
        "D",
        "M",
        "I",
        "Y",
        "T",
        "X",
        "X",
        "I",
        "N",
        "I"
      ],
      [
        "B",
        "B",
        "Q",
        "I",
        "J",
        "I",
        "A",
        "I",
        "S",
        "H",
        "W",
        "P",
        "F",
        "F",
        "G"
      ],
      [
        "A",
        "A",
        "C",
        "H",
        "F",
        "H",
        "G",
        "M",
        "E",
        "W",
        "F",
        "Y",
        "W",
        "A",
        "I"
      ],
      [
        "D",
        "N",
        "P",
        "P",
        "I",
        "A",
        "U",
        "F",
        "I",
        "W",
        "V",
        "O",
        "Y",
        "M",
        "P"
      ],
      [
        "P",
        "D",
        "P",
        "S",
        "R",
        "E",
        "T",
        "T",
        "E",
        "L",
        "G",
        "D",
        "T",
        "W",
        "S"
      ],
      [
        "Y",
        "G",
        "V",
        "K",
        "X",
        "G",
        "D",
        "O",
        "M",
        "P",
        "K",
        "R",
        "W",
        "T",
        "F"
      ]
    ],
    "words": [
      {
        "word": "LETTERS",
        "start": {
          "row": 13,
          "col": 9
        },
        "direction": "left"
      },
      {
        "word": "PUZZLE",
        "start": {
          "row": 3,
          "col": 13
        },
        "direction": "left"
      },
      {
        "word": "SEARCH",
        "start": {
          "row": 5,
          "col": 5
        },
        "direction": "right"
      },
      {
        "word": "HIDDEN",
        "start": {
          "row": 11,
          "col": 5
        },
        "direction": "up"
      },
      {
        "word": "WORD",
        "start": {
          "row": 4,
          "col": 2
        },
        "direction": "down"
      },
      {
        "word": "GAME",
        "start": {
          "row": 11,
          "col": 6
        },
        "direction": "up"
      },
      {
        "word": "FIND",
        "start": {
          "row": 10,
          "col": 12
        },
        "direction": "up"
      }
    ],
    "wordCount": 7,
    "size": 15,
    "difficulty": "medium",
    "html": "<html><head><title>Word Search Puzzle</title><style>body {font-family: Arial, sans-serif; padding: 20px;}.container {display: flex; gap: 40px;}table {border-collapse: collapse;}td {width: 30px; height: 30px; text-align: center; font-size: 18px; font-weight: bold; border: 1px solid #ccc;}.word-list {font-size: 16px;}.word-list h3 {margin-bottom: 10px;}.word-list ul {list-style: none; padding: 0;}.word-list li {margin: 5px 0;}</style></head><body><div class='container'><div><table><tr><td>D</td><td>C</td><td>B</td><td>U</td><td>L</td><td>G</td><td>D</td><td>O</td><td>Y</td><td>B</td><td>H</td><td>S</td><td>H</td><td>E</td><td>J</td></tr><tr><td>C</td><td>Z</td><td>D</td><td>Z</td><td>M</td><td>B</td><td>N</td><td>A</td><td>Q</td><td>B</td><td>L</td><td>M</td><td>G</td><td>O</td><td>V</td></tr><tr><td>W</td><td>Y</td><td>V</td><td>U</td><td>R</td><td>G</td><td>V</td><td>S</td><td>F</td><td>U</td><td>W</td><td>O</td><td>S</td><td>D</td><td>Y</td></tr><tr><td>W</td><td>H</td><td>V</td><td>O</td><td>X</td><td>Z</td><td>V</td><td>F</td><td>E</td><td>L</td><td>Z</td><td>Z</td><td>U</td><td>P</td><td>M</td></tr><tr><td>D</td><td>M</td><td>W</td><td>P</td><td>L</td><td>W</td><td>U</td><td>P</td><td>P</td><td>W</td><td>K</td><td>A</td><td>E</td><td>D</td><td>R</td></tr><tr><td>I</td><td>D</td><td>O</td><td>V</td><td>P</td><td>S</td><td>E</td><td>A</td><td>R</td><td>C</td><td>H</td><td>Z</td><td>U</td><td>S</td><td>J</td></tr><tr><td>I</td><td>S</td><td>R</td><td>L</td><td>C</td><td>N</td><td>C</td><td>W</td><td>Q</td><td>U</td><td>G</td><td>F</td><td>Y</td><td>Y</td><td>I</td></tr><tr><td>D</td><td>P</td><td>D</td><td>T</td><td>J</td><td>E</td><td>X</td><td>U</td><td>E</td><td>B</td><td>E</td><td>K</td><td>D</td><td>B</td><td>R</td></tr><tr><td>S</td><td>B</td><td>K</td><td>D</td><td>N</td><td>D</td><td>E</td><td>G</td><td>J</td><td>I</td><td>B</td><td>Z</td><td>N</td><td>P</td><td>B</td></tr><tr><td>E</td><td>Z</td><td>M</td><td>K</td><td>V</td><td>D</td><td>M</td><td>I</td><td>Y</td><td>T</td><td>X</td><td>X</td><td>I</td><td>N</td><td>I</td></tr><tr><td>B</td><td>B</td><td>Q</td><td>I</td><td>J</td><td>I</td><td>A</td><td>I</td><td>S</td><td>H</td><td>W</td><td>P</td><td>F</td><td>F</td><td>G</td></tr><tr><td>A</td><td>A</td><td>C</td><td>H</td><td>F</td><td>H</td><td>G</td><td>M</td><td>E</td><td>W</td><td>F</td><td>Y</td><td>W</td><td>A</td><td>I</td></tr><tr><td>D</td><td>N</td><td>P</td><td>P</td><td>I</td><td>A</td><td>U</td><td>F</td><td>I</td><td>W</td><td>V</td><td>O</td><td>Y</td><td>M</td><td>P</td></tr><tr><td>P</td><td>D</td><td>P</td><td>S</td><td>R</td><td>E</td><td>T</td><td>T</td><td>E</td><td>L</td><td>G</td><td>D</td><td>T</td><td>W</td><td>S</td></tr><tr><td>Y</td><td>G</td><td>V</td><td>K</td><td>X</td><td>G</td><td>D</td><td>O</td><td>M</td><td>P</td><td>K</td><td>R</td><td>W</td><td>T</td><td>F</td></tr></table></div><div class='word-list'><h3>Find these words:</h3><ul><li>LETTERS</li><li>PUZZLE</li><li>SEARCH</li><li>HIDDEN</li><li>WORD</li><li>GAME</li><li>FIND</li></ul></div></div></body></html>",
    "image": {
      "imageName": "84c52d5f-3714-4a53-9fc3-44eaa63dc2b1_puzzle.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve.appspot.com/wordsearch/84c52d5f-3714-4a53-9fc3-44eaa63dc2b1_puzzle.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1764735796&Signature=UoJAmmHhoaWb93%2BQK8W%2BhHISt1c3mW7Vtl4M8b4Pd7ThQe%2BTMgh2shEwsdWc5T04P5ZFpwgKD%2BnG9HzPjl94F1RjGcJGaCyO4PqGsfaGgLYCKpIDMfbPAs1yd8GYgwQk5NavIJPbIhxbS3LkgGjgT5UlM6Fk6WARoBOmRAoZwSgOpg7MvG%2BfjIj%2FbdzB8e5B79J%2FvmVu0orZ5BQOvHhTqPLAwZAqpRPaO3P1N%2BWYAs276kRMufxWIVvrnSq1c3XPD1kurFn23d%2FJRKZH%2BxXb3ZJeg9zhP70%2BYZ6aB2o9KM0mImEGctC%2FGcjMYmu43gmAYCvQ3LBZKF0349FPZgDkrg%3D%3D",
      "expires": 1764735796252
    },
    "solutionImage": {
      "imageName": "1ccaca19-0271-40fe-8e87-e82101b13eab_solution.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve.appspot.com/wordsearch/1ccaca19-0271-40fe-8e87-e82101b13eab_solution.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1764735796&Signature=nbvSyoahzTD7QS6lMgB6v7RA6lwN8GJvgBKsFUAjO5bnjVpB4sImAbhW1MSQ5mnWehM%2BHqiFRN6h%2BQsG8cOuAO7Qh1mnpITOfnh2vQpkVdE1FGLbdLX73Lhc68t65NMvZ8G60PhObNVyNSl4gj%2BIRigS%2B4awaEage1yeyNsK7ZzxLnKbg5MQwBk264GgrYU%2BzwS%2BE9oc%2FlD%2F5u0cmk6fFwsg3TFZiBbXRh7BIeTEecF6iFHQO75S0T3qnOD83XIumqoxN8gmrBnnOdkiKjJO1EJ1mjCH0r%2BY%2FuHbCCJQrm%2BxVgCBVJPTlJVRDpmCEC5qrCjddvqvaQGXkrR46K9U2w%3D%3D",
      "expires": 1764735796812
    }
  }
}
```

---

## Error Handling

The API client provides comprehensive error handling through the `WordsearchAPIClientError` exception. Here are some examples:

### Basic Error Handling

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient, WordsearchAPIClientError

api = WordsearchAPIClient("[YOUR_API_KEY]")

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

try:
    result = api.execute(query)
    print("Success!")
    print(result)
except WordsearchAPIClientError as e:
    print(f"API Error: {e.message}")
    if e.status_code:
        print(f"Status Code: {e.status_code}")
    if e.response:
        print(f"Response: {e.response}")
```

### Handling Specific Error Types

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient, WordsearchAPIClientError

api = WordsearchAPIClient("[YOUR_API_KEY]")

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

try:
    result = api.execute(query)

    # Check for successful response
    if result.get('status') == 'success':
        print("Request successful!")
        print(result.get('data'))
    else:
        print(f"API returned an error: {result.get('error')}")

except WordsearchAPIClientError as e:
    # Handle API client errors
    if e.status_code == 401:
        print("Unauthorized: Invalid API key")
    elif e.status_code == 429:
        print("Rate limit exceeded")
    elif e.status_code >= 500:
        print("Server error - please try again later")
    else:
        print(f"API error: {e.message}")
except Exception as e:
    # Handle unexpected errors
    print(f"Unexpected error: {str(e)}")
```

### Using Context Manager (Recommended)

The client supports the context manager protocol for automatic resource cleanup:

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient, WordsearchAPIClientError

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

# Using context manager ensures proper cleanup
with WordsearchAPIClient("[YOUR_API_KEY]") as api:
    try:
        result = api.execute(query)
        print(result)
    except WordsearchAPIClientError as e:
        print(f"Error: {e.message}")
# Session is automatically closed here
```

---

## Advanced Features

### Debug Mode

Enable debug logging to see detailed request and response information:

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient

# Enable debug mode
api = WordsearchAPIClient("[YOUR_API_KEY]", debug=True)

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

# Debug information will be printed to console
result = api.execute(query)
```

### Manual Session Management

If you need to manually manage the session lifecycle:

```python
from apiverve_wordsearchgenerator.apiClient import WordsearchAPIClient

api = WordsearchAPIClient("[YOUR_API_KEY]")

query = {
    "words": ["PUZZLE","SEARCH","WORD","GAME","FIND","HIDDEN","LETTERS"],
    "size": 15,
    "difficulty": "medium"
}

try:
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=readme) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
