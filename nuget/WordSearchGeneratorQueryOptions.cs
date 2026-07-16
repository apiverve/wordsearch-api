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
        public List<string> Words { get; set; }

        /// <summary>
        /// Grid size
        /// </summary>
        [JsonProperty("size")]
        public int? Size { get; set; }

        /// <summary>
        /// Difficulty level (affects word directions)
        /// </summary>
        [JsonProperty("difficulty")]
        public string Difficulty { get; set; }

        /// <summary>
        /// Set to true to generate a downloadable puzzle image
        /// </summary>
        [JsonProperty("image")]
        public bool? Image { get; set; }

        /// <summary>
        /// Set to true to generate a downloadable solution image
        /// </summary>
        [JsonProperty("solutionImage")]
        public bool? SolutionImage { get; set; }
    }
}
