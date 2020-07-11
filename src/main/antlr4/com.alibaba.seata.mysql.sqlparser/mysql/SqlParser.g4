grammar SqlParser;

AS                              : A S;
SELECT                       : S E L E C T;
FROM                        : F R O M;
TABLE                        : T A B L E;

fragment A      : [aA];
fragment B      : [bB];
fragment C      : [cC];
fragment D      : [dD];
fragment E      : [eE];
fragment F      : [fF];
fragment G      : [gG];
fragment H      : [hH];
fragment I      : [iI];
fragment J      : [jJ];
fragment K      : [kK];
fragment L      : [lL];
fragment M      : [mM];
fragment N      : [nN];
fragment O      : [oO];
fragment P      : [pP];
fragment Q      : [qQ];
fragment R      : [rR];
fragment S      : [sS];
fragment T      : [tT];
fragment U      : [uU];
fragment V      : [vV];
fragment W      : [wW];
fragment X      : [xX];
fragment Y      : [yY];
fragment Z      : [zZ];
fragment HEX_DIGIT:                  [0-9A-F];
fragment DEC_DIGIT:                  [0-9];
fragment LETTER:                         [a-zA-Z];

ID : ( 'A'..'Z' | 'a'..'z'| '*' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '*' | '0'..'9' )*;

tableName            : tmpName=ID;
column_name            :ID;

selectStatement:
       SELECT
        selectElements
        FROM tableSources
;


selectElements
    : (star='*' | selectElement ) (',' selectElement)*
    ;


tableSources
    : tableName (',' tableName)*
    ;

selectElement
    : fullColumnName (AS? uid)?      #selectColumnElement
    ;

uid
    : ID
    ;

fullColumnName
    : column_name
    ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines