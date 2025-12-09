using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.WordSearchGenerator
{
    /// <summary>
    /// Query options for the Word Search Generator API
    /// </summary>
    public class WordSearchGeneratorQueryOptions
    {
        /// <summary>
        /// Array of words to hide in the puzzle (3-20 words)
        /// Example: ["HELLO", "WORLD", "PUZZLE"]
        /// </summary>
        [JsonProperty("words")]
        public string Words { get; set; }

        /// <summary>
        /// Grid size (10-30)
        /// Example: 15
        /// </summary>
        [JsonProperty("size")]
        public string Size { get; set; }

        /// <summary>
        /// Difficulty: easy, medium, hard (affects word directions)
        /// Example: medium
        /// </summary>
        [JsonProperty("difficulty")]
        public string Difficulty { get; set; }
    }
}
