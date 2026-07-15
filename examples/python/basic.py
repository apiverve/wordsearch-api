"""
Word Search Generator API - Basic Usage Example

This example demonstrates the basic usage of the Word Search Generator API.
API Documentation: https://docs.apiverve.com/ref/wordsearch
"""

import os
import requests
import json

API_KEY = os.getenv('APIVERVE_API_KEY', 'YOUR_API_KEY_HERE')
API_URL = 'https://api.apiverve.com/v1/wordsearch'

def call_wordsearch_api():
    """
    Make a POST request to the Word Search Generator API
    """
    try:
        # Request body
        request_body &#x3D; {
    &#x27;words&#x27;: [
        &#x27;PUZZLE&#x27;,
        &#x27;SEARCH&#x27;,
        &#x27;WORD&#x27;,
        &#x27;GAME&#x27;,
        &#x27;FIND&#x27;,
        &#x27;HIDDEN&#x27;,
        &#x27;LETTERS&#x27;
    ],
    &#x27;size&#x27;: 15,
    &#x27;difficulty&#x27;: &#x27;medium&#x27;
}

        headers = {
            'x-api-key': API_KEY,
            'Content-Type': 'application/json'
        }

        response = requests.post(API_URL, headers=headers, json=request_body)

        # Raise exception for HTTP errors
        response.raise_for_status()

        data = response.json()

        # Check API response status
        if data.get('status') == 'ok':
            print('✓ Success!')
            print('Response data:', json.dumps(data['data'], indent=2))
            return data['data']
        else:
            print('✗ API Error:', data.get('error', 'Unknown error'))
            return None

    except requests.exceptions.RequestException as e:
        print(f'✗ Request failed: {e}')
        return None

if __name__ == '__main__':
    print('📤 Calling Word Search Generator API...\n')

    result = call_wordsearch_api()

    if result:
        print('\n📊 Final Result:')
        print(json.dumps(result, indent=2))
    else:
        print('\n✗ API call failed')
