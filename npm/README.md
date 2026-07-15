# Word Search Generator API

Word Search Generator creates customizable word search puzzles with configurable grid size, word placement, and difficulty levels.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)
[![npm version](https://img.shields.io/npm/v/@apiverve/wordsearch.svg)](https://www.npmjs.com/package/@apiverve/wordsearch)

This is a Javascript Wrapper for the [Word Search Generator API](https://apiverve.com/marketplace/wordsearch?utm_source=npm&utm_medium=readme)

---

## Installation

Using npm:
```shell
npm install @apiverve/wordsearch
```

Using yarn:
```shell
yarn add @apiverve/wordsearch
```

---

## Configuration

Before using the Word Search Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=npm&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=npm&utm_medium=readme)

The Word Search Generator API documentation is found here: [https://docs.apiverve.com/ref/wordsearch](https://docs.apiverve.com/ref/wordsearch?utm_source=npm&utm_medium=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const wordsearchAPI = require('@apiverve/wordsearch');
const api = new wordsearchAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  "words": [
    "PUZZLE",
    "SEARCH",
    "WORD",
    "GAME",
    "FIND",
    "HIDDEN",
    "LETTERS"
  ],
  "size": 15,
  "difficulty": "medium"
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  "words": [
    "PUZZLE",
    "SEARCH",
    "WORD",
    "GAME",
    "FIND",
    "HIDDEN",
    "LETTERS"
  ],
  "size": 15,
  "difficulty": "medium"
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  "words": [
    "PUZZLE",
    "SEARCH",
    "WORD",
    "GAME",
    "FIND",
    "HIDDEN",
    "LETTERS"
  ],
  "size": 15,
  "difficulty": "medium"
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
}
```

---

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "grid": [
      [
        "P",
        "C",
        "R",
        "J",
        "W",
        "R",
        "D",
        "K",
        "G",
        "D",
        "V",
        "F",
        "J",
        "B",
        "Q"
      ],
      [
        "J",
        "F",
        "O",
        "J",
        "E",
        "B",
        "X",
        "I",
        "A",
        "A",
        "S",
        "S",
        "H",
        "X",
        "G"
      ],
      [
        "L",
        "N",
        "N",
        "Q",
        "L",
        "X",
        "G",
        "E",
        "M",
        "X",
        "F",
        "Q",
        "X",
        "V",
        "B"
      ],
      [
        "S",
        "J",
        "Y",
        "L",
        "X",
        "Z",
        "T",
        "X",
        "E",
        "A",
        "K",
        "M",
        "X",
        "C",
        "Y"
      ],
      [
        "S",
        "G",
        "F",
        "O",
        "E",
        "J",
        "F",
        "X",
        "M",
        "W",
        "V",
        "E",
        "I",
        "M",
        "X"
      ],
      [
        "W",
        "D",
        "V",
        "Y",
        "D",
        "T",
        "T",
        "N",
        "F",
        "U",
        "K",
        "L",
        "P",
        "C",
        "T"
      ],
      [
        "E",
        "R",
        "H",
        "M",
        "B",
        "N",
        "T",
        "B",
        "M",
        "A",
        "D",
        "Z",
        "X",
        "A",
        "D"
      ],
      [
        "D",
        "O",
        "G",
        "S",
        "Y",
        "E",
        "B",
        "E",
        "T",
        "H",
        "I",
        "Z",
        "K",
        "D",
        "P"
      ],
      [
        "F",
        "W",
        "S",
        "E",
        "A",
        "R",
        "C",
        "H",
        "R",
        "G",
        "X",
        "U",
        "B",
        "Y",
        "D"
      ],
      [
        "H",
        "C",
        "G",
        "E",
        "N",
        "B",
        "K",
        "E",
        "L",
        "S",
        "E",
        "P",
        "O",
        "E",
        "N"
      ],
      [
        "P",
        "A",
        "D",
        "W",
        "D",
        "D",
        "K",
        "A",
        "T",
        "E",
        "A",
        "A",
        "G",
        "R",
        "I"
      ],
      [
        "C",
        "T",
        "C",
        "E",
        "Q",
        "W",
        "S",
        "Q",
        "O",
        "W",
        "X",
        "R",
        "O",
        "E",
        "F"
      ],
      [
        "P",
        "E",
        "S",
        "I",
        "F",
        "L",
        "G",
        "E",
        "N",
        "V",
        "X",
        "I",
        "V",
        "K",
        "I"
      ],
      [
        "T",
        "G",
        "G",
        "Z",
        "X",
        "A",
        "D",
        "A",
        "F",
        "S",
        "U",
        "D",
        "N",
        "S",
        "P"
      ],
      [
        "Z",
        "J",
        "T",
        "L",
        "N",
        "E",
        "D",
        "D",
        "I",
        "H",
        "Z",
        "O",
        "A",
        "A",
        "A"
      ]
    ],
    "words": [
      {
        "word": "LETTERS",
        "start": {
          "row": 3,
          "col": 3
        },
        "direction": "diagonal-down-right"
      },
      {
        "word": "PUZZLE",
        "start": {
          "row": 9,
          "col": 11
        },
        "direction": "up"
      },
      {
        "word": "SEARCH",
        "start": {
          "row": 8,
          "col": 2
        },
        "direction": "right"
      },
      {
        "word": "HIDDEN",
        "start": {
          "row": 14,
          "col": 9
        },
        "direction": "left"
      },
      {
        "word": "WORD",
        "start": {
          "row": 8,
          "col": 1
        },
        "direction": "up"
      },
      {
        "word": "GAME",
        "start": {
          "row": 0,
          "col": 8
        },
        "direction": "down"
      },
      {
        "word": "FIND",
        "start": {
          "row": 11,
          "col": 14
        },
        "direction": "up"
      }
    ],
    "wordCount": 7,
    "size": 15,
    "difficulty": "medium",
    "html": "<html><head><title>Word Search Puzzle</title><style>body {font-family: Arial, sans-serif; padding: 20px;}.container {display: flex; gap: 40px;}table {border-collapse: collapse;}td {width: 30px; height: 30px; text-align: center; font-size: 18px; font-weight: bold; border: 1px solid #ccc;}.word-list {font-size: 16px;}.word-list h3 {margin-bottom: 10px;}.word-list ul {list-style: none; padding: 0;}.word-list li {margin: 5px 0;}</style></head><body><div class='container'><div><table><tr><td>P</td><td>C</td><td>R</td><td>J</td><td>W</td><td>R</td><td>D</td><td>K</td><td>G</td><td>D</td><td>V</td><td>F</td><td>J</td><td>B</td><td>Q</td></tr><tr><td>J</td><td>F</td><td>O</td><td>J</td><td>E</td><td>B</td><td>X</td><td>I</td><td>A</td><td>A</td><td>S</td><td>S</td><td>H</td><td>X</td><td>G</td></tr><tr><td>L</td><td>N</td><td>N</td><td>Q</td><td>L</td><td>X</td><td>G</td><td>E</td><td>M</td><td>X</td><td>F</td><td>Q</td><td>X</td><td>V</td><td>B</td></tr><tr><td>S</td><td>J</td><td>Y</td><td>L</td><td>X</td><td>Z</td><td>T</td><td>X</td><td>E</td><td>A</td><td>K</td><td>M</td><td>X</td><td>C</td><td>Y</td></tr><tr><td>S</td><td>G</td><td>F</td><td>O</td><td>E</td><td>J</td><td>F</td><td>X</td><td>M</td><td>W</td><td>V</td><td>E</td><td>I</td><td>M</td><td>X</td></tr><tr><td>W</td><td>D</td><td>V</td><td>Y</td><td>D</td><td>T</td><td>T</td><td>N</td><td>F</td><td>U</td><td>K</td><td>L</td><td>P</td><td>C</td><td>T</td></tr><tr><td>E</td><td>R</td><td>H</td><td>M</td><td>B</td><td>N</td><td>T</td><td>B</td><td>M</td><td>A</td><td>D</td><td>Z</td><td>X</td><td>A</td><td>D</td></tr><tr><td>D</td><td>O</td><td>G</td><td>S</td><td>Y</td><td>E</td><td>B</td><td>E</td><td>T</td><td>H</td><td>I</td><td>Z</td><td>K</td><td>D</td><td>P</td></tr><tr><td>F</td><td>W</td><td>S</td><td>E</td><td>A</td><td>R</td><td>C</td><td>H</td><td>R</td><td>G</td><td>X</td><td>U</td><td>B</td><td>Y</td><td>D</td></tr><tr><td>H</td><td>C</td><td>G</td><td>E</td><td>N</td><td>B</td><td>K</td><td>E</td><td>L</td><td>S</td><td>E</td><td>P</td><td>O</td><td>E</td><td>N</td></tr><tr><td>P</td><td>A</td><td>D</td><td>W</td><td>D</td><td>D</td><td>K</td><td>A</td><td>T</td><td>E</td><td>A</td><td>A</td><td>G</td><td>R</td><td>I</td></tr><tr><td>C</td><td>T</td><td>C</td><td>E</td><td>Q</td><td>W</td><td>S</td><td>Q</td><td>O</td><td>W</td><td>X</td><td>R</td><td>O</td><td>E</td><td>F</td></tr><tr><td>P</td><td>E</td><td>S</td><td>I</td><td>F</td><td>L</td><td>G</td><td>E</td><td>N</td><td>V</td><td>X</td><td>I</td><td>V</td><td>K</td><td>I</td></tr><tr><td>T</td><td>G</td><td>G</td><td>Z</td><td>X</td><td>A</td><td>D</td><td>A</td><td>F</td><td>S</td><td>U</td><td>D</td><td>N</td><td>S</td><td>P</td></tr><tr><td>Z</td><td>J</td><td>T</td><td>L</td><td>N</td><td>E</td><td>D</td><td>D</td><td>I</td><td>H</td><td>Z</td><td>O</td><td>A</td><td>A</td><td>A</td></tr></table></div><div class='word-list'><h3>Find these words:</h3><ul><li>LETTERS</li><li>PUZZLE</li><li>SEARCH</li><li>HIDDEN</li><li>WORD</li><li>GAME</li><li>FIND</li></ul></div></div></body></html>",
    "image": {
      "imageName": "0ce84c70-c791-40f9-adfa-2ad3823667f7_puzzle.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve/APIData/wordsearch/0ce84c70-c791-40f9-adfa-2ad3823667f7_puzzle.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1766010772&Signature=QOHSnr40T1DxKtie7xCSTwnqNwfgaur%2BUZDwPf8xhgiaynJPDQjvrVJwZBlkuSFXQFyd212HYyui%2BMUjHIVhMvL8TaGUucqOvXhsaXXl9p5vzQhGsGP2crtP8U94NpXonrL0GjnmFmFFaQOJELbcCqMLfTl5XjArtNsMTp0%2Bj3b8DeL6ljMZe09sRgL5i7cslA%2BLljRRX20Dbd2%2BuqR1r2aGY6pMZEqr7djDDF3uLNnyPq8M2wKPX243FASrcl3URyXZMkVduPYvkwIxvGkcOoeE7GrZo%2FnpOElZgbwevDCklXJ3fS6Ij2ffkLlYSrDNM11VSYUrU1fzgfHX2w%2F5ew%3D%3D",
      "expires": 1766010772936
    },
    "solutionImage": {
      "imageName": "b4dc1d71-86e4-4331-af3b-01295373b772_solution.png",
      "format": ".png",
      "downloadURL": "https://storage.googleapis.com/apiverve/APIData/wordsearch/b4dc1d71-86e4-4331-af3b-01295373b772_solution.png?GoogleAccessId=635500398038-compute%40developer.gserviceaccount.com&Expires=1766010773&Signature=j8897QcmWY1g4fKyE4JUEL4RZ6OCXJCCRmB04DFCpjFOW4vUDfgc62cwJDIBZsCcnbFzTfShMekQJFvrie8MHR59VtbYD58XXI7RPRbxjjEdfZ6exdiRgN%2BXZ%2B%2Ff5L7DksaYC%2Bf6FL80REs4Vb7C%2B0PBlRa%2FBpqo%2FcHXL4An5dIsUKyzXLNrDE6AvYXIyiKNYRcsfTN8g7ekXxqM4uI5XYYF3Kl4KlORrVs395S421Bk1j9Qpet04lI7vTe7dwQIDimuOshA56LfhjN5OK%2FGCxyC0IAJ4cTZcN52ggkeEQSX%2BOgX8Sy%2B6%2BsM7YmkBOVeB%2FKlO7CIX1rKcO5oFOzN8Q%3D%3D",
      "expires": 1766010773937
    }
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=npm&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=npm&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=npm&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=npm&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
