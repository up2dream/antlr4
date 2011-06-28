package org.antlr.v4.tool;

/** the various kinds of labels. t=type, id=ID, types+=type ids+=ID */
public enum LabelType {
    RULE_LABEL,
    TOKEN_LABEL,
    RULE_LIST_LABEL,
    TOKEN_LIST_LABEL,
    LEXER_STRING_LABEL,         // used in lexer for x='a'
    SUBRULE_LABEL,              // x=(...)
    SUBRULE_LIST_LABEL,         // x+=(...)
    WILDCARD_TREE_LABEL,        // Used in tree grammar x=.
    WILDCARD_TREE_LIST_LABEL    // Used in tree grammar x+=.
    ;
}