# [Word Search Generator API](https://apiverve.com/marketplace/wordsearch?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)

Word Search Generator is a word search API that creates customizable word search puzzles with configurable grid size, word placement, and difficulty levels.

The Word Search Generator API provides a simple, reliable way to integrate word search generator functionality into your applications. Built for developers who need production-ready word search generator capabilities without the complexity of building from scratch.

**[View API Details →](https://apiverve.com/marketplace/wordsearch?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)**

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![API Status](https://img.shields.io/badge/Status-Active-green.svg)](https://apiverve.com/marketplace/wordsearch?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
[![Method](https://img.shields.io/badge/Method-POST-blue.svg)](#)
[![Platform](https://img.shields.io/badge/Platform-Multi--Platform-orange.svg)](#installation)

**Available on:**
[![npm](https://img.shields.io/badge/npm-CB3837?style=flat&logo=npm&logoColor=white)](https://www.npmjs.com/package/@apiverve/wordsearch)
[![NuGet](https://img.shields.io/badge/NuGet-004880?style=flat&logo=nuget&logoColor=white)](https://www.nuget.org/packages/APIVerve.API.WordSearchGenerator)
[![PyPI](https://img.shields.io/badge/PyPI-3776AB?style=flat&logo=python&logoColor=white)](https://pypi.org/project/apiverve-wordsearch/)
[![RubyGems](https://img.shields.io/badge/RubyGems-E9573F?style=flat&logo=rubygems&logoColor=white)](https://rubygems.org/gems/apiverve_wordsearch)
[![Packagist](https://img.shields.io/badge/Packagist-F28D1A?style=flat&logo=packagist&logoColor=white)](https://packagist.org/packages/apiverve/wordsearch)
[![Go](https://img.shields.io/badge/Go-00ADD8?style=flat&logo=go&logoColor=white)](#-go)
[![Dart](https://img.shields.io/badge/Dart-0175C2?style=flat&logo=dart&logoColor=white)](https://pub.dev/packages/apiverve_wordsearch)
[![JitPack](https://img.shields.io/badge/JitPack-2E7D32?style=flat&logo=android&logoColor=white)](#-android-jitpack)

---

## Quick Start

### Using JavaScript

```javascript
async function callWordSearchGeneratorAPI() {
    try {
        const requestBody = {
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

        const response = await fetch('https://api.apiverve.com/v1/wordsearch', {
            method: 'POST',
            headers: {
                'x-api-key': 'YOUR_API_KEY_HERE',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestBody)
        });

        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.error('Error:', error);
    }
}

callWordSearchGeneratorAPI();
```

### Using cURL

```bash
curl -X POST "https://api.apiverve.com/v1/wordsearch" \
  -H "x-api-key: YOUR_API_KEY_HERE" \
  -H "Content-Type: application/json" \
  -d '{
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
}'
```

**Get your API key:** [https://apiverve.com](https://apiverve.com)

**📁 For more examples, see the [examples folder](./examples/)**

---

## Installation

Choose your preferred programming language:

### 📦 NPM (JavaScript/Node.js)

```bash
npm install @apiverve/wordsearch
```

[**View NPM Package →**](https://www.npmjs.com/package/@apiverve/wordsearch) | [**Package Code →**](./npm/)

---

### 🔷 NuGet (.NET/C#)

```bash
dotnet add package APIVerve.API.WordSearchGenerator
```

[**View NuGet Package →**](https://www.nuget.org/packages/APIVerve.API.WordSearchGenerator) | [**Package Code →**](./nuget/)

---

### 🐍 Python (PyPI)

```bash
pip install apiverve-wordsearch
```

[**View PyPI Package →**](https://pypi.org/project/apiverve-wordsearch/) | [**Package Code →**](./python/)

---

### 💎 Ruby (RubyGems)

```bash
gem install apiverve_wordsearch
```

[**View RubyGems Package →**](https://rubygems.org/gems/apiverve_wordsearch) | [**Package Code →**](./ruby/)

---

### 🐘 PHP (Packagist)

```bash
composer require apiverve/wordsearch
```

[**View Packagist Package →**](https://packagist.org/packages/apiverve/wordsearch) | [**Package Code →**](./php/)

---

### 🎯 Dart (pub.dev)

```bash
dart pub add apiverve_wordsearch
```

[**View pub.dev Package →**](https://pub.dev/packages/apiverve_wordsearch) | [**Package Code →**](./dart/)

---

### 🤖 Android (JitPack)

```gradle
implementation 'com.github.apiverve:wordsearch-api:1.0.0'
```

[**Package Code →**](./android/)

---

### 🐹 Go

```bash
go get github.com/apiverve/wordsearch-api/go
```

[**Package Code →**](./go/)

---

## Why Use This API?

| Feature | Benefit |
|---------|---------|
| **Multi-language SDKs** | Native packages for JavaScript, Python, C#, Go, and Android |
| **Simple Integration** | Single API key authentication, consistent response format |
| **Production Ready** | 99.9% uptime SLA, served from 24 global regions |
| **Comprehensive Docs** | Full examples, OpenAPI spec, and dedicated support |

---

## Documentation

- 🏠 **API Home:** [Word Search Generator API](https://apiverve.com/marketplace/wordsearch?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
- 📚 **API Reference:** [docs.apiverve.com/ref/wordsearch](https://docs.apiverve.com/ref/wordsearch)
- 📖 **OpenAPI Spec:** [openapi.yaml](./openapi.yaml)
- 💡 **Examples:** [examples/](./examples/)

---

## What Can You Build?

The Word Search Generator API is commonly used for:

- **Web Applications** - Add word search generator features to your frontend or backend
- **Mobile Apps** - Native SDKs for Android development
- **Automation** - Integrate with n8n, Zapier, or custom workflows
- **SaaS Products** - Enhance your product with word search generator capabilities
- **Data Pipelines** - Process and analyze data at scale

---

## API Reference

### Authentication
All requests require an API key in the header:
```
x-api-key: YOUR_API_KEY_HERE
```

Get your API key: [https://apiverve.com](https://apiverve.com)

### Response Format

Every APIVerve endpoint returns the same envelope — check `status`, then read `data`:

```json
{
  "status": "ok",
  "error": null,
  "data": { ... }
}
```

### Example Response

A real response from the Word Search Generator API:

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

## Support & Community

- 🏠 **API Home**: [Word Search Generator API](https://apiverve.com/marketplace/wordsearch?utm_source&#x3D;github&amp;utm_medium&#x3D;referral&amp;utm_content&#x3D;readme)
- 💬 **Support**: [https://apiverve.com/contact](https://apiverve.com/contact)
- 🐛 **Issues**: [GitHub Issues](../../issues)
- 📖 **Documentation**: [https://docs.apiverve.com](https://docs.apiverve.com)
- 🌐 **Website**: [https://apiverve.com](https://apiverve.com)

---

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

---

## Security

For security concerns, please review our [Security Policy](SECURITY.md).

---

## License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Built with ❤️ by [APIVerve](https://apiverve.com)

Copyright © 2026 APIVerve. All rights reserved.
