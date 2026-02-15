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
        /// </summary>
        [JsonProperty("words")]
        public string Words { get; set; }

        /// <summary>
        /// Grid size
        /// </summary>
        [JsonProperty("size")]
        public string Size { get; set; }

        /// <summary>
        /// Difficulty level (affects word directions)
        /// </summary>
        [JsonProperty("difficulty")]
        public string Difficulty { get; set; }
    }
}
