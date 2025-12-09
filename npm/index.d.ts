declare module '@apiverve/wordsearch' {
  export interface wordsearchOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface wordsearchResponse {
    status: string;
    error: string | null;
    data: WordSearchGeneratorData;
    code?: number;
  }


  interface WordSearchGeneratorData {
      grid:          Array<string[]>;
      words:         Word[];
      wordCount:     number;
      size:          number;
      difficulty:    string;
      html:          string;
      image:         Image;
      solutionImage: Image;
  }
  
  interface Image {
      imageName:   string;
      format:      string;
      downloadURL: string;
      expires:     number;
  }
  
  interface Word {
      word:      string;
      start:     Start;
      direction: string;
  }
  
  interface Start {
      row: number;
      col: number;
  }

  export default class wordsearchWrapper {
    constructor(options: wordsearchOptions);

    execute(callback: (error: any, data: wordsearchResponse | null) => void): Promise<wordsearchResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: wordsearchResponse | null) => void): Promise<wordsearchResponse>;
    execute(query?: Record<string, any>): Promise<wordsearchResponse>;
  }
}
