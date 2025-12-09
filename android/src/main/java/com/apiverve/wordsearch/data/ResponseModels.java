// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     WordSearchGeneratorData data = Converter.fromJsonString(jsonString);

package com.apiverve.wordsearch.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static WordSearchGeneratorData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(WordSearchGeneratorData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(WordSearchGeneratorData.class);
        writer = mapper.writerFor(WordSearchGeneratorData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// WordSearchGeneratorData.java

package com.apiverve.wordsearch.data;

import com.fasterxml.jackson.annotation.*;

public class WordSearchGeneratorData {
    private String[][] grid;
    private Word[] words;
    private long wordCount;
    private long size;
    private String difficulty;
    private String html;
    private Image image;
    private Image solutionImage;

    @JsonProperty("grid")
    public String[][] getGrid() { return grid; }
    @JsonProperty("grid")
    public void setGrid(String[][] value) { this.grid = value; }

    @JsonProperty("words")
    public Word[] getWords() { return words; }
    @JsonProperty("words")
    public void setWords(Word[] value) { this.words = value; }

    @JsonProperty("wordCount")
    public long getWordCount() { return wordCount; }
    @JsonProperty("wordCount")
    public void setWordCount(long value) { this.wordCount = value; }

    @JsonProperty("size")
    public long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(long value) { this.size = value; }

    @JsonProperty("difficulty")
    public String getDifficulty() { return difficulty; }
    @JsonProperty("difficulty")
    public void setDifficulty(String value) { this.difficulty = value; }

    @JsonProperty("html")
    public String getHTML() { return html; }
    @JsonProperty("html")
    public void setHTML(String value) { this.html = value; }

    @JsonProperty("image")
    public Image getImage() { return image; }
    @JsonProperty("image")
    public void setImage(Image value) { this.image = value; }

    @JsonProperty("solutionImage")
    public Image getSolutionImage() { return solutionImage; }
    @JsonProperty("solutionImage")
    public void setSolutionImage(Image value) { this.solutionImage = value; }
}

// Image.java

package com.apiverve.wordsearch.data;

import com.fasterxml.jackson.annotation.*;

public class Image {
    private String imageName;
    private String format;
    private String downloadURL;
    private long expires;

    @JsonProperty("imageName")
    public String getImageName() { return imageName; }
    @JsonProperty("imageName")
    public void setImageName(String value) { this.imageName = value; }

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("downloadURL")
    public String getDownloadURL() { return downloadURL; }
    @JsonProperty("downloadURL")
    public void setDownloadURL(String value) { this.downloadURL = value; }

    @JsonProperty("expires")
    public long getExpires() { return expires; }
    @JsonProperty("expires")
    public void setExpires(long value) { this.expires = value; }
}

// Word.java

package com.apiverve.wordsearch.data;

import com.fasterxml.jackson.annotation.*;

public class Word {
    private String word;
    private Start start;
    private String direction;

    @JsonProperty("word")
    public String getWord() { return word; }
    @JsonProperty("word")
    public void setWord(String value) { this.word = value; }

    @JsonProperty("start")
    public Start getStart() { return start; }
    @JsonProperty("start")
    public void setStart(Start value) { this.start = value; }

    @JsonProperty("direction")
    public String getDirection() { return direction; }
    @JsonProperty("direction")
    public void setDirection(String value) { this.direction = value; }
}

// Start.java

package com.apiverve.wordsearch.data;

import com.fasterxml.jackson.annotation.*;

public class Start {
    private long row;
    private long col;

    @JsonProperty("row")
    public long getRow() { return row; }
    @JsonProperty("row")
    public void setRow(long value) { this.row = value; }

    @JsonProperty("col")
    public long getCol() { return col; }
    @JsonProperty("col")
    public void setCol(long value) { this.col = value; }
}