declare module '@apiverve/wordsearch' {
  export interface wordsearchOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface wordsearchResponse {
    status: string;
    error: string | null;
    data: WordSearchGeneratorData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface WordSearchGeneratorData {
      grid:          Array<(null | string)[]>;
      words:         Word[];
      wordCount:     number | null;
      size:          number | null;
      difficulty:    null | string;
      html:          null | string;
      image:         Image;
      solutionImage: Image;
  }
  
  interface Image {
      imageName:   null | string;
      format:      null | string;
      downloadURL: null | string;
      expires:     number | null;
  }
  
  interface Word {
      word:      null | string;
      start:     Start;
      direction: null | string;
  }
  
  interface Start {
      row: number | null;
      col: number | null;
  }

  export default class wordsearchWrapper {
    constructor(options: wordsearchOptions);

    execute(callback: (error: any, data: wordsearchResponse | null) => void): Promise<wordsearchResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: wordsearchResponse | null) => void): Promise<wordsearchResponse>;
    execute(query?: Record<string, any>): Promise<wordsearchResponse>;
  }
}
